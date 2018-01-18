package algorithms;

/**
 * Created by akanksha on 12/28/2017.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int output = 0;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    output = i;
                    return output;
                }
            }
            for (int i = 0; i < nums.length - 1; i++) {
                if ((nums[i] < target && target < nums[i + 1])) {
                    output = i + 1;
                    return output;
                }
            }
            return output;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6};
        int target = 7;
        SearchInsertPosition sp = new SearchInsertPosition();
        System.out.print(sp.searchInsert(input, target));
    }
}
