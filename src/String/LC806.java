package String;

public class LC806 {
    public int[] numberOfLines(int[] widths, String s) {
        int l = 1, curw = 0;

        for(char c:s.toCharArray()){
            int w = widths[c-'a'];

            if(curw + w > 100){
                l++;
                curw  = w;
            } else {
                curw += w;
            }
        }

        return new int[]{l, curw};
    }
}
