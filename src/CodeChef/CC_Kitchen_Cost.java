package CodeChef;

public class CC_Kitchen_Cost {
    public int compute(int n, int x, int[] a, int[] b) {
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] >= x) {
                total += b[i];
            }
        }

        return total;
    }
}

