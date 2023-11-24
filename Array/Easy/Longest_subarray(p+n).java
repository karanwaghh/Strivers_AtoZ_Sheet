import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		long sum=0;
		int maxLen=0;
		HashMap<Long,Integer> map=new HashMap<>();

		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(sum==k){
				maxLen=Math.max(maxLen,i+1);
			}
			long rem=sum-k;
			if(map.containsKey(rem)){
				maxLen=Math.max(maxLen,i-map.get(rem));
			}
			if(!map.containsKey(sum)){
				map.put(sum,i);
			}
		}
		return maxLen;
	}
}