package home_work_final.api;

public interface ISearchEngine {
    /**
     * Метод ищущий выбранное слово в строке, если слово - часть другого слова, то оно не засчитывается
     * @param text - строка в которой мы ищем слово
     * @param word - искомое слово
     * @return - количество раз, которое слово встречается в строке
     */
    long search(String text, String word);
}
