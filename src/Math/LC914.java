package Math;
import java.util.*;

public class LC914 {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int c:deck){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        int gcd = 0;
        for(int count:freq.values()){
            gcd = gcd(gcd, count);
        }

        return gcd > 1;
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
