package home_work_final.decorators;

import home_work_final.searchers.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineCaseNormalizerTest {
    @Test
    public void search1() {
        String word = "бабушка";
        String line = "бабушка бабушки бабушкой бабушку";
        SearchEngineCaseNormalizer easySearch = new SearchEngineCaseNormalizer(new EasySearch(), "а");
        Assertions.assertEquals(4, easySearch.search(line, word));
    }

    @Test
    public void search2() {
        String word = "кинжал";
        String line = "кинжалом кинжала кинжал кинжалу";
        SearchEngineCaseNormalizer easySearch = new SearchEngineCaseNormalizer(new EasySearch(), "а");
        Assertions.assertEquals(4, easySearch.search(line, word));
    }

    @Test
    public void search3() {
        String word = "кинжал";
        String line = "кинжалик кинжала кинжальчик кинжалу бабушка";
        SearchEngineCaseNormalizer easySearch = new SearchEngineCaseNormalizer(new EasySearch(), "а");
        Assertions.assertEquals(2, easySearch.search(line, word));
    }


}
