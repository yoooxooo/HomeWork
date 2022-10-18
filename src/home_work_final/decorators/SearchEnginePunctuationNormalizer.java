package home_work_final.decorators;

import home_work_final.api.ISearchEngine;
/**
 * Декоратор убирающий лишние символы, усложняющие разбор строки
 */
public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private final ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    public long search(String text, String word) {
       text = text.replaceAll("\\.", " ")
                .replaceAll(",", " ")
                .replaceAll("!", " ")
               .replaceAll("\\)", " ")
               .replaceAll("\\(", " ")
               .replaceAll("\"", " ")
                .replaceAll("\\?", " ")
                .replaceAll(";" , " ")
               .replaceAll(":", " ")
               .replaceAll("\\n", " ")
               .replaceAll("--", " ")
               .replaceAll(" -", " ")
               .replaceAll("- ", " ");
        if (text.endsWith("-")) {
            text = text.substring(0, text.length()-1);
        }
        if (text.startsWith("-")) {
            text = text.substring(1);
        }
       while (text.contains("  ")) {
           text = text.replaceAll(" {2}", " ");
       }
        return iSearchEngine.search(text, word);
    }

    public String search(String text) {
        text = text.replaceAll("\\.", " ")
                .replaceAll(",", " ")
                .replaceAll("!", " ")
                .replaceAll("\\?", " ")
                .replaceAll(";" , " ")
                .replaceAll(":", " ")
                .replaceAll("\\n", " ")
                .replaceAll("--", " ")
                .replaceAll(" -", " ")
                .replaceAll("- ", " ");
        if (text.endsWith("-")) {
            text = text.substring(0, text.length()-1);
        }
        if (text.startsWith("-")) {
            text = text.substring(1);
        }
        while (text.contains("  ")) {
            text = text.replaceAll(" {2}", " ");
        }
        return text;
    }
}
