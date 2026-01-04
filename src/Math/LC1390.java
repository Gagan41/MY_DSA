package Math;

public class LC1390 {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        for(int n:nums){
            int count = 0;
            int temp = 0;
            for(int i=1; i*i <= n; i++){
                if(n % i == 0){
                    int d1 = i;
                    int d2 = n/i;

                    if(d1 == d2){
                        count++;
                        temp += d1;
                    } else {
                        count += 2;
                        temp += d1 + d2;
                    }

                    if(count > 4) break;
                }
            }

            if(count == 4) sum += temp;
        }

        return sum;
    }
}
