package Stack;

public class LC402 {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();

        for(char d:num.toCharArray()){
            while(k > 0 && sb.length() > 0 &&
                    sb.charAt(sb.length() -1) > d){
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(d);
        }

        while(k > 0 && sb.length() > 0){
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        int i = 0;
        while(i < sb.length() && sb.charAt(i) == '0'){
            i++;
        }

        String ans = sb.substring(i);

        return ans.isEmpty() ? "0" : ans;
    }
}
