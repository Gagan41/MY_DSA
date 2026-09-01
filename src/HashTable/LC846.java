package HashTable;
import java.util.*;

public class LC846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;

        if(n % groupSize != 0){
            return false;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int c:hand){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        while(!map.isEmpty()){
            int f = map.firstKey();

            for(int i=0; i<groupSize; i++){
                int c = f + i;

                if(!map.containsKey(c)){
                    return false;
                }

                int count = map.get(c);

                if(count == 1){
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
            }
        }

        return true;
    }
}
