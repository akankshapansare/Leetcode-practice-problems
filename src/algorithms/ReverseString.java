package algorithms;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
    public static String reverseString(String s) {
        StringBuilder output = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            output.append(s.charAt(i));
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
