package Math;

public class LC1979 {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int n:nums){
            min = Math.min(n,min);
            max = Math.max(n,max);
        }

        return gcd(min,max);
    }

    private int gcd(int a, int b){
        while(b!= 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
