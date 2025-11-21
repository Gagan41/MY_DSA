package CodeChef;
import java.util.*;

public class CC_chef_dolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int res = findMissing(arr);
            System.out.println(res);

            int res1 = findMissing1(arr);
            System.out.println(res1);
        }
    }

    //using hashset
    static int findMissing(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int n : arr){
            if(set.contains(n)){
                set.remove(n);
            } else {
                set.add(n);
            }
        }

        for(int x : set){
            return x;
        }

        return -1;
    }

    //using xor
    static int findMissing1(int[] arr){
        int xor = 0;

        for(int n : arr){
            xor ^= n;
        }

        return xor;
    }
}
