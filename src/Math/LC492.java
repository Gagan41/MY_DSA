package Math;

public class LC492 {
    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);

        while(w > 0){
            if(area % w == 0){
                int l = area / w;
                w = w;
                return new int[]{l, w};
            }
            w--;
        }
        return new int[]{area, 1};
    }
}
