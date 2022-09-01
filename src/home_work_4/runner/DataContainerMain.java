package home_work_4.runner;

import home_work_4.container.DataContainer;
import home_work_4.container.IntegerComparator;
import home_work_4.container.StringComparator;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {

        Integer[] data = new Integer[9];
        String[] dataString = new String[5];
        DataContainer<Integer> pack = new DataContainer<>(data);
        DataContainer<String> words = new DataContainer<>(dataString);
        Integer numberOne = 114;
        Integer numberTwo = 22;
        Comparator<Integer> comparingInt = new IntegerComparator();
        Comparator<String> comparingStr = new StringComparator();


        pack.add(114);
        System.out.println(pack.get(11));
        pack.add(122);
        pack.add(13);
        pack.add(1454);
        System.out.println(pack.get(3));
        pack.add(715);
        System.out.println(pack.add(16));
        System.out.println(pack.get(5));
        pack.add(171);
        pack.add(168);
        pack.add(1339);
        pack.add(200);
        pack.add(241);

        System.out.println(pack.toString());

        System.out.println(pack.add(212));
        System.out.println(pack.get(11));
        System.out.println(pack.add(null));

        System.out.println(pack.toString());

        System.out.println(pack.delete(11));
        System.out.println(pack.delete(8));
        System.out.println(pack.delete(10));

        pack.add(null);
        pack.add(null);
        pack.add(null);
        pack.add(362);

        System.out.println(pack.toString());

        System.out.println(pack.delete(numberOne));
        System.out.println(pack.delete(numberTwo));

        System.out.println(pack.toString());

        pack.sort(comparingInt);

        System.out.println(pack.toString());

        words.add("А у меня все прекрасней не бывает");
        words.add("Привет");
        words.add("Дуралей");
        words.add("Что нового за этот месяц?");
        words.add("Долго меня ждал?");
        words.add("Хорошо что не долго");

        System.out.println(words.toString());

        words.sort(comparingStr);

        System.out.println(words.toString());

        words.delete("Дуралей");

        System.out.println(words.toString());

    }
}
