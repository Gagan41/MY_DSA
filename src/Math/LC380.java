package Math;
import java.util.*;

public class LC380 {
    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> list;
    private Random random;

//    public RandomizedSet() {
//        map = new HashMap<>();
//        list = new ArrayList<>();
//        random = new Random();
//    }

    public boolean insert(int val){
        if(map.containsKey(val)){
            return false;
        }

        list.add(val);
        map.put(val, list.size()-1);

        return true;
    }

    public boolean remove(int val){
        if(!map.containsKey(val)){
            return false;
        }

        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Swap with last element
        list.set(index, lastElement);
        map.put(lastElement, index);

        // Remove last element
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom(){
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
