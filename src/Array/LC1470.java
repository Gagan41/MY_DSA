package Array;

public class LC1470 {
    public int[] shuffle(int[] nums, int n) {
        int l = 0;
        int r = n;
        int[] res = new int[2*n];

        for(int i=0; i<2*n; i++){
            if(i %2 == 0){
                res[i] = nums[l];
                l++;
            }else {
                res[i] = nums[r];
                r++;
            }
        }

        return res;
    }
}
