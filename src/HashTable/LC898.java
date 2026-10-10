package HashTable;
import java.util.*;

public class LC898 {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> cur = new HashSet<>();

        for(int n:arr){
            Set<Integer> next = new HashSet<>();
            next.add(n);

            for(int val:cur){
                next.add(val | n);
            }

            res.addAll(next);
            cur = next;
        }

        return res.size();
    }
}
