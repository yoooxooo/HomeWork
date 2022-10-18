package home_work_final.decorators;

import home_work_final.api.ISearchEngine;

/**
 * Декоратор позволяющий проводить поиск по слову в различных падежах. Не работает с исключениями и при изменении суффиксов
 */
public class SearchEngineCaseNormalizer implements ISearchEngine {

    private final ISearchEngine iSearchEngine;
    private String ending;

    /**
     *
     * @param iSearchEngine - класс выполняющий метод search()
     * @param ending - окончание падежа, к которому будут приведены все слова в строке
     */
    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine, String ending) {
        this.ending = ending;
        this.iSearchEngine = iSearchEngine;
    }
    public long search(String text, String word) {
        if (word.length() < 2) {
            return iSearchEngine.search(text, word);
        }
        if (word.endsWith("а") || word
                .endsWith("я") || word
                .endsWith("ы") || word
                .endsWith("и") || word
                .endsWith("е") || word
                .endsWith("у") || word
                .endsWith("ю") || word
                .endsWith("о")) {
            word = word.substring(0, word.length() - 1);
        }
        if (word.endsWith("ой") || word
                .endsWith("ей") || word
                .endsWith("ою") || word
                .endsWith("ею") || word
                .endsWith("ом") || word
                .endsWith("ем") || word
                .endsWith("ью")) {
            word = word.substring(0, word.length() - 2);
        }
        text = text.replaceAll(word + "ой", word)
                .replaceAll(word + "ей", word)
                .replaceAll(word + "ою", word)
                .replaceAll(word + "ею", word)
                .replaceAll(word + "ом", word)
                .replaceAll(word + "ем", word)
                .replaceAll(word + "ью", word)
                .replaceAll(word + "а", word)
                .replaceAll(word + "я", word)
                .replaceAll(word + "ы", word)
                .replaceAll(word + "и", word)
                .replaceAll(word + "е", word)
                .replaceAll(word + "у", word)
                .replaceAll(word + "ю", word)
                .replaceAll(word + "о", word)
                .replaceAll(word, word + ending);
        return iSearchEngine.search(text, word + ending);
    }
}
