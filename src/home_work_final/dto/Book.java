package home_work_final.dto;

import java.io.File;
import java.util.*;

/**
 * Объект содержащий текстовый файл, его название для пользователя, а также Set уникальных слов и Map пар слово - количество
 */
public class Book {

    public Book(String nameForUser, File bookFile) {
        this.nameForUser = nameForUser;
        this.bookFile = bookFile;
    }

    public Book(File bookFile) {
        this.nameForUser = bookFile.getName();
        this.bookFile = bookFile;
    }

    private final String nameForUser;

    private final File bookFile;

    private final Set<String> uniqueWords = new HashSet<>();

    private final Map<String, Integer> wordsAndAmounts = new HashMap<>();

    private boolean scannedFlag = false;

    public void switchScannedFlag() {
        scannedFlag = true;
    }

    public boolean isScannedFlag() {
        return scannedFlag;
    }

    public String getNameForUser() {
        return nameForUser;
    }

    public File getBookFile() {
        return bookFile;
    }

    public Set<String> getUniqueWords() {
        return uniqueWords;
    }

    public Map<String, Integer> getWordsAndAmounts() {
        return wordsAndAmounts;
    }

}
