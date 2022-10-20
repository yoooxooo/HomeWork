package home_work_final.runners;

import home_work_final.readers.BookReader;
import home_work_final.readers.PackReader;
import home_work_final.readers.RowReader;

import java.io.IOException;
import java.util.Scanner;

public class AutoThreadPackReader {
    public static void main(String[] args) {
        System.out.println("Введите адрес папки, сканирование которой хотите произвести");
        PackReader packReader;
        Scanner console = new Scanner(System.in);
        try {
            packReader = new PackReader(console.nextLine().trim(), new BookReader(new RowReader()));
        } catch (IOException e) {
            System.out.println("Папка с данным адресом не найдена, либо в ней нет файлов для обработки");
            throw new  RuntimeException(e);
        }
        String buffer;
        do {
                System.out.println("Введите слово, которое вы хотите найти в файле." +
                        "\nДля выхода из программы введите 'выход' и подтвердите это");
                if ("выход".equals(buffer = console.nextLine())) {
                    System.out.println("Если вы действительно хотите выйти введите 'да', в ином случае будет учитываться что 'выход' - искомое слово");
                    if ("да".equals(console.nextLine())) {
                        break;
                    }
                }
                packReader.scanEveryBook(buffer);
        } while (true);
        System.out.println("Работа программы завершится после полного анализа всех книг\nВведенные после этого сообщения слова не учитываются при поиске");
        packReader.end();
    }
}
