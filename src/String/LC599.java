package String;
import java.util.*;

public class LC599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<list1.length; i++){
            map.put(list1[i], i);
        }

        List<String> res = new ArrayList<>();
        int msum = Integer.MAX_VALUE;

        for(int j=0; j<list2.length; j++){
            if(map.containsKey(list2[j])){
                int sum = map.get(list2[j]) + j;

                if(sum < msum){
                    msum = sum;
                    res.clear();
                    res.add(list2[j]);
                } else if(sum == msum){
                    res.add(list2[j]);
                }
            }
        }

        return res.toArray(new String[0]);
    }
}
