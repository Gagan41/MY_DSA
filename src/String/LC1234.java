package String;

public class LC1234 {
    public int balancedString(String s) {
        int n = s.length();
        int req = n/4;

        int[] count = new int[128];

        for(char c:s.toCharArray()){
            count[c]++;
        }

        if (count['Q'] == req &&
                count['W'] == req &&
                count['E'] == req &&
                count['R'] == req) {
            return 0;
        }

        int l = 0, minlen = n;
        for (int r = 0; r < n; r++) {
            count[s.charAt(r)]--;

            while (l < n &&
                    count['Q'] <= req &&
                    count['W'] <= req &&
                    count['E'] <= req &&
                    count['R'] <= req) {

                minlen = Math.min(minlen, r - l + 1);
                count[s.charAt(l)]++;
                l++;
            }
        }

        return minlen;

    }
}
