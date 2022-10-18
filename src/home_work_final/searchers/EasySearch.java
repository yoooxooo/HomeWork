package home_work_final.searchers;

import home_work_final.aditional.WordChecker;
import home_work_final.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    public long search(String text, String word) {
        if (word.equals("") || text.equals("")) {
            return 0;
        }
        int i = 0;
        long counter = 0;
        WordChecker wordChecker = new WordChecker();
        while ((i = (1 + text.indexOf(word, i))) != 0) {
            if (wordChecker.checkBefore(text, i - 1) && wordChecker.checkAfter(text, i + word.length() - 2)) {
                ++counter;
            }
        }
        return counter;
    }
}
