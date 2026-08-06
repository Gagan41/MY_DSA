package Math;

public class LC3345 {
    public int smallestNumber(int n, int t) {
        int num = n;

        while(true){
            int prod = digitalProduct(num);

            if(prod % t == 0){
                return num;
            }

            num++;
        }
    }

    private int digitalProduct(int num){
        int prod = 1;

        while(num > 0){
            prod *= (num % 10);
            num /= 10;
        }

        return prod;
    }
}
