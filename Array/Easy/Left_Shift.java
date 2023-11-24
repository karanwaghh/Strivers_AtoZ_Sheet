import java.util.* ;
import java.io.*; 
public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int i=1;
        while(i<n){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            i++;
        }
        return arr;
    }
}