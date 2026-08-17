package Math;

public class LC1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];

        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for(int i=2; i<coordinates.length; i++){
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            int l = (y - y1) * (x2 - x1);
            int r = (x - x1) * (y2 - y1);

            if(l != r){
                return false;
            }
        }

        return true;
    }
}
