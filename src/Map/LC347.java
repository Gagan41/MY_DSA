package Map;
import java.util.*;

public class LC347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buc = new ArrayList[nums.length + 1];

        for(int n:map.keySet()){
            int freq = map.get(n);

            if(buc[freq] == null){
                buc[freq] = new ArrayList<>();
            }

            buc[freq].add(n);
        }

        int[] res = new int[k];
        int idx = 0;

        for(int f=buc.length-1; f>=0 && idx<k; f--){
            if(buc[f] != null){
                for(int n:buc[f]){
                    res[idx++] = n;

                    if(idx == k){
                        break;
                    }
                }
            }
        }

        return res;
    }
}
