package home_work_final.readers;

import home_work_final.aditional.NewList;
import home_work_final.api.ISearchEngine;
import home_work_final.comparators.AmountComparator;

import java.io.*;
import java.util.*;
/**
 * Класс позволяющий анализировать текстовые файлы
 */
public class BookReader {

    private final Set<String> words = new HashSet<>();

    private final Map<String, Integer> wordsMap = new TreeMap<>();

    private final RowReader rowReader = new RowReader();


    public Set<String> getWords() {
        return words;
    }

    /**
     * Метод позволяющий просканировать весь файл и записать все встреченные слова во внутренний Set
     * @param path - путь до файла
     */
    public void scan(String path) {
        BufferedReader reader;
        try {
        reader = new BufferedReader(new FileReader(path));
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
            rowReader.read(line, words, wordsMap);
        }
    }

    /**
     * Метод позволяющий просканировать файл и посчитать количество использований заданного слова
     * @param path - путь до файла
     * @param word - искомое слово
     * @return - количество встреченного искомого слова
     * @throws IOException
     */
    public long scan(String path, String word) throws IOException {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        long searchingWordAmount = 0;
        while ((line = reader.readLine()) != null) {
            searchingWordAmount += rowReader.read(line, word);
        }
        return searchingWordAmount;
    }

    /**
     * Метод позволяющий просканировать файл используя классы ISearchEngine
     * @param iSearchEngine - класс производящий анализ
     * @param path - путь до файла
     * @param word - искомое слово
     * @return - количество встреченного использованного слова
     * @throws IOException
     */
    public long scanWithISearchEngine(ISearchEngine iSearchEngine, String path, String word) throws IOException {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        long searchingWordAmount = 0;
        while ((line = reader.readLine()) != null) {
            searchingWordAmount += iSearchEngine.search(line, word);
        }
        return searchingWordAmount;
    }

    public long getAmountOfWords() {
        return words.size();
    }

    /**
     * Метод возвращающий топ N слов по количеству использований в тексте. Перед использованием необходимо просканировать текст (scan())
     * @param n - сколько верхних позиций покажется
     * @return - лист содержащий N пар слово-количество
     */
    public List<Map.Entry<String, Integer>> getTopNWords(int n) {
        List<Map.Entry<String, Integer>> list = new NewList(wordsMap.entrySet());
        list.sort(new AmountComparator());
        list = new NewList(list.subList(0, n));
        return list;
    }
}
