package home_work_final.decorators;

import home_work_final.searchers.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEnginePunctuationNormalizerTest {

    @Test
    public void search1() {
        String line = "-!:!:собака- кошка-- -";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals(" собака кошка ", easySearch.search(line));
    }

    @Test
    public void search2() {
        String line = "-!:!:собака- кошка-- -";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals(" собака кошка ", easySearch.search(line));
    }

    @Test
    public void search3() {
        String line = "-!:!:собака-кошка-- -";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals(" собака-кошка ", easySearch.search(line));
    }

    @Test
    public void search4() {
        String line = "-!:!:собака-:??!! кошка--....-\n-:::::-????--..!!!!-------утка--...-\n--- -";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals(" собака кошка утка ", easySearch.search(line));
    }

    @Test
    public void search5() {
        String line = "-!:!:- -- -";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals(" ", easySearch.search(line));
    }

    @Test
    public void search6() {
        String line = "";
        SearchEnginePunctuationNormalizer easySearch = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals("", easySearch.search(line));
    }
}
