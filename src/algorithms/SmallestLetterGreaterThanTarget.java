package algorithms;

/**
 * Created by akanksha on 12/12/2017.
 */
public class SmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        Character output = null;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                output = letters[i];
                return output;
            }
            if (i >= letters.length - 1) {
                output = letters[0];
                return output;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
    char target = 'k';
        SmallestLetterGreaterThanTarget s = new SmallestLetterGreaterThanTarget();
        System.out.print(s.nextGreatestLetter(letters, target));
    }
}
