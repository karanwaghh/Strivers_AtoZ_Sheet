public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
        int left = 0, right = 0, maxLen = 0, flippedCount = 0;

        while (right < n) {
            if (vehicle[right] == 0) {
                flippedCount++;
            }

            while (flippedCount > m) {
                if (vehicle[left] == 0) {
                    flippedCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}