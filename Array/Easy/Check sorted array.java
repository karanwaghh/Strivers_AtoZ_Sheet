public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int count=0;
        for(int i=0;i<n-1;i++){
            if(a[i]<=a[(i+1)]){
                count++;
            }
        }
        if(count==n-1){
            return 1;
        }
        return 0;
    }
}