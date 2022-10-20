package home_work_final.readers;

import home_work_final.api.IRowReader;
import home_work_final.dto.Book;

import java.util.Arrays;

public class RowReader implements IRowReader {
    /**
     * Анализирует строку на наличие искомого слова
     * @param line анализируемая строка
     * @param word искомое слово
     * @return количество раз, которое встретилось слово в строке
     */
    public long search(String line, String word) {
        long counter = 0;
        line = line.replaceAll("\\.", " ")
                .replaceAll(",", " ")
                .replaceAll("!", " ")
                .replaceAll("\\)", " ")
                .replaceAll("\\(", " ")
                .replaceAll("\"", " ")
                .replaceAll("\\?", " ")
                .replaceAll(";" , " ")
                .replaceAll("\\n", " ")
                .replaceAll(":", " ")
                .replaceAll("--", " ")
                .replaceAll(" -", " ")
                .replaceAll("- ", " ");
        if (line.endsWith("-")) {
            line = line.substring(0, line.length()-1);
        }
        if (line.startsWith("-")) {
            line = line.substring(1);
        }
        while (line.contains("  ")) {
            line = line.replaceAll(" {2}", " ");
        }
        String[] wordsRow = line.split(" ");

        for (String p : wordsRow) {
            if (p.equals(word)) {
                ++counter;
            }
        }
        return counter;
    }

    /**
     * Анализирует строку на наличие слов. Все найденные слова помещает в Set уникальных слов и Map пар слово - количество,
     * являющимися полями объекта Book
     * @param line анализируемая строка
     * @param book объект Book, которому принадлежит данная строка
     */
    public void read(String line, Book book) {
        line = line.replaceAll("\\.", " ")
                .replaceAll(",", " ")
                .replaceAll("!", " ")
                .replaceAll("\\)", " ")
                .replaceAll("\\(", " ")
                .replaceAll("\"", " ")
                .replaceAll("\\?", " ")
                .replaceAll(";" , " ")
                .replaceAll("\\n", " ")
                .replaceAll(":", " ")
                .replaceAll("--", " ")
                .replaceAll(" -", " ")
                .replaceAll("- ", " ");
        if (line.endsWith("-")) {
            line = line.substring(0, line.length()-1);
        }
        if (line.startsWith("-")) {
            line = line.substring(1);
        }
        while (line.contains("  ")) {
            line = line.replaceAll(" {2}", " ");
        }
        String[] wordsRow = line.split(" ");

        book.getUniqueWords().addAll(Arrays.asList(wordsRow));
        for (String p : wordsRow) {
            if (!p.equals("")) {
                book.getWordsAndAmounts().putIfAbsent(p, 0);
                book.getWordsAndAmounts().computeIfPresent(p, (k, v) -> v + 1);
            }
        }
    }
}
