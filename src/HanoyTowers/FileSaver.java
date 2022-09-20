package HanoyTowers;

import java.io.*;
import java.util.Arrays;

public class FileSaver {

    public boolean saveFile(String[] input, String name) throws IOException {
        File file = new File("D:\\IdeaProject\\JD1\\HomeWork\\src\\HanoyTowers\\Saves\\" + name + ".txt");
        PrintWriter pw = new PrintWriter(file);
        for (String j : input) {
            pw.println(j);
            pw.close();
        }
        return true;
    }

    public int[] getFile(String name) throws IOException {
        FileReader file = new FileReader("D:\\IdeaProject\\JD1\\HomeWork\\src\\HanoyTowers\\Saves\\" + name + ".txt");
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();
        int[] history = new int[0];
        int i = 0;
        while (line != null) {
            history = Arrays.copyOf(history, history.length + 1);
            history[i] = Integer.parseInt(line);
            ++i;
            line = br.readLine();
        }
        return history;
    }
}
