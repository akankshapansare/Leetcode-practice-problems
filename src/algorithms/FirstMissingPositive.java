package algorithms;

import java.util.HashSet;

/**
 * Created by akanksha on 1/26/2018.
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                if(nums[i] < min) {
                    min = nums[i];
                }
                hs.add(nums[i]);
            }
        }
        if(min != 1) {
            result = 1;
        } else {
            for(int j = 0; j < nums.length; j++) {
                if(!hs.contains(min)) {
                    result = min;
                    break;
                }
                min = min + 1;
            }
            if(min == Integer.MAX_VALUE) {
                result = 1;
            }
            if(result == 0) {
                result = min;
            }
        }

        return result;
    }
}
