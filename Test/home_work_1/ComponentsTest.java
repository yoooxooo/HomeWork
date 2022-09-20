package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComponentsTest {

    @Test
    public void tobit1() {
        Components ex = new Components();
        Assertions.assertEquals("Побитовое И для чисел 2 и 4: 0\n  00000000000000000000000000000010| 2\n& 00000000000000000000000000000100| 4\n  00000000000000000000000000000000| 0\n", ex.pobit(2, 4, "и"));
    }

    @Test
    public void tobit2() {
        Components ex = new Components();
        Assertions.assertEquals("Побитовое ИЛИ для чисел 2 и 4: 6\n  00000000000000000000000000000010| 2\n| 00000000000000000000000000000100| 4\n  00000000000000000000000000000110| 6\n", ex.pobit(2, 4, "или"));
    }

    @Test
    public void oddOrNot1() {
        Components ex = new Components();
        Assertions.assertTrue(ex.oddOrNot(1));
    }

    @Test
    public void oddOrNot2() {
        Components ex = new Components();
        Assertions.assertFalse(ex.oddOrNot(2));
    }

    @Test
    public void oddOrNot3() {
        Components ex = new Components();
        Assertions.assertFalse(ex.oddOrNot(0));
    }

    @Test
    public void oddOrNot4() {
        Components ex = new Components();
        Assertions.assertFalse(ex.oddOrNot(-2));
    }

    @Test
    public void median1() {
        Components ex = new Components();
        Assertions.assertEquals("Эти числа равны и среди них нет среднего", ex.median(1, 1, 1));
    }

    @Test
    public void median2() {
        Components ex = new Components();
        Assertions.assertEquals("Ты ввел два одинаковых числа, так что среди них нельзя выделить среднее", ex.median(0, 1, 1));
    }

    @Test
    public void median3() {
        Components ex = new Components();
        Assertions.assertEquals("Ты ввел два одинаковых числа, так что среди них нельзя выделить среднее", ex.median(1, 0, 1));
    }

    @Test
    public void median4() {
        Components ex = new Components();
        Assertions.assertEquals("Ты ввел два одинаковых числа, так что среди них нельзя выделить среднее", ex.median(1, 1, 0));
    }

    @Test
    public void median5() {
        Components ex = new Components();
        Assertions.assertEquals("Средним является первое число", ex.median(2, 1, 3));
    }

    @Test
    public void median6() {
        Components ex = new Components();
        Assertions.assertEquals("Средним является второе число", ex.median(1, 2, 3));
    }

    @Test
    public void median7() {
        Components ex = new Components();
        Assertions.assertEquals("Средним является третье число", ex.median(1, 3, 2));
    }

    @Test
    public void dividingCheck1() {
        Components ex = new Components();
        Assertions.assertEquals("Здесь не высшая математика, чтобы играться с нулями", ex.dividingCheck(0, 3));
    }

    @Test
    public void dividingCheck2() {
        Components ex = new Components();
        Assertions.assertEquals("Здесь не высшая математика, чтобы играться с нулями", ex.dividingCheck(1, 0));
    }

    @Test
    public void dividingCheck3() {
        Components ex = new Components();
        Assertions.assertEquals("Они делятся без остатка", ex.dividingCheck(6, 3));
    }

    @Test
    public void dividingCheck4() {
        Components ex = new Components();
        Assertions.assertEquals("Деление то пройдет, но остаточек останется", ex.dividingCheck(1, 3));
    }

    @Test
    public void bitConverter1() {
        Components ex = new Components();
        Assertions.assertEquals("0 он и в байтах и в килобайтах 0", ex.bitConverter(0, 1));
    }

    @Test
    public void bitConverter2() {
        Components ex = new Components();
        Assertions.assertEquals("Не вижу смысла переводить отрицательные данные", ex.bitConverter(-2, 1));
    }

    @Test
    public void bitConverter3() {
        Components ex = new Components();
        Assertions.assertEquals("По моим подсчетам вышло " + 1 + " килобайт и " + 0 + " байт", ex.bitConverter(1024, 1));
    }

    @Test
    public void bitConverter4() {
        Components ex = new Components();
        Assertions.assertEquals("По моим подсчетам вышло " + 1024 + " байт", ex.bitConverter(1, 2));
    }

    @Test
    public void symbolOrNot1() {
        Components ex = new Components();
        Assertions.assertTrue(ex.symbolOrNot((char) 23));
    }

    @Test
    public void symbolOrNot2() {
        Components ex = new Components();
        Assertions.assertFalse(ex.symbolOrNot((char) 70));
    }

    @Test
    public void year3651() {
        Components ex = new Components();
        Assertions.assertTrue(ex.year365(400));
    }

    @Test
    public void year3652() {
        Components ex = new Components();
        Assertions.assertFalse(ex.year365(450));
    }

    @Test
    public void year3653() {
        Components ex = new Components();
        Assertions.assertFalse(ex.year365(1000));
    }

    @Test
    public void sleepOrNot1() {
        Components ex = new Components();
        Assertions.assertEquals("Можешь спать дальше", ex.sleepOrNot("Да", "Да"));
    }

    @Test
    public void sleepOrNot2() {
        Components ex = new Components();
        Assertions.assertEquals("Можешь спать дальше", ex.sleepOrNot("Нет", "Нет"));
    }

    @Test
    public void sleepOrNot3() {
        Components ex = new Components();
        Assertions.assertEquals("Пора идти на работу", ex.sleepOrNot("Да", "Нет"));
    }

    @Test
    public void sleepOrNot4() {
        Components ex = new Components();
        Assertions.assertEquals("Можешь спать дальше", ex.sleepOrNot("Нет", "Да"));
    }

    @Test
    public void reaction11() {
        Components ex = new Components();
        Assertions.assertEquals("Привет\nЯ тебя так долго ждал", ex.reaction1("Вася"));
    }

    @Test
    public void reaction12() {
        Components ex = new Components();
        Assertions.assertEquals("Я тебя так долго ждал", ex.reaction1("Анастасия"));
    }

    @Test
    public void reaction13() {
        Components ex = new Components();
        Assertions.assertEquals("Добрый день, а вы кто?", ex.reaction1("Игорь"));
    }

    @Test
    public void reaction21() {
        Components ex = new Components();
        Assertions.assertEquals("Привет\nЯ тебя так долго ждал", ex.reaction2("Вася"));
    }

    @Test
    public void reaction22() {
        Components ex = new Components();
        Assertions.assertEquals("Я тебя так долго ждал", ex.reaction2("Анастасия"));
    }

    @Test
    public void reaction23() {
        Components ex = new Components();
        Assertions.assertEquals("Добрый день, а вы кто?", ex.reaction2("Игорь"));
    }

    @Test
    public void reaction31() {
        Components ex = new Components();
        Assertions.assertEquals("Привет\nЯ тебя так долго ждал", ex.reaction3("Вася"));
    }

    @Test
    public void reaction32() {
        Components ex = new Components();
        Assertions.assertEquals("Я тебя так долго ждал", ex.reaction3("Анастасия"));
    }

    @Test
    public void reaction33() {
        Components ex = new Components();
        Assertions.assertEquals("Добрый день, а вы кто?", ex.reaction3("Игорь"));
    }
}
