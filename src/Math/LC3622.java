package Math;

public class LC3622 {
    public boolean checkDivisibility(int n) {
        int temp = n, sum = 0, prod = 1;

        while(temp > 0){
            int cur =  temp % 10;

            sum += cur;
            prod *= cur;

            temp /= 10;
        }

        return n % (sum + prod) == 0;
    }
}
