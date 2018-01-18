package algorithms;

/**
 * Created by akanksha on 12/3/2017.
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max) {
            max = count;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes maxOnes = new MaxConsecutiveOnes();
        int[] array = {1, 1, 1, 0, 0, 1, 1, 1, 1, 0};
        System.out.print(maxOnes.findMaxConsecutiveOnes(array));
    }
}
