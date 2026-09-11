package Math;

public class LC3483 {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for(int d:digits){
            freq[d]++;
        }

        int count = 0;

        for(int n=100; n<=999; n++){
            if(n % 2 != 0){
                continue;
            }

            int a = n / 100;
            int b = (n / 10) % 10;
            int c = n % 10;

            int[] used = new int[10];
            used[a]++;
            used[b]++;
            used[c]++;

            boolean possible = true;

            for(int i=0; i<10; i++){
                if(used[i] > freq[i]){
                    possible = false;
                    break;
                }
            }

            if(possible){
                count++;
            }
        }

        return count;
    }
}
