package home_work_final.decorators;

import home_work_final.api.ISearchEngine;
import home_work_final.searchers.EasySearch;
import home_work_final.searchers.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineRegisterNormalizerTest {
    @Test
    public void search1() {
        String word = "собака";
        String line = "собака собакА сОбАку";
        ISearchEngine easySearch = new SearchEngineRegisterNormalizer(new EasySearch());
        Assertions.assertEquals(2, easySearch.search(line, word));
    }

    @Test
    public void search2() {
        String word = "соБАка";
        String line = "собакасоБАка СОбака";
        ISearchEngine easySearch = new SearchEngineRegisterNormalizer(new EasySearch());
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search3() {
        String word = "Собака";
        String line = "собакА-собака собАка";
        ISearchEngine easySearch = new SearchEngineRegisterNormalizer(new EasySearch());
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search4() {
        String word = "СОБАКА";
        String line = "собака- соБАка СОБАКА";
        ISearchEngine easySearch = new SearchEngineRegisterNormalizer(new EasySearch());
        Assertions.assertEquals(3, easySearch.search(line, word));
    }

    @Test
    public void search5() {
        String word = "собака";
        String line = "собака собакА сОбАку";
        ISearchEngine easySearch = new SearchEngineRegisterNormalizer(new RegExSearch());
        Assertions.assertEquals(2, easySearch.search(line, word));
    }

    @Test
    public void search6() {
        String word = "соБАка";
        String line = "собакасоБАка СОбака";
        ISearchEngine easySearch = new SearchEngineRegisterNormalizer(new RegExSearch());
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search7() {
        String word = "Собака";
        String line = "собакА-собака собАка";
        ISearchEngine easySearch = new SearchEngineRegisterNormalizer(new RegExSearch());
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search8() {
        String word = "СОБАКА";
        String line = "собака- соБАка СОБАКА";
        ISearchEngine easySearch = new SearchEngineRegisterNormalizer(new RegExSearch());
        Assertions.assertEquals(3, easySearch.search(line, word));
    }
}