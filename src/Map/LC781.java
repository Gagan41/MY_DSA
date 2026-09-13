package Map;
import java.util.*;

public class LC781 {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for(int x:answers){
            int count = map.getOrDefault(x, 0);

            if(count == 0){
                res += x + 1;
            }

            count++;

            if(count == x + 1){
                count = 0;
            }

            map.put(x, count);
        }

        return res;
    }
}
