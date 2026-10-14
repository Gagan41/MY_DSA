package String;

public class LC3723 {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9 * num){
            return "";
        }

        StringBuilder res = new StringBuilder();

        while(sum >= 9){
            res.append('9');
            sum -= 9;
            num--;
        }

        if(sum > 0){
            res.append((char) ('0' + sum));
            num--;
        }

        while(num-- > 0){
            res.append('0');
        }

        return res.toString();
    }
}
