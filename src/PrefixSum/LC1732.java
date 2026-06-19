package PrefixSum;

public class LC1732 {
    public int largestAltitude(int[] gain) {
        int al = 0, maxal = 0;

        for(int g:gain){
            al += g;
            maxal = Math.max(maxal, al);
        }

        return maxal;
    }
}
