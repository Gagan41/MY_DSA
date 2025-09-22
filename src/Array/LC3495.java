package Array;

public class LC3495 {
    public long minOperations(int[][] queries) {
        long tot = 0;
        long[] pow4 = new long[20];
        pow4[0] = 1;
        for (int i = 1; i < pow4.length; i++) {
            pow4[i] = pow4[i - 1] * 4;
        }

        for (int[] q : queries) {
            long l = q[0], r = q[1];
            long steps = 0;

            for (int k = 0; k < pow4.length - 1; k++) {
                long start = pow4[k];
                long end = pow4[k + 1] - 1;

                if (r < start) break;
                if (l > end) continue;

                long left = Math.max(l, start);
                long right = Math.min(r, end);
                long count = right - left + 1;

                steps += count * (k + 1);
            }
            tot += (steps + 1) / 2;
        }
        return tot;
    }
}

//You are given a 2D array queries, where queries[i] is of the form [l, r].
// Each queries[i] defines an array of integers nums consisting of elements ranging from l to r, both inclusive.
//
//In one operation, you can:
//
//Select two integers a and b from the array.
//Replace them with floor(a / 4) and floor(b / 4).
//Your task is to determine the minimum number of operations required to reduce all elements of the array
// to zero for each query. Return the sum of the results for all queries.