package Array;

public class LC1822 {
    public static int arraySign(int[] nums) {
        int p = 1;
        for(int i:nums){
            p *= i;
        }
        return ((p==0) ? 0 : (p<0) ? -1 : 1);
    }

    public static void main(String[] args) {
        int [] arr = {-1,-2,-3,-4,3,2,1};
        int res = arraySign(arr);
        System.out.println(res);
    }
}

//Example 1:
//
//Input: nums = [-1,-2,-3,-4,3,2,1]
//Output: 1
//Explanation: The product of all values in the array is 144, and signFunc(144) = 1