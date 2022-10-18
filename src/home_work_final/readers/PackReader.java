package home_work_final.readers;

import home_work_5.comparators.NameComparator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PackReader {
    /**
     * Конструктор при вызове которого анализирует переданную папку и начинает запись в файл начиная от времени создания класса
     * Также создает fixedThreadPool с 4 потоками
     * @param path - путь к папке
     * @throws IOException
     */
    public PackReader(String path) throws IOException {
        analisePack(path);
        PrintWriter pw = new PrintWriter(new FileWriter("HomeWork\\outputs\\resultsOfSearching_"
                + LocalDateTime.now().getDayOfMonth()
                + "." + LocalDateTime.now().getMonthValue()
                + "." + LocalDateTime.now().getYear()
                +".txt", true));
        pw.print("\nИстория поиска от " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + " " + LocalDateTime.now().getDayOfMonth()
                + "." + LocalDateTime.now().getMonthValue()
                + "." + LocalDateTime.now().getYear() + ":\n");
        pw.close();
    }
    private final BookReader bookReader = new BookReader();

    public Map<String, File> getBooksWithNames() {
        return Map.copyOf(booksWithNames);
    }

    private final Map<String, File> booksWithNames = new TreeMap<>(new NameComparator());

    private final ExecutorService service = Executors.newFixedThreadPool(4);

    /**
     * Анализирует папку на наличие в ней текстовых файлов и помещает их в Map. Если названия файлов совпадают, то переопределяет их имя для пользователя
     * @param path - путь к папке
     */
    public void analisePack(String path) {
        File startFile = new File(path);
        File[] buffer = startFile.listFiles();
        if (buffer != null) {
            for (File file : buffer) {
                if (file.isDirectory()) {
                    analisePack(file.getPath());
                } else {
                    if (file.getName().endsWith(".txt")) {
                        if (booksWithNames.containsKey(file.getName().substring(0, file.getName().length() - 4))) {
                            String newName;
                            int i = 1;
                            while (booksWithNames.containsKey(newName = file.getName().substring(0, file.getName().length() - 4) + "(" + i + ")")) {
                                ++i;
                            }
                            booksWithNames.put(newName, file);
                        } else {
                            booksWithNames.put(file.getName().substring(0, file.getName().length() - 4), file);
                        }
                    }
                }
            }
        }
    }

    /**
     * Возвращает список текстовых файлов в виде удобного списка
     * @return - список
     */
    public String getBooks() {
        StringBuilder str = new StringBuilder();
        for (String names : booksWithNames.keySet()) {
            str.append(names).append("\n");
        }
        return str.toString();
    }

    /**
     * Метод сканирующий файл с названием из Map на наличие слова word
     * @param name - имя файла
     * @param word - искомое слово
     */
    public void scanBook(String name, String word) {
        try {
            long amount = bookReader.scan(booksWithNames.get(name).getPath(), word);
        PrintWriter pw = new PrintWriter(new FileWriter("HomeWork\\outputs\\resultsOfSearching_"
                + LocalDateTime.now().getDayOfMonth()
                + "." + LocalDateTime.now().getMonthValue()
                + "." + LocalDateTime.now().getYear()
                +".txt", true));
        if (amount != 0) {
            pw.println(name + " - " + word + " - " + amount);
            pw.close();
        }
        } catch (NullPointerException e) {
            System.out.println("Такой книги не было в списке");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Сканирует каждый файл из Map на наличие искомого слова
     * @param word - искомое слово
     */
    public void scanEveryBook(String word) {
        for (String name : booksWithNames.keySet()) {
            service.submit(() -> scanBook(name, word));
        }
    }

    /**
     * Завершает работу потоков
     */
    public void end() {
        service.shutdown();
    }
}
