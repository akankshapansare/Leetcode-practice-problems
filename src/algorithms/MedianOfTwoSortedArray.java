package algorithms;

/**
 * Created by akanksha on 1/17/2018.
 */
public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[nums1.length + nums2.length];
        double median;
        while (i <= nums1.length - 1 && j <= nums2.length - 1) {
            if (nums1[i] >= nums2[j]) {
                nums3[k] = nums2[j];
                j++;
                k++;
            } else {
                nums3[k] = nums1[i];
                i++;
                k++;
            }
        }
        while (i <= nums1.length - 1) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while (j <= nums2.length - 1) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        int length = nums3.length;
        if (nums3.length % 2 == 0) {
            int x = nums3[length / 2] + nums3[(length / 2) - 1];
            median = (double) x / 2;
        } else {
            median = nums3[length / 2];
        }
        return median;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        MedianOfTwoSortedArray ms = new MedianOfTwoSortedArray();
        System.out.print(ms.findMedianSortedArrays(num1, num2));
    }
}