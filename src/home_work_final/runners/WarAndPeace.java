package home_work_final.runners;

import home_work_final.api.ISearchEngine;
import home_work_final.decorators.SearchEngineCaseNormalizer;
import home_work_final.decorators.SearchEngineRegisterNormalizer;
import home_work_final.readers.BookReader;
import home_work_final.searchers.RegExSearch;

import java.io.IOException;
import java.util.Scanner;

public class WarAndPeace {
    public static void main(String[] args) {
        System.out.println("Введите '1', если хотите искать без учета регистра");
        Scanner console = new Scanner(System.in);
        if("1".equals(console.nextLine())) {
            BookReader bookReader = new BookReader();
            ISearchEngine registerNormalizer = new SearchEngineRegisterNormalizer(new RegExSearch());
            try{
            System.out.println("Слово война - "
                            + bookReader
                            .scanWithISearchEngine(
                                    registerNormalizer
                                    , "D:\\Тест\\Война и мир_книга.txt"
                                    , "война") + " раз");
            System.out.println("Слово мир - "
                    + bookReader
                    .scanWithISearchEngine(
                            registerNormalizer
                            , "D:\\Тест\\Война и мир_книга.txt"
                            , "мир") + " раз");
            System.out.println("Союз и - "
                    + bookReader
                    .scanWithISearchEngine(
                            registerNormalizer
                            , "D:\\Тест\\Война и мир_книга.txt"
                            , "и") + " раз\n");
            } catch (IOException e) {
                throw new RuntimeException();
            }
        } else {
            BookReader bookReader = new BookReader();
            ISearchEngine regExSearch = new RegExSearch();
            try{
                System.out.println("Слово война - "
                        + bookReader
                        .scanWithISearchEngine(
                                regExSearch
                                , "D:\\Тест\\Война и мир_книга.txt"
                                , "война") + " раз");
                System.out.println("Слово мир - "
                        + bookReader
                        .scanWithISearchEngine(
                                regExSearch
                                , "D:\\Тест\\Война и мир_книга.txt"
                                , "мир") + " раз");
                System.out.println("Союз и - "
                        + bookReader
                        .scanWithISearchEngine(
                                regExSearch
                                , "D:\\Тест\\Война и мир_книга.txt"
                                , "и") + " раз\n");
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
    }
}
