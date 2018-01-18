package algorithms;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int nonZeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && i != nonZeroCount) {
                int temp = nums[i];
                nums[i] = nums[nonZeroCount];
                nums[nonZeroCount] = temp;
                nonZeroCount++;
            } else if (nums[i] != 0) {
                nonZeroCount++;
            }
        }
    }
}
