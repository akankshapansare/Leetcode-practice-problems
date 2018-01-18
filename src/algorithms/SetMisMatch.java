package algorithms;

/**
 * Created by akanksha on 12/16/2017.
 */
public class SetMisMatch {

    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = 1;
        int low = 0;
        int high = nums.length - 1;
        quickSort(low, high, nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if(nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        return new int[] {duplicate, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }

    public void quickSort(int low, int high, int[] arr) {
        if (low < high) {
            int count = low;
            int pivot = arr[low];
            for (int i = low + 1; i <= high; i++) {
                if (pivot > arr[i]) {
                    if (i - count > 1) {
                        int temp = arr[count + 1];
                        arr[count + 1] = arr[i];
                        arr[i] = temp;
                        count++;
                    } else {
                        count++;
                    }
                }
            }
            arr[low] = arr[count];
            arr[count] = pivot;
            quickSort(low, count - 1, arr);
            quickSort(count + 1, high, arr);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        SetMisMatch sm = new SetMisMatch();
        int[] input = {1, 2, 3, 3, 5, 6};
        int output[] = sm.findErrorNums(input);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
