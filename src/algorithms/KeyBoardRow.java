package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */
public class KeyBoardRow {
    private static HashSet<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
    private static HashSet<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
    private static HashSet<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));


    private static String[] findWords(String[] words) {
        ArrayList<String> output = new ArrayList<>();

        for (String word : words) {
            int row1Count = 0;
            int row2Count = 0;
            int row3Count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (row1.contains(Character.toLowerCase(word.charAt(i)))) {
                    if (row2Count == 0 && row3Count == 0) {
                        row1Count = row1Count + 1;
                    } else {
                        break;
                    }
                }
                if (row2.contains(Character.toLowerCase(word.charAt(i)))) {
                    if (row1Count == 0 && row3Count == 0) {
                        row2Count = row2Count + 1;
                    } else {
                        break;
                    }
                }
                if (row3.contains(Character.toLowerCase(word.charAt(i)))) {
                    if (row1Count == 0 && row2Count == 0) {
                        row3Count = row3Count + 1;
                    } else {
                        break;
                    }
                }
            }
            if (row1Count == word.length() || row2Count == word.length() || row3Count == word.length()) {
                output.add(word);
            }
        }
        return output.toArray(new String[output.size()]);
    }

    public static void main(String[] args) {
        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        String[] output = findWords(strings);
        
    }
}
