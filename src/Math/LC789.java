package Math;

public class LC789 {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int dist = Math.abs(target[0]) + Math.abs(target[1]);

        for(int[] g:ghosts){
            int gdis = Math.abs(g[0] - target[0]) + Math.abs(g[1] - target[1]);

            if(gdis <= dist){
                return false;
            }

        }

        return true;
    }
}
