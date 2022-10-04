package file_scanner;

public class Main1 {
    public static void main(String[] args) {
        PackageScanner packageScanner = new PackageScanner("D:\\");

        System.out.println("Всего папок " + packageScanner.getPackagesAmount());
        System.out.println("Всего файлов " + packageScanner.getFilesAmount());
        System.out.println("Скрытых файлов " + packageScanner.getObjectsIncognitoAmount());
        System.out.println("Текстовых файлов " + packageScanner.getTextFilesAmount());
    }
}
