package home_work_final.searchers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest {

    @Test
    public void search1() {
        String word = "собака";
        String line = "собака собаки собаку";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search2() {
        String word = "собака";
        String line = "собакасобака собаку";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(0, easySearch.search(line, word));
    }

    @Test
    public void search3() {
        String word = "собака";
        String line = "собака-собака собаку";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(0, easySearch.search(line, word));
    }

    @Test
    public void search4() {
        String word = "собака";
        String line = "собака- собаки собаку";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search5() {
        String word = "собака";
        String line = "-собака -собака- собаку";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(2, easySearch.search(line, word));
    }

    @Test
    public void search6() {
        String word = "собака";
        String line = ":собака-;собака собаку";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(2, easySearch.search(line, word));
    }

    @Test
    public void search7() {
        String word = "собака";
        String line = "-?собака!!собака- собаку";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(2, easySearch.search(line, word));
    }

    @Test
    public void search8() {
        String word = "собака";
        String line = "-?собака!!собака--собака-";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(3, easySearch.search(line, word));
    }

    @Test
    public void search9() {
        String word = "4-х";
        String line = "-?с4!-ехобака4ех!4-х!собака4 -х--собака-";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search10() {
        String word = "и";
        String line = "Ибрагим-и-иван и вася И надя";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(1, easySearch.search(line, word));
    }

    @Test
    public void search11() {
        String word = "И";
        String line = "И-?собака-Исобака-И-собака!-И";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(2, easySearch.search(line, word));
    }

    @Test
    public void search12() {
        String word = "";
        String line = "И-";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(0, easySearch.search(line, word));
    }

    @Test
    public void search13() {
        String word = "qew";
        String line = "";
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(0, easySearch.search(line, word));
    }
}
