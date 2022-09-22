package home_work_5.stringbuilders;

import home_work_5.api.IStringGenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNickFromFileStringBuilder implements IStringGenerator {

    public String getRandomString() {
        FileReader file = null;
        try {
            file = new FileReader("HomeWork\\saves\\hw5\\NicksSave");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader reader = new BufferedReader(file);
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        int bound = rnd.nextInt(20);
        String name = "";
        for (int i = 0; i < bound + 1; ++i) {
            try {
                name = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return name;
    }
}
