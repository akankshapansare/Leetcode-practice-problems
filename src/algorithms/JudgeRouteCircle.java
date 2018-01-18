/**
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
 * <p>
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
 * <p>
 * EXAMPLES
 * Input: "UD"
 * Output: true
 * <p>
 * Input: "LL"
 * Output: false
 */

package algorithms;

import java.util.Scanner;

public class JudgeRouteCircle {

    public static boolean judgeCircle(String moves) {

        int xCoordinate = 0;
        int yCoordinate = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                yCoordinate++;
            }
            if (moves.charAt(i) == 'D') {
                yCoordinate--;
            }
            if (moves.charAt(i) == 'L') {
                xCoordinate--;
            }
            if (moves.charAt(i) == 'R') {
                xCoordinate++;
            }
        }
        if (xCoordinate == 0 && yCoordinate == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String moves;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your move");
        moves = scanner.nextLine();

        if (judgeCircle(moves)) {
            System.out.println("Given sequence of moves is circular");
        } else {
            System.out.println("Given sequence of moves is not circular");
        }
    }
}
