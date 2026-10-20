package Searching;

public class LC300 {
    public int lengthOfLIS(int[] nums) {
        int nr = nums.length;
        int[] arr  = new int[nr];
        int len  = 0;

        for(int n:nums){
            int l = 0, r = len;

            while(l < r){
                int mid = l + (r-l)/2;

                if(arr[mid] < n){
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }

            arr[l] = n;

            if(l == len) len++;
        }

        return len;
    }
}
