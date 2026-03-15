package HashTable;
import java.util.*;

public class LC575 {
    static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int max = candyType.length / 2;

        for(int n:candyType){
            set.add(n);
        }

        return Math.min(max, set.size());
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        System.out.println(distributeCandies(arr));
    }
}
