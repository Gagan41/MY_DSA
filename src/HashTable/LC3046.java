package HashTable;
import java.util.HashMap;

public class LC3046 {
    public boolean isPossibleToSplit(int[] nums){
        HashMap<Integer, Integer> res = new HashMap<>();

        for(int n : nums){
            res.put(n,res.getOrDefault(n,0)+1);

            if(res.get(n) > 2){
                return false;
            }
        }
        return true;
    }
}
