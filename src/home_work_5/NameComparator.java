package home_work_5;

import java.util.Comparator;

public class NameComparator implements Comparator<String> {

    public int compare(String nick1, String nick2) {
        if(nick1 == null) {
            return -1;
        } else if (nick2 == null) {
            return 1;
        }
        int checkLength, lengthDifference;
        lengthDifference = nick1.length() - nick2.length();
        if (lengthDifference > 0) {
            checkLength = nick1.length();
        } else {
            checkLength = nick2.length();
        }
        for (int i = 0; i < checkLength; ++i) {
            int buffer = (int) nick1.charAt(i) - (int) nick2.charAt(i);
            if (buffer == 0) {
                continue;
            }
            if (buffer > 0) {
                return 1;
            } else {
                return -1;
            }
        }
        return lengthDifference;
    }
}
