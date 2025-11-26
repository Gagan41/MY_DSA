package Math;

public class LC1295 {
    static int findNumbers(int[] nums){
        int count = 0;

        for(int x: nums){
            int digit = 0;
            while(x > 0){
                x /= 10;
                digit++;
            }

            if(digit % 2 == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int res = findNumbers(arr);
        System.out.println(res);
    }
}
