/**
 * Given an array of characters, compress it in-place.
 * <p>
 * The length after compression must always be smaller than or equal to the original array.
 * <p>
 * Every element of the array should be a character (not int) of length 1.
 * <p>
 * After you are done modifying the input array in-place, return the new length of the array
 * <p>
 * Input:
 * ["a","a","b","b","c","c","c"]
 * <p>
 * Output:
 * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 */

package algorithms;

import java.util.HashMap;

public class StringCompression {

    public static int compress(char[] chars) {

        char[] output = new char[chars.length];

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                int count = hashMap.get(chars[i]);
                hashMap.put(chars[i], count + 1);
            } else {
                hashMap.put(chars[i], 1);
            }
        }
        for (int i = 0; i < hashMap.size(); i++) {
            output[i] = Character.highSurrogate(hashMap.get(i));
        }
        return output.length;
    }
}
