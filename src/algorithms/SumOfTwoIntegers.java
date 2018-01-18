package algorithms;

/**
 * Created by akanksha on 12/3/2017.
 */

/* Explanation
        3 - 011
        2 - 010

        & - 010 = 2 = carry
        ^ - 001 = 1 = x
        <<- 100 = y

        carry = 0000
        x =     1001
        y =     0000

        5 - 101  */

public class SumOfTwoIntegers {
    public int calculateSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b; //XOR
            b = carry << 1;
        }
        return a;
    }
}
