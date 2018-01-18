package algorithms;

/**
 * Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.
 * <p>
 * Example:
 * Input:
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * Output: 3
 * Explanation:
 * The repeated subarray with maximum length is [3, 2, 1].
 */
public class MaximumLengthOfRepeatedSubArray {

    public static int findLength(int[] A, int[] B) {

        int iCount = 0;
        int jCount = 0;
        int maxCount = 0;

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < B.length; j++) {

                if (A[i] == B[j]) {
                    int currentCount = 0;
                    iCount = i;
                    jCount = j;

                    while (iCount < A.length && jCount < B.length && A[iCount] == B[jCount]) {
                        currentCount++;
                        iCount++;
                        jCount++;
                    }
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                    }
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 2, 1};
        int[] B = {3, 2, 1, 4, 7};
        System.out.println(findLength(A, B));
    }
}
