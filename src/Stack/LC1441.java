package Stack;
import java.util.*;

public class LC1441 {
    static List<String> buildArray(int[] target, int n){
        List<String> res = new ArrayList<>();
        int i = 0;

        for(int N=1; N <= n && i < target.length; N++){
            res.add("Push");

            if(target[i] == N){
                i++;
            } else {
                res.add("Pop");
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        int n = 3;
        System.out.println(buildArray(arr, n));
    }
}
