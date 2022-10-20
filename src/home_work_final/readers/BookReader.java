package home_work_final.readers;

import home_work_final.aditional.NewList;
import home_work_final.api.IBookReader;
import home_work_final.api.IRowReader;
import home_work_final.api.ISearchEngine;
import home_work_final.comparators.AmountComparator;
import home_work_final.dto.Book;
import home_work_final.searchers.RegExSearch;

import java.io.*;
import java.util.*;
/**
 * Класс позволяющий анализировать объекты Book
 */
public class BookReader implements IBookReader {

    public BookReader(IRowReader rowReader) {
        this.rowReader = rowReader;
        this.searchEngine = rowReader;
    }

    public BookReader(IRowReader rowReader, Book book) {
        this.rowReader = rowReader;
        this.searchEngine = rowReader;
        this.book = book;
    }

    /**
     * Конструктор позволяет определить каким ISearchEngine будет производиться анализ файла на определенное слово. По умолчанию это RowReader
     * @param rowReader - класс IRowReader который будет выполнять сканирование текста на все слова
     * @param searchEngine - класс ISearchEngine который будет выполнять сканирование текста на определенное слово
     * @param book - объект Book в котором хранятся свойства анализируемого файла
     */
    public BookReader(IRowReader rowReader, ISearchEngine searchEngine, Book book) {
        this.searchEngine = searchEngine;
        this.rowReader = rowReader;
        this.book = book;
    }

    private final IRowReader rowReader;

    private Book book;

    private final ISearchEngine searchEngine;


    public Set<String> getWords() {
        scan();
        return book.getUniqueWords();
    }

    /**
     * Метод позволяющий просканировать весь файл и записать все встреченные слова во внутренний Set объекта Book
     */
    public void scan() {
        if (!book.isScannedFlag()) {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(book.getBookFile().getPath()));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            String line;
            while (true) {
                try {
                    if ((line = reader.readLine()) == null) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                rowReader.read(line, book);
            }
            book.switchScannedFlag();
        }
    }
    /**
     * Метод позволяющий просканировать файл и посчитать количество использований заданного слова
     * @param word - искомое слово
     * @return - количество встреченного искомого слова
     */
    public long scan(String word) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(book.getBookFile().getPath()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        long searchingWordAmount = 0;
        while (true) {
            try {
                if ((line = reader.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            searchingWordAmount += searchEngine.search(line, word);
        }
        return searchingWordAmount;
    }
    /**
     * Метод возвращающий топ N слов по количеству использований в тексте
     * @param n - сколько верхних позиций покажется
     * @return - NewList содержащий N пар слово-количество
     */
    public List<Map.Entry<String, Integer>> getTopNWords(int n) {
        scan();
        List<Map.Entry<String, Integer>> list = new NewList(book.getWordsAndAmounts().entrySet());
        list.sort(new AmountComparator());
        list = new NewList(list.subList(0, n));
        return list;
    }

    /**
     * Создает объект BookReader, в который помещен объект Book для взаимодействия с его полями
     * @param book - объект Book
     * @return IBookReader, в который помещен объект Book
     */
    public IBookReader create(Book book) {
        return new BookReader(rowReader,searchEngine, book);
    }
}
