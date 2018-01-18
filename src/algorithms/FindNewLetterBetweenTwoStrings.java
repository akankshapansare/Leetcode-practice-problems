package algorithms;

import java.util.HashMap;

/**
 * Given two strings s and t which consist of only lowercase letters.
 * <p>
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * <p>
 * Find the letter that was added in t.
 * <p>
 * Example:
 * <p>
 * Input:
 * t = "abcd"
 * s = "abcde"
 * <p>
 * Output:
 * e
 * <p>
 * Explanation:
 * 'e' is the letter that was added.
 */
public class FindNewLetterBetweenTwoStrings {

    public static char findTheDifference(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        HashMap<Character, Integer> map = new HashMap<>(26);
        char differentLetter = 0;
        if (sLength > tLength) {
            String temp = s;
            s = t;
            t = temp;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                count = map.get(s.charAt(i));
                map.put(s.charAt(i), count++);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (map.containsKey(t.charAt(j))) {
                count = map.get(t.charAt(j));
                map.put(t.charAt(j), count - 1);
            } else {
                differentLetter = t.charAt(j);
                break;
            }
        }

        return differentLetter;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
}
