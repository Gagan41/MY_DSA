package Array;

public class LC268 {
    static int missingNumber(int[] nums){
        int s = 0,max = 0, n = nums.length;
        for(int i=0; i<n; i++){
            s += nums[i];
        }
        max = (n*(n+1)/2);
        return max - s;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int res = missingNumber(arr);
        System.out.println(res);
    }
}

//the approach is that calculate the sum of the elements in tha array the by using n*(n+1)/2 calculate the max sun then minus the
//array element sum from the max sum whicj give sthe missing number


//Given an array nums containing n distinct numbers in the range [0, n],
//        return the only number in the range that is missing from the array.
//
//Example 1:
//
//Input: nums = [3,0,1]
//
//Output: 2
//
//Explanation:
//
//n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2
//is the missing number in the range since it does not appear in nums.