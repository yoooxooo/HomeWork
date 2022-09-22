package home_work_5.stringbuilders;

import home_work_5.api.IStringGenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNickNameFromFileStringBuilder implements IStringGenerator {

    public String getRandomString() {
        FileReader file = null;
        try {
            file = new FileReader("HomeWork\\saves\\hw5\\NickNamesSave");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader reader = new BufferedReader(file);
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int bound = rnd.nextInt(1,21);
        String name = "";
        for (int i = 1; i <= bound; ++i) {
            try {
                name = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return name;
    }
}
