package Enumeration;
import java.util.*;

public class LC1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String d = "123456789";

        for(int len = 2; len <= 9; len++){
            for(int s = 0; s + len <=9; s++){
                int num = Integer.parseInt(d.substring(s,s + len));

                if(num >= low && num <= high){
                    ans.add(num);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
