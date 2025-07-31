package Array;

public class LC1822 {
    public static int arraySign(int[] nums) {
        int sign = 1;
        for (int i : nums) {
            if (i == 0) return 0;
            if (i < 0) sign *= -1;
        }
        return sign;
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