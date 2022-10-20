package home_work_final.readers;
import home_work_final.api.IBookReader;
import home_work_final.dto.Book;
import home_work_final.dto.ResultOfSearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.*;

public class PackReader {
    /**
     * Конструктор при вызове которого анализирует переданную папку и начинает запись в файл начиная от времени создания класса
     * @param path - путь к папке
     * @param bookReader - объект IBookReader, который будет сканировать текстовые файлы
     * @throws IOException - если в заданной папке нет текстовых файлов
     */
    public PackReader(String path, IBookReader bookReader) throws IOException {
        this.bookReader = bookReader;
        analisePackAndCollectBooks(path);
        if (booksWithNamesForUsers.isEmpty()) {
            throw new IOException();
        }
        PrintWriter pw = new PrintWriter(new FileWriter(savingPath + logFileName, true));
        pw.print("\nИстория поиска от " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + " " + LocalDateTime.now().getDayOfMonth()
                + "." + LocalDateTime.now().getMonthValue()
                + "." + LocalDateTime.now().getYear() + ":\n");
        pw.close();
    }
    /**
     * Конструктор при вызове которого анализирует переданную папку и начинает запись в файл начиная от времени создания класса
     * @param path - путь к папке
     * @param savingPath - измененный путь куда будет сохраняться Log-файл
     * @param bookReader - объект IBookReader, который будет сканировать текстовые файлы
     * @throws IOException - если в заданной папке нет текстовых файлов
     */
    public PackReader(String path, String savingPath, IBookReader bookReader) throws IOException {
        this.savingPath = savingPath;
        this.bookReader = bookReader;
        analisePackAndCollectBooks(path);
        if (booksWithNamesForUsers.isEmpty()) {
            throw new IOException();
        }
        PrintWriter pw = new PrintWriter(new FileWriter(savingPath + logFileName, true));
        pw.print("\nИстория поиска от " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + " " + LocalDateTime.now().getDayOfMonth()
                + "." + LocalDateTime.now().getMonthValue()
                + "." + LocalDateTime.now().getYear() + ":\n");
        pw.close();
    }
    /**
     * Конструктор при вызове которого анализирует переданную папку и начинает запись в файл начиная от времени создания класса
     * @param path - путь к папке
     * @param savingPath - измененный путь куда будет сохраняться Log-файл
     * @param logFileName - измененное название Log-файла
     * @param bookReader - объект IBookReader, который будет сканировать текстовые файлы
     * @throws IOException - если в заданной папке нет текстовых файлов
     */
    public PackReader(String path, String savingPath, String logFileName, IBookReader bookReader) throws IOException {
        this.savingPath = savingPath;
        this.bookReader = bookReader;
        this.logFileName = logFileName;
        analisePackAndCollectBooks(path);
        if (booksWithNamesForUsers.isEmpty()) {
            throw new IOException();
        }
        PrintWriter pw = new PrintWriter(new FileWriter(savingPath + logFileName, true));
        pw.print("\nИстория поиска от " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + " " + LocalDateTime.now().getDayOfMonth()
                + "." + LocalDateTime.now().getMonthValue()
                + "." + LocalDateTime.now().getYear() + ":\n");
        pw.close();
    }

    public Map<String, Book> getBooksWithNamesForUsers() {
        return Map.copyOf(booksWithNamesForUsers);
    }

    private final ConcurrentLinkedDeque<Future<ResultOfSearch>> listOfThreadTasks = new ConcurrentLinkedDeque<>() ;

    private final Map<String, Book> booksWithNamesForUsers = new HashMap<>();

    private boolean threadFlag = false;

    private String savingPath = "HomeWork\\outputs\\";

    private String logFileName =
            "resultsOfSearching_"
            + LocalDateTime.now().getDayOfMonth()
            + "." + LocalDateTime.now().getMonthValue()
            + "." + LocalDateTime.now().getYear()
            +".txt";

    private boolean shutdownFlag = false;

    private ExecutorService readingThreads;

    private final IBookReader bookReader;


    /**
     * Анализирует папку на наличие в ней текстовых файлов и помещает их в Map. Если названия файлов совпадают, то переопределяет их имя для пользователя
     * @param path - путь к папке
     */
    public void analisePackAndCollectBooks(String path) {
        File startFile = new File(path);
        File[] buffer = startFile.listFiles();
        if (buffer != null) {
            for (File file : buffer) {
                if (file.isDirectory()) {
                    analisePackAndCollectBooks(file.getPath());
                } else {
                    if (file.getName().endsWith(".txt")) {
                        compileBook(file);
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
        for (String names : booksWithNamesForUsers.keySet()) {
            str.append(names).append("\n");
        }
        return str.toString();
    }

    /**
     * Метод сканирующий файл объекта Book на наличие слова word
     * @param book - объект книги
     * @param word - искомое слово
     */
    public void scanBookAndWriteLog(Book book, String word) {
        writeLog(getResultFromBook(book, word));
    }

    /**
     * Метод сканирующий файл объекта Book на наличие слова word и возвращающий объект ResultOfResearch
     * @param book - объект Book для сканирования
     * @param word - искомое слово
     * @return - объект ResultOfResearch
     */
    public ResultOfSearch getResultFromBook(Book book, String word) {
            return new ResultOfSearch(book.getNameForUser(), word, bookReader.create(book).scan(word));
    }

    /**
     * Записывает результат сканирования объекта Book, сохраненный в объекте ResultOfSearch
     * @param result объект ResultOfSearch
     */
    public void writeLog(ResultOfSearch result) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(savingPath + logFileName, true));
            if (result.getAmountOfWord() != 0) {
                pw.println(result.getNameOfBookForUser() + " - " + result.getSearchingWord() + " - " + result.getAmountOfWord());
                pw.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Сканирует каждый файл из Map на наличие искомого слова
     * @param word - искомое слово
     */
    public void scanEveryBook(String word) {
        if (!threadFlag) {
            threadFlag = true;
            readingThreads = Executors.newFixedThreadPool(4);
            new Thread(this::startWritingLogs).start();
        }
        for (Book book : booksWithNamesForUsers.values()) {
            listOfThreadTasks.add(readingThreads.submit(() -> getResultFromBook(book, word)));
        }
    }

    /**
     * Метод для отдельного потока, каждую секунду проверяющий сделанную работу сканирующих потоков и записывающий их в файл
     */
    private void startWritingLogs() {
        do {
            for (Future<ResultOfSearch> p : listOfThreadTasks) {
                if (p.isDone()) {
                    try {
                        writeLog(p.get());
                        listOfThreadTasks.remove(p);
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (!shutdownFlag);
    }

    /**
     * Ожидает пока вся работа анализирующих потоков будет выполнена, или 15 секунд,
     * после чего завершает работу анализирующих и пишущего потоков
     */
    public void end() {
        try {
            readingThreads.shutdown();
            int i = 1;
            do {
                i++;
            } while (readingThreads.awaitTermination(i, TimeUnit.SECONDS) || i == 5);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        readingThreads.shutdownNow();
        shutdownFlag = true;
    }

    /**
     * Создает из файла объект книги и помещает ее в Map в паре с названием выдаваемым пользователю,
     * которое создается исходя из уже присутствующих названий в Map
     * @param file текстовый файл
     */
    public void compileBook(File file) {
        if (booksWithNamesForUsers.containsKey(cutTxt(file.getName()))) {
            String newName;
            int i = 1;
            while (booksWithNamesForUsers.containsKey(newName = cutTxt(file.getName()) + "(" + i + ")")) {
                ++i;
            }
            booksWithNamesForUsers.put(newName, new Book(newName, file));
        } else {
            booksWithNamesForUsers.put(cutTxt(file.getName()), new Book(cutTxt(file.getName()), file));
        }
    }

    /**
     * Обрезает последние 4 символа
     * @param name - текст из которого нужно вырезать символы
     * @return обрезанный текст
     */
    public String cutTxt(String name) {
        return name.substring(0, name.length() - 4);
    }
}
