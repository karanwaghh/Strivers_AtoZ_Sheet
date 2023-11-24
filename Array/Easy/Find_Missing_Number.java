import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i])
            return i;
            else if(i==nums.length-1)
            return i+1;
        }
        return 0;
    }
}