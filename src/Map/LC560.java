package Map;
import java.util.*;

public class LC560 {
    static int subarraySum(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int res = 0;
        int psum = 0;

        for(int n:nums ){
            psum += n;
            if(map.containsKey(psum - k)){
                res += map.get(psum - k);
            }

            map.put(psum, map.getOrDefault(psum,0)+1);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-5,5,-5,1,4};
        int k = 5;
        int res = subarraySum(nums,k);
        System.out.println(res);
    }
}
