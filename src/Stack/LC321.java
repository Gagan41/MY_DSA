package Stack;

public class LC321 {
    static int[] maxNumber(int[] nums1, int[] nums2, int k){
        int m = nums1.length, n = nums2.length;
        int[] res = new int[k];

        for(int i=Math.max(0,k-n); i<=Math.min(k,m); i++){
            int[] seq1 = maxSequence(nums1, i);
            int[] seq2 = maxSequence(nums2, k-i);
            int[] candidate = merge(seq1, seq2, k);

            if(greater(candidate, 0, res, 0)){
                res = candidate;
            }
        }
        return res;
    }

    private static int[] maxSequence(int[] nums, int k){
        int num = nums.length;
        int[] stack = new int[k];
        int top = -1;
        int remove = num-k;

        for(int n: nums){
            while(top>=0 && stack[top]<n && remove>0){
                top--;
                remove--;
            }
            if(top+1<k){
                stack[++top]=n;
            } else {
                remove--;
            }
        }
        return stack;
    }

    private static int[] merge(int[]nums1, int[]nums2, int k){
        int[] res = new int[k];
        int i = 0, j = 0, r = 0;
        while(r<k){
            if(greater(nums1,i,nums2,j)){
                res[r++] = nums1[i++];
            } else {
                res[r++] = nums2[j++];
            }
        }
        return res;
    }

    private static boolean greater(int[] nums1, int i, int[] nums2, int j){
        int m = nums1.length, n = nums2.length;
        while(i<m && j<n && nums1[i] == nums2[j]){
            i++;
            j++;
        }
        return j == n || (i<m && nums1[i]>nums2[j]);
    }

    public static void main(String[] args) {
        int[] nums1 = {3,4,6,5};
        int[] nums2 = {9,1,2,5,8,3};
        int k = 5;
        int[] res = maxNumber(nums1,nums2,k);
        for(int n:res){
            System.out.println(n+" ");
        }
    }
}
//You are given two integer arrays nums1 and nums2 of lengths m and n respectively.
// nums1 and nums2 represent the digits of two numbers. You are also given an integer k.
//
//Create the maximum number of length k <= m + n from digits of the two numbers.
// The relative order of the digits from the same array must be preserved.
//
//Return an array of the k digits representing the answer.
//Example 1:
//
//Input: nums1 = [3,4,6,5], nums2 = [9,1,2,5,8,3], k = 5
//Output: [9,8,6,5,3]
//Example 2:
//
//Input: nums1 = [6,7], nums2 = [6,0,4], k = 5
//Output: [6,7,6,0,4]
//Example 3:
//
//Input: nums1 = [3,9], nums2 = [8,9], k = 3
//Output: [9,8,9]