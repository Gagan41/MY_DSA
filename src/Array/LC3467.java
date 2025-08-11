package Array;

public class LC3467 {
    static int[] transformArray(int[] nums) {
        int e =  0,o = 0;
        for(int i:nums){
            if(i%2==0) e++;
            else o++;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < e; i++) {
            result[i] = 0;
        }
        for (int i = e; i < nums.length; i++) {
            result[i] = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
        int[] res = transformArray(arr);
        for(int n:res){
            System.out.print(n+" ");
        }
    }
}

//You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:
//
//Replace each even number with 0.
//Replace each odd numbers with 1.
//Sort the modified array in non-decreasing order.
//Return the resulting array after performing these operations.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,1]
//
//Output: [0,0,1,1]
//
//Explanation:
//
//Replace the even numbers (4 and 2) with 0 and the odd numbers (3 and 1) with 1. Now, nums = [0, 1, 0, 1].
//After sorting nums in non-descending order, nums = [0, 0, 1, 1].