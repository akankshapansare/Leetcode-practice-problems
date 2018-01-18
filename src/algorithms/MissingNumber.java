package algorithms;

import java.util.HashSet;

/**
 * Created by akanksha on 12/24/2017.
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        int output = 0;

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        for (int j = 0; j <= nums.length; j++) {
            if (hs.contains(j)) {

            } else {
                output = j;
            }
        }
        return output;
    }
}
