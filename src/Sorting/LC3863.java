package Sorting;

public class LC3863 {
    public int minOperations(String s) {
        int n = s.length();

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) return 0;
        if (n == 2) return -1;

        char first = s.charAt(0);
        char last = s.charAt(n - 1);

        char min = 'z';
        char max = 'a';

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        if (first == min || last == max) return 1;

        if (first == max && last == min) {
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) == max || s.charAt(i) == min) {
                    return 2;
                }
            }
            return 3;
        }

        return 2;
    }
}
