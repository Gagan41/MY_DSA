package Math;

public class LC812 {
    static double area(int[] a, int[] b, int[] c){
        return Math.abs(
                a[0]*(b[1]-c[1])+
                b[0]*(c[1]-a[1])+
                c[0]*(a[1]-b[1])
        ) / 2.0;
    }
    static double largestTriangleArea(int[][] points){
        double max = 0;
        int n = points.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                for(int k=j; k<n; k++){
                    max = Math.max(max , area(points[i], points[j], points[k]));
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        double max = largestTriangleArea(points);
        System.out.println(max);
    }
}
