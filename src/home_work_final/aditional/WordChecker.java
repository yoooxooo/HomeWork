package home_work_final.aditional;

/**
 * Класс, проверяющий символы до и после слова, и определяющие отдельное это слово или часть другого
 */
public class WordChecker {
    /**
     * Проверяет два символа до слова
     * @param text - строка с найденным словом
     * @param i - позиция первого символа слова
     * @return - true, если слово отдельное
     */
    public boolean checkBefore(String text, int i) {
        if (i - 1 == 0 && text.charAt(0) == '-') {
            return true;
        }
        if (i > 0) {
            char q = text.charAt(i - 1);
            if (q != ' ' && q != ',' && q != '.' && q != '!' && q != '?' && q != ';' && q != ':' && q != '(' && q != ')' && q != '"') {
                if (q == '-' && i > 1) {
                    q = text.charAt(i - 2);
                    return q == ' ' || q == ',' || q == '.' || q == '!' || q == '?' || q == ';' || q == ':' || q == '-' || q == '(' || q == ')' || q == '"';
                }
                return false;
            }
        }
        return true;
    }
    /**
     * Проверяет два символа за словом
     * @param text - строка с найденным словом
     * @param i - позиция последнего символа слова
     * @return - true, если слово отдельное
     */
    public boolean checkAfter(String text, int i) {
        if (i + 2 == text.length() && text.charAt(text.length() - 1) == '-') {
            return true;
        }
        if (i + 1 < text.length()) {
            char q = text.charAt(i + 1);
            if (q != ' ' && q != ',' && q != '.' && q != '!' && q != '?' && q != ';' && q != ':' && q != '(' && q != ')' && q != '"') {
                if (q == '-' && i + 2 < text.length()) {
                    q = text.charAt(i + 2);
                    return q == ' ' || q == ',' || q == '.' || q == '!' || q == '?' || q == ';' || q == ':' || q == '-' || q == '(' || q == ')' || q == '"';
                }
                return false;
            }
        }
        return true;
    }
}
