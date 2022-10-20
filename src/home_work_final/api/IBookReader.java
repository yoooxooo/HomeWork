package home_work_final.api;

import home_work_final.dto.Book;

public interface IBookReader {
    /**
     * Сканирует выбранный текстовый файл и помещает все найденные слова в объект Book
     */
    void scan();

    /**
     * Сканирует выбранный текстовый файл и ищет количество упоминаний искомого слова
     * @param word - искомое слово
     * @return - количество раз, которое встретилось слово в тексте
     */
    long scan(String word);

    /**
     * Создает объект IBookReader, в который помещен объект Book для взаимодействия с его полями
     * @param book - объект Book
     * @return IBookReader, в который помещен объект Book
     */
    IBookReader create(Book book);
}
