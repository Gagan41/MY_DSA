package Sorting;
import java.util.*;

public class LC350 {
    public int[] intersect(int[] nums1, int[] nums2){
        int[] res = new int[Math.min(nums1.length,nums2.length)];
        boolean[] used = new boolean[nums2.length];

        int k = 0;

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(!used[j] && nums1[i] == nums2[j]){
                    res[k++] = nums2[j];
                    used[j] = true;
                    break;
                }
            }
        }

        return Arrays.copyOf(res,k);
    }

    public int[] intersect1(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<>();

        for(int n:nums1){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        List<Integer> list = new ArrayList<>();

        for(int n:nums2){
            if(map.containsKey(n) && map.get(n) > 0){
                list.add(n);
                map.put(n, map.get(n) - 1);
            }
        }

        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }
}
