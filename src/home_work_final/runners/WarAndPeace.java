package home_work_final.runners;

import home_work_final.api.ISearchEngine;
import home_work_final.decorators.SearchEngineRegisterNormalizer;
import home_work_final.dto.Book;
import home_work_final.readers.BookReader;
import home_work_final.readers.RowReader;
import home_work_final.searchers.RegExSearch;

import java.io.File;
import java.util.Scanner;

public class WarAndPeace {
    public static void main(String[] args) {
        System.out.println("Введите '1', если хотите искать без учета регистра");
        Scanner console = new Scanner(System.in);
        ISearchEngine searchEngine;
        if("1".equals(console.nextLine())) {
            searchEngine = new SearchEngineRegisterNormalizer(new RegExSearch());
        } else {
            searchEngine = new RegExSearch();
        }
        BookReader bookReader = new BookReader(new RowReader(), searchEngine, new Book(new File("D:\\Тест\\Война и мир_книга.txt")));
        System.out.println("Слово война - " + bookReader.scan("война") + " раз");
        System.out.println("Слово мир - " + bookReader.scan("мир") + " раз");
        System.out.println("Союз и - " + bookReader.scan( "и") + " раз\n");
        }
}
