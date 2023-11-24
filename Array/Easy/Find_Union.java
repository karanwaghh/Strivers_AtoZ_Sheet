public import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(a[i]);
        }
        for(int i=0;i<m;i++){
            list.add(b[i]);
        }
        Collections.sort(list);
        ans.add(list.get(0));
        int j=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)!=ans.get(j)){
                ans.add(list.get(i));
                j++;
            }
        }
        return ans;
    }
}