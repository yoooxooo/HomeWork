package file_scanner;

import java.io.File;

public class PackageScanner {
    public int getFilesAmount() {
        return filesAmount;
    }
    public int getObjectsIncognitoAmount() {
        return objectsIncognitoAmount;
    }
    public int getTextFilesAmount() {
        return textFilesAmount;
    }
    public int getPackagesAmount() {
        return packagesAmount;
    }
    private int filesAmount;
    private int packagesAmount;
    private int objectsIncognitoAmount;
    private int textFilesAmount;

    public PackageScanner(String startPoint) {
        recursion(startPoint);
    }

    public void recursion(String path) {
        File startFile = new File(path);
        File[] buffer = startFile.listFiles();
        check(startFile);
        if (buffer != null) {
            for (File file1 : buffer) {
                recursion(file1.getPath());
            }
        }
    }

    public void check(File file) {
        if (file.isHidden()) {
            ++objectsIncognitoAmount;
        }
        if (file.isDirectory()) {
            ++packagesAmount;
        } else {
            ++filesAmount;
            if (file.getName().endsWith(".txt")) {
                ++textFilesAmount;
            }
        }
    }
}
