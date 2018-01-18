package algorithms;

import java.util.ArrayList;

/**
 * ou're now a baseball game point recorder.
 * <p>
 * Given a list of strings, each string can be one of the 4 following types:
 * <p>
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 * <p>
 * You need to return the sum of the points you could get in all the rounds.
 * <p>
 * Example 1:
 * Input: ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 * Round 1: You could get 5 points. The sum is: 5.
 * Round 2: You could get 2 points. The sum is: 7.
 * Operation 1: The round 2's data was invalid. The sum is: 5.
 * Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
 * Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
 */
public class BaseBallGame {
    public static int calPoints(String[] ops) {
        ArrayList<Integer> points = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "C":
                    if (points.size() > 0) {
                        sum = sum - points.remove(points.size() - 1);
                    }
                    break;
                case "D":
                    if (points.size() > 0) {
                        int previousData = points.get(points.size() - 1);
                        points.add(previousData * 2);
                        sum = sum + (previousData * 2);
                    }
                    break;
                case "+":
                    if (points.size() > 1) {
                        int lastTwoSums = (points.get(points.size() - 1) + (points.get(points.size() - 2)));
                        points.add(lastTwoSums);
                        sum = sum + lastTwoSums;
                    }
                    break;
                default:
                    points.add(Integer.valueOf(ops[i]));
                    sum = sum + Integer.valueOf(ops[i]);
            }
        }
        return sum;
    }
}
