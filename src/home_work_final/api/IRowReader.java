package home_work_final.api;

import home_work_final.dto.Book;

public interface IRowReader extends ISearchEngine {
    /**
     * Сканирует строку и все встреченные слова помещает в Set и Map объекта Book
     * @param line - анализируемая строка
     * @param book - объект Book
     */
    void read(String line, Book book);
}
