package home_work_final.dto;

/**
 * Объект содержащий результаты анализа Book на определенное слово
 */
public class ResultOfSearch {

    public ResultOfSearch(String nameOfBookForUser, String searchingWord, long amountOfWord) {
        this.searchingWord = searchingWord;
        this.amountOfWord = amountOfWord;
        this.nameOfBookForUser = nameOfBookForUser;
    }

    private final String nameOfBookForUser;

    private final long amountOfWord;

    private final String searchingWord;

    public String getNameOfBookForUser() {
        return nameOfBookForUser;
    }

    public long getAmountOfWord() {
        return amountOfWord;
    }

    public String getSearchingWord() {
        return searchingWord;
    }
}
