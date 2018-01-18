package algorithms;

/**
 * Created by akanksha on 12/3/2017.
 */
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int j = 0;
        boolean flag = false;
        for (int i = 0; i < nums1.length; i++) {
            while (nums1[i] != nums2[j]) {
                j++;
            }
            if ((j + 1) < nums2.length) {
                for (j = j + 1; j < nums2.length; j++) {
                    if (nums1[i] < nums2[j]) {
                        nums1[i] = nums2[j];
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (!flag) {
                    nums1[i] = -1;
                }
            } else {
                nums1[i] = -1;
            }
            j = 0;
        }
        return nums1;
    }

    public static void main(String[] args) {
        NextGreaterElement greaterElement = new NextGreaterElement();
        int[] nums1 = {2, 1, 3};
        int[] nums2 = {2, 3, 1};
        int[] output = greaterElement.nextGreaterElement(nums1, nums2);

        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
