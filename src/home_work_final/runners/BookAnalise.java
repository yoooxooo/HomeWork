package home_work_final.runners;

import home_work_final.readers.BookReader;

public class BookAnalise {
    public static void main(String[] args) {
        BookReader bookReader = new BookReader();
        bookReader.scan("Homework\\books\\Война и мир_книга.txt");
        //2.1
        System.out.println(bookReader.getWords());
        //2.2
        System.out.println("Топ 100 самых использованных слов -\n" + bookReader.getTopNWords(100));
    }
}
