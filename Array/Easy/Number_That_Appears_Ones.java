import java.util.*;

public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == 1) {
                return num;
            }
        }
        
        return -1;
    }
}