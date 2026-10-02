package HashTable;

public class LC621 {
    public static int leastInterval(char[] tasks, int n){
        int[] freq = new int[26];

        for(char t:tasks){
            freq[t-'A']++;
        }

        int maxf = 0;
        for(int c:freq){
            maxf = Math.max(maxf, c);
        }

        int maxc = 0;
        for(int c:freq){
            if(c == maxf){
                maxc++;
            }
        }

        int reqlen = (maxf - 1) * (n + 1) + maxc;

        return Math.max(tasks.length, reqlen);
    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 3;

        System.out.println(leastInterval(tasks, n));
    }
}
