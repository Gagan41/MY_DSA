package Map;
import java.util.*;

public class LC3551 {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i][0] = nums[i];
            arr[i][1] = dsum(nums[i]);
        }

        Arrays.sort(arr, (a,b) -> {
            if(a[1] != b[1]){
                return a[1] - b[1];
            }

            return a[0] - b[0];
        });

        Map<Integer, Integer> idx = new HashMap<>();

        for(int i=0; i<n; i++){
            idx.put(nums[i], i);
        }

        boolean[] visit = new boolean[n];
        int swaps = 0;

        for(int i=0; i<n; i++){
            if(visit[i] || idx.get(arr[i][0]) == i){
                continue;
            }

            int cyc = 0;
            int j = i;

            while(!visit[j]){
                visit[j] = true;
                j = idx.get(arr[j][0]);
                cyc++;
            }

            swaps += cyc - 1;
        }

        return swaps;
    }

    //the usual sum of digits
    private int dsum(int n){
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
