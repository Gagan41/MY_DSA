package Sorting;
import java.util.*;

public class LC1636 {
    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int key : freq.keySet()) {
            buckets.get(freq.get(key)).add(key);
        }

        int idx = 0;
        int[] res = new int[nums.length];

        for (int f = 1; f <= nums.length; f++) {
            if (!buckets.get(f).isEmpty()) {

                buckets.get(f).sort(Collections.reverseOrder());

                for (int num : buckets.get(f)) {
                    for (int i = 0; i < f; i++) {
                        res[idx++] = num;
                    }
                }
            }
        }

        return res;
    }
}
