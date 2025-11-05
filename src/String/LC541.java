package String;
import java.util.*;

public class LC541 {
    //using stringBuilder
    static String reverseStr1(String s, int k){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i+=2*k){
            int end = Math.min(i+k,s.length());

            StringBuilder temp = new StringBuilder(s.substring(i,end));
            sb.append(temp.reverse());

            if(end<s.length()){
                int nextEnd = Math.min(i+2*k,s.length());
                sb.append(s.substring(end,nextEnd));
            }
        }

        return sb.toString();
    }

    //two-pointers
    static String reverseStr(String s, int k){
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i+=2*k){
            int l = i;
            int r = Math.min(i+k-1, arr.length-1);
            reverse(arr,l,r);
        }

        return new String(arr);
    }

    static private void reverse(char[] arr, int l, int r){
        while(l<r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println("Original String: "+ s);
        int k = 2;
        String res = reverseStr(s,k);
        System.out.println("using two pointers: " + res);
        String res1 = reverseStr1(s,k);
        System.out.println("Using StringBuilder: " + res1);
    }
}
