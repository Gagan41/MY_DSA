package Bit;
import java.util.*;

public class LC401 {
    static List<String> readBinaryWatch(int turnedOn){
         List<String> res = new ArrayList<>();

         for(int h=0; h<12; h++){
             for(int m=0; m<60; m++){
                 int tot = Integer.bitCount(h) + Integer.bitCount(m);

                 if(tot == turnedOn){
                     String time = h + ":" + (m < 10 ? "0" + m : m);
                     res.add(time);
                 }
             }
         }
         return res;
    }

    public static void main(String[] args) {
        int t = 1;
        System.out.println(readBinaryWatch(t));
    }
}
