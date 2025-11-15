package Searching;

public class LC4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int x = nums1.length;
        int y = nums2.length;
        int l = 0, r = x;

        while(l<=r){
            int px = (l+r)/2;
            int py = (x+y+1)/2-px;

            int maxlx = (px == 0) ? Integer.MIN_VALUE : nums1[px - 1];
            int minrx = (px == x) ? Integer.MAX_VALUE : nums1[px];

            int maxly = (py == 0) ? Integer.MIN_VALUE : nums2[py - 1];
            int minry = (py == y) ? Integer.MAX_VALUE : nums2[py];

            if(maxlx <= minry && maxly <= minrx){
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxlx, maxly) + Math.min(minrx, minry)) / 2;
                } else {
                    return (double)Math.max(maxlx, maxly);
                }
            }
            else if(maxlx>minry){
                r = px-1;
            }
            else{
                l = px+1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted properly");
    }
}
