package Math;

public class LC1925 {
    static int countTriples(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            int a = 1, b = i-1;
            int c = i*i;

            while(a < b){
                int sum = a*a + b*b;
                if(sum == c){
                    count += 2;
                    a++;
                    b--;
                }
                else if(sum < c) a++;
                else b--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countTriples(n));
    }
}
