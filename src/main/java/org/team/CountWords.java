package org.team;

public class CountWords {

    private CountWords() {}

    public static int count(String s) {
        if (s == null) {return 0;}

        int words = 0;
        char last = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)) && (last == 's' || last == 'r')) {
                words++;
            }
            last = s.charAt(i);
        }

        if (last == 's' || last == 'r') {
            words++;
        }

        return words;
    }
}
