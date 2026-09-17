package HashTable;
import java.util.*;

public class LC1051 {
    public int heightChecker(int[] heights) {
        int[] expec = heights.clone();

        Arrays.sort(expec);

        int count = 0;

        for(int i=0; i<heights.length; i++){
            if(heights[i] != expec[i]){
                count++;
            }
        }

        return count;
    }
}
