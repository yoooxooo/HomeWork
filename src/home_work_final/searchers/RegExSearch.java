package home_work_final.searchers;

import home_work_final.aditional.WordChecker;
import home_work_final.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    public long search(String text, String word) {
        if (word.equals("") || text.equals("")) {
            return 0;
        }
        Pattern pattern = Pattern.compile(word);
        return search(text, pattern);
    }

    public long search(String text, Pattern word) {
        WordChecker wordChecker = new WordChecker();
        Matcher matcher = word.matcher(text);
        long counter = 0;
        while (matcher.find()) {
            if (wordChecker.checkBefore(text, matcher.start()) && wordChecker.checkAfter(text, matcher.end() - 1)) {
                ++counter;
            }
        }
        return counter;
    }
}
