package algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by akanksha on 12/19/2017.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int temp;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                temp = hm.get(nums[i]);
                hm.put(nums[i], temp + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }
}
