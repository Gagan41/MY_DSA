package Array;
import java.util.*;

public class LC2533 {
    public static int[] separateDigits(int[] nums){
        List<Integer> res = new ArrayList<>();

        for(int n:nums){
            String s = String.valueOf(n);

            for(char ch:s.toCharArray()){
                res.add(ch-'0');
            }
        }

        int[] ans = new int[res.size()];

        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        int[] ans = separateDigits(nums);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
