package home_work_final.decorators;

import home_work_final.searchers.RegExSearch;
import home_work_final.api.ISearchEngine;

import java.util.regex.Pattern;
/**
 * Декоратор позволяющий проводить поиск по слову без учета регистра. При работе с регулярными выражениями использует паттерн UNICODE_CASE
 */
public class SearchEngineRegisterNormalizer implements ISearchEngine {

    private final ISearchEngine iSearchEngine;

    public SearchEngineRegisterNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    public long search(String text, String word) {
        if (iSearchEngine instanceof RegExSearch) {
            return ((RegExSearch) iSearchEngine).search(text, Pattern.compile(word, Pattern.UNICODE_CASE + Pattern.CASE_INSENSITIVE));
        }
        text = text.toLowerCase();
        word = word.toLowerCase();
        return iSearchEngine.search(text, word);
    }
}
