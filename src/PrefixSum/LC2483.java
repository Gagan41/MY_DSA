package PrefixSum;

public class LC2483 {
    public int bestClosingTime(String customers) {
        char[] cus = customers.toCharArray();
        int n = cus.length;

        int[] prefixN = new int[n + 1];
        prefixN[0] = 0;

        for (int i = 0; i < n; i++) {
            prefixN[i + 1] = prefixN[i];
            if (cus[i] == 'N') prefixN[i + 1]++;
        }

        int[] suffixY = new int[n + 1];
        suffixY[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            suffixY[i] = suffixY[i + 1];
            if (cus[i] == 'Y') suffixY[i]++;
        }

        int min = Integer.MAX_VALUE;
        int best = 0;

        for (int j = 0; j <= n; j++) {
            int pen = prefixN[j] + suffixY[j];

            if (pen < min) {
                min = pen;
                best = j;
            }
        }

        return best;
    }
}
