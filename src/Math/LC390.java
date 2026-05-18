package Math;

public class LC390 {
    public int lastRemaining(int n) {
        int l = 1, r = 1, rem = n;
        boolean lr = true;

        while(rem > 1){
            if(lr || rem % 2 == 1){
                l += r;
            }

            rem /= 2;
            r *= 2;
            lr = !lr;
        }

        return l;
    }
}
