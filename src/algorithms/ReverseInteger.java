package algorithms;

/**
 * Created by akanksha on 1/16/2018.
 */
public class ReverseInteger {
    public int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        boolean negative = false;
        int y;
        if (x == 0) {
            return x;
        }
        if (x < 0) {
            negative = true;
            x = -1 * x;
        }

        while (x > 0) {
            sb.append(x % 10);
            x = x / 10;
        }
        try {
            y = Integer.parseInt(String.valueOf(sb));
        } catch (NumberFormatException e) {
            return 0;
        }

        if (negative) {
            y = -1 * y;
        }

        return y;
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        int a = 1111199999;
        System.out.print(ri.reverse(a));
    }
}
