package String;

public class LC2833 {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();int cntL=0;int cntR=0;
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L'){
                cntL++;
            }else if(moves.charAt(i)=='R'){
                cntR++;
            }
        }
        int cnt1=0;
        if(cntL>cntR){
            for(int i=0;i<n;i++){
                if(moves.charAt(i)=='_'){
                    cnt1++;
                }else if(moves.charAt(i)=='L'){
                    cnt1++;
                }else{
                    cnt1--;
                }
            }
            return cnt1;
        }else{
            for(int i=0;i<n;i++){
                if(moves.charAt(i)=='_'){
                    cnt1++;
                }else if(moves.charAt(i)=='R'){
                    cnt1++;
                }else{
                    cnt1--;
                }
            }
            return cnt1;
        }
    }

    public int furthestDistanceFromOrigin1(String moves) {
        int left = 0, right = 0, blank = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') left++;
            else if (ch == 'R') right++;
            else blank++;
        }

        return Math.abs(right - left) + blank;
    }
}
