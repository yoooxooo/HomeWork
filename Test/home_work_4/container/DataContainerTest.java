package home_work_4.container;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataContainerTest {

    @Test
    public void add1() {
        String[] array = new String[0];
        DataContainer<String> dc = new DataContainer<>(array);
        Assertions.assertEquals(-1, dc.add(null));
    }

    @Test
    public void add2() {
        String[] array = new String[0];
        DataContainer<String> dc = new DataContainer<>(array);
        Assertions.assertEquals(0, dc.add("1"));
    }

    @Test
    public void add3() {
        String[] array = new String[1];
        DataContainer<String> dc = new DataContainer<>(array);
        Assertions.assertEquals(0, dc.add("null"));
    }

    @Test
    public void add4() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        Assertions.assertEquals(0, dc.add("null"));
    }

    @Test
    public void add5() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        Assertions.assertEquals(1, dc.add("null"));
    }

    @Test
    public void add6() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("1");
        Assertions.assertEquals(2, dc.add("null"));
    }

    @Test
    public void add7() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertEquals("[1, 2, 3]", dc.toString());
    }

    @Test
    public void add8() {
        String[] array = new String[]{"1", null, "3"};
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("2");
        Assertions.assertEquals("[1, 2, 3]", dc.toString());
    }

    @Test
    public void get1() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertNull(dc.get(10));
    }

    @Test
    public void get2() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertNull(dc.get(-2));
    }

    @Test
    public void get3() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertEquals("2",dc.get(1));
    }

    @Test
    public void get4() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertEquals("1",dc.get(0));
    }

    @Test
    public void delete1() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertTrue(dc.delete(0));
    }

    @Test
    public void delete2() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertTrue(dc.delete(2));
    }

    @Test
    public void delete3() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertFalse(dc.delete(3));
    }

    @Test
    public void delete4() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertFalse(dc.delete(-1));
    }

    @Test
    public void delete5() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertTrue(dc.delete("1"));
    }

    @Test
    public void delete6() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertFalse(dc.delete("4"));
    }

    @Test
    public void delete7() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertFalse(dc.delete(null));
    }

    @Test
    public void delete8() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        dc.delete(1);
        Assertions.assertEquals("[1, 3]", dc.toString());
    }

    @Test
    public void delete9() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        dc.delete(2);
        Assertions.assertEquals("[1, 2]", dc.toString());
    }

    @Test
    public void delete10() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        dc.delete(-1);
        Assertions.assertEquals("[1, 2, 3]", dc.toString());
    }

    @Test
    public void delete11() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        dc.delete("2");
        Assertions.assertEquals("[1, 3]", dc.toString());
    }

    @Test
    public void delete12() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        dc.delete("12");
        Assertions.assertEquals("[1, 2, 3]", dc.toString());
    }

    @Test
    public void delete13() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        dc.delete("3");
        Assertions.assertEquals("[1, 2]", dc.toString());
    }

    @Test
    public void toString1() {
        String[] array = new String[2];
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("1");
        dc.add("2");
        dc.add("3");
        Assertions.assertEquals("[1, 2, 3]", dc.toString());
    }

    @Test
    public void toString2() {
        String[] array = new String[]{null, "1", "2", "3"};
        DataContainer<String> dc = new DataContainer<>(array);
        Assertions.assertEquals("[1, 2, 3]", dc.toString());
    }

    @Test
    public void toString3() {
        String[] array = new String[]{null, "1", "2", "3", "null"};
        DataContainer<String> dc = new DataContainer<>(array);
        Assertions.assertEquals("[1, 2, 3, null]", dc.toString());
    }

    @Test
    public void sort1() {
        String[] array = new String[2];
        StringComparator sc = new StringComparator();
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("3");
        dc.add("2");
        dc.add("1");
        dc.sort(sc);
        Assertions.assertEquals("[3, 2, 1]", dc.toString());
    }

    @Test
    public void sort2() {
        String[] array = new String[2];
        StringComparator sc = new StringComparator();
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("333");
        dc.add("22");
        dc.add("1");
        dc.add("null");
        dc.sort(sc);
        Assertions.assertEquals("[1, 22, 333, null]", dc.toString());
    }

    @Test
    public void sort3() {
        String[] array = new String[]{"1", null, "333", "22"};
        StringComparator sc = new StringComparator();
        DataContainer<String> dc = new DataContainer<>(array);
        dc.sort(sc);
        dc.add("0");
        Assertions.assertEquals("[0, 1, 22, 333]", dc.toString());
    }

    @Test
    public void sort4() {
        String[] array = new String[]{"1", null, "333", null, "22"};
        StringComparator sc = new StringComparator();
        DataContainer<String> dc = new DataContainer<>(array);
        dc.add("0");
        dc.sort(sc);
        Assertions.assertEquals("[1, 0, 22, 333]", dc.toString());
    }
}
