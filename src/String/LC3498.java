package String;

public class LC3498 {

        public static int reverseDegree(String s) {
            int sum = 0;

            for(int i=0; i<s.length(); i++){
                int rev = 26 - (s.charAt(i)-'a');
                sum += rev * (i+1);
            }

            return sum;
        }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(reverseDegree(s));
    }

}
