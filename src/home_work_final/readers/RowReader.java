package home_work_final.readers;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class RowReader {

    public long read(String line, String word) {
        long counter = 0;
        line = line.replaceAll("\\.", " ")
                .replaceAll(",", " ")
                .replaceAll("!", " ")
                .replaceAll("\\?", " ")
                .replaceAll(";" , " ")
                .replaceAll("\\n", " ")
                .replaceAll(":", " ")
                .replaceAll(" -", " ")
                .replaceAll("- ", " ");
        while (line.contains("  ")) {
            line = line.replaceAll(" {2}", " ");
        }
        String[] wordsRow = line.split(" ");

        for (String p : wordsRow) {
            if (p.equals(word)) {
                ++counter;
            }
        }
        return counter;
    }

    public void read(String line, Set<String> set, Map<String, Integer> map) {
        line = line.replaceAll("\\.", " ")
                .replaceAll(",", " ")
                .replaceAll("!", " ")
                .replaceAll("\\)", " ")
                .replaceAll("\\(", " ")
                .replaceAll("\"", " ")
                .replaceAll("\\?", " ")
                .replaceAll(";" , " ")
                .replaceAll("\\n", " ")
                .replaceAll(":", " ")
                .replaceAll("--", " ")
                .replaceAll(" -", " ")
                .replaceAll("- ", " ");
        if (line.endsWith("-")) {
            line = line.substring(0, line.length()-1);
        }
        if (line.startsWith("-")) {
            line = line.substring(1);
        }
        while (line.contains("  ")) {
            line = line.replaceAll(" {2}", " ");
        }
        String[] wordsRow = line.split(" ");

        set.addAll(Arrays.asList(wordsRow));
        for (String p : wordsRow) {
            if (p.equals("")) {
                continue;
            }
            if (map.containsKey(p)) {
                map.replace(p, map.get(p) + 1);
            } else {
                map.put(p, 1);
            }
        }
    }
}
