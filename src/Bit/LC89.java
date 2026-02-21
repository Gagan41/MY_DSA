package Bit;
import java.util.*;

public class LC89 {
    static List<Integer> grayCode(int n){
        List<Integer> res = new ArrayList<>();

        int size = n << 1; // 2^n
        for(int i=0; i<size; i++){
            res.add(i ^ (i >> 1)); //gray(i) = i ^ (i >> 1)
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(grayCode(n));
    }
}
