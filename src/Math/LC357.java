package Math;

public class LC357 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;

        int res= 10;
        int unq = 9;
        int avail = 9;

        for(int i=2; i<= n && avail > 0; i++){
            unq *= avail;
            res += unq;
            avail--;
        }

        return res;
    }
}
