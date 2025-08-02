package Array;

public class LC977 {
    static int[] sortedSquares(int arr[]){
        int l = 0, r = arr.length-1 , pos = arr.length-1;
        int[] res =  new int[arr.length];
        while(l<=r){
            if(Math.abs(arr[l])>=Math.abs(arr[r])){
                res[pos] = (int)Math.pow(arr[l], 2);
                pos--;
                l++;
            }
            else{
                res[pos] = (int)Math.pow(arr[r], 2);
                pos--;
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
         int [] arr = {-4,-1,0,3,10};
        int[] result = sortedSquares(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}


//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//
//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].