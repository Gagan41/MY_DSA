package Math;
import java.util.*;

public class LC539 {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> min = new ArrayList<>();

        for(String time:timePoints){
            String[] parts = time.split(":");

            int hour = Integer.parseInt(parts[0]);
            int minu = Integer.parseInt(parts[1]);

            min.add(hour * 60 + minu);
        }

        Collections.sort(min);
        int ans = Integer.MAX_VALUE;

        for(int i=1; i<min.size(); i++){
            ans = Math.min(ans, min.get(i) - min.get(i-1));
        }

        int cir = (1440 - min.get(min.size() - 1)) + min.get(0);
        ans = Math.min(ans, cir);

        return ans;
    }
}
