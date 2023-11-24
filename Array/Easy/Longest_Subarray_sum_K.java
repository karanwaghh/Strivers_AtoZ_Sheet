import java.util.HashMap;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int right=0;
        int left=0;
        int maxLen=0;
         int sum=0;
        int n=a.length;
        
        while(right<n){
            sum+=a[right];
            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}