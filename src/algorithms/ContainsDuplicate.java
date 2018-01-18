package algorithms;

import java.util.HashMap;

/**
 * Created by akanksha on 12/22/2017.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put(nums[i], 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] input = {1, 2, 3, 4};
        System.out.print(cd.containsDuplicate(input));
    }

}
