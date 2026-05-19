package Array;

public class LC2540 {
    public static int getCommon(int[] nums1, int[] nums2){
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }

            if(nums1[i] < nums2[j]){
                i++;
            } else {
                j++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {2,3,4};
        int res = getCommon(num1,num2);
        System.out.println(res);
    }
}
