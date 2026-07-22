package Array;

public class LC457 {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;

            boolean forward = nums[i] > 0;
            int slow = i;
            int fast = i;

            // Floyd's Cycle Detection
            while (true) {
                slow = next(nums, slow, forward);
                if (slow == -1) break;

                fast = next(nums, fast, forward);
                if (fast == -1) break;

                fast = next(nums, fast, forward);
                if (fast == -1) break;

                if (slow == fast) {
                    return true;
                }
            }

            // Mark all nodes in this traversal as visited
            int curr = i;
            while (nums[curr] != 0 && (nums[curr] > 0) == forward) {
                int nxt = ((curr + nums[curr]) % n + n) % n;
                nums[curr] = 0;
                curr = nxt;
            }
        }

        return false;
    }

    private int next(int[] nums, int curr, boolean forward) {
        if (nums[curr] == 0) return -1;

        if ((nums[curr] > 0) != forward) return -1;

        int n = nums.length;
        int nxt = ((curr + nums[curr]) % n + n) % n;

        // Self-loop is not allowed
        if (nxt == curr) return -1;

        // Direction must remain the same
        if ((nums[nxt] > 0) != forward) return -1;

        return nxt;
    }
}
