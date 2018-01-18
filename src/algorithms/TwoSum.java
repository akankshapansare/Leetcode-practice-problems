package algorithms;

import java.util.HashMap;

/**
 * Created by akanksha on 12/28/2017.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int input1 = 0;

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            input1 = nums[j];
            if (hm.containsKey(target - input1) && hm.get(target - input1) != j) {
                return new int[]{j, hm.get(target - input1)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int input[] = {2, 7, 11, 15};
        int target = 9;
        int[] output;
        TwoSum tw = new TwoSum();
        output = tw.twoSum(input, target);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }

    }
}
