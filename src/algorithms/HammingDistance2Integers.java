/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, calculate the Hamming distance.
 * <p>
 * 0 ≤ x, y < 2^31.
 * <p>
 * Example
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 */

package algorithms;

import java.util.Scanner;

public class HammingDistance2Integers {

    public static int hammingDistance(int x, int y) {

        //Convert decimal input binary numbers
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);

        //Make it to a 31 bit format
        for (int i = binaryX.length(); i < 31; i++) {
            binaryX = '0' + binaryX;
        }
        for (int i = binaryY.length(); i < 31; i++) {
            binaryY = '0' + binaryY;
        }

        //Calculate Hamming Distance
        int distance = 0;

        for (int i = 0; i < binaryX.length(); i++) {
            if (binaryX.charAt(i) != binaryY.charAt(i)) {

                distance++;
            }
        }
        return distance;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers whose hamming distance you want to calculate");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        System.out.println("Its Hamming Distance is: " + hammingDistance(input1, input2));
    }
}
