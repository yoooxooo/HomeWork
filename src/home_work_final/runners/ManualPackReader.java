package home_work_final.runners;

import home_work_final.readers.BookReader;
import home_work_final.readers.PackReader;
import home_work_final.readers.RowReader;

import java.io.IOException;
import java.util.Scanner;

public class ManualPackReader {
    public static void main(String[] args) {
        System.out.println("Введите адрес папки, сканирование которой хотите произвести");
        PackReader packReader;
        Scanner console = new Scanner(System.in);
        try {
            packReader = new PackReader(console.nextLine().trim(), new BookReader(new RowReader()));
        } catch (IOException e) {
            System.out.println("Папка с данным адресом не найдена");
            throw new  RuntimeException(e);
        }

        boolean flagBook = false;
        String buffer1 = "";
        String buffer2;
        do {
            if (!flagBook) {
                System.out.println("\n" + packReader.getBooks());
                System.out.println("Введите название файла из списка, для которого хотите провести сканирование." +
                        "\nДля выхода из программы введите 'выход' и подтвердите это");
                if ("выход".equals(buffer1 = console.nextLine())) {
                    System.out.println("Если вы действительно хотите выйти введите 'да', в ином случае будет учитываться что 'выход' - название файла");
                    if ("да".equals(console.nextLine())) {
                        break;
                    }
                }
                if (packReader.getBooksWithNamesForUsers().containsKey(buffer1)) {
                    flagBook = true;
                } else System.out.println("Такого названия нет в списке");
            }
            if (flagBook) {
                System.out.println("Введите слово, которое вы хотите найти в файле." +
                        "\nДля возвращения к выбору книги введите 'назад' и подтвердите это" +
                        "\nДля выхода из программы введите 'выход' и подтвердите это");
                if ("выход".equals(buffer2 = console.nextLine())) {
                    System.out.println("Если вы действительно хотите выйти введите 'да', в ином случае будет учитываться что 'выход' - искомое слово");
                    if ("да".equals(console.nextLine())) {
                        break;
                    }
                }
                if ("назад".equals(buffer2)) {
                    System.out.println("Если вы действительно хотите вернуться назад введите 'да', в ином случае будет учитываться что 'назад' - искомое слово");
                    if ("да".equals(console.nextLine())) {
                        flagBook = false;
                        continue;
                    }
                }
                packReader.scanBookAndWriteLog(packReader.getBooksWithNamesForUsers().get(buffer1), buffer2);
            }
        } while (true);
    }
}
