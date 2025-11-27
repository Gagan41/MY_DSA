package hackerRank;

public class HK_Char_Comparision {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for(int i=1; i<=s.length()-k; i++){
            String cur = s.substring(i,i+k);

            if(cur.compareTo(smallest) < 0){
                smallest = cur;
            }

            if(cur.compareTo(largest) > 0) {
                largest = cur;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        String res = getSmallestAndLargest(s,k);
        System.out.println(res);
    }
}
