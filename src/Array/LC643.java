package Array;

public class LC643 {
    static double findMaxAverage(int[] nums, int k){
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        int maxSum = sum;
        for(int i=k; i<n; i++){
            sum -= nums[i-k];
            sum += nums[i];
            maxSum = Math.max(sum,maxSum);
        }

        return (double) maxSum/k;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        double res = findMaxAverage(arr,k);
        System.out.println(res);
    }
}
