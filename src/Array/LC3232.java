package Array;

public class LC3232 {
    public static boolean canAliceWin(int[] nums) {
        int singleDigit = 0,doubleDigit = 0;
        for(int n:nums){
            if(n>=10){
                singleDigit += n;
            }
            else{
                doubleDigit += n;
            }
        }
        return singleDigit != doubleDigit;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10};
        System.out.println(canAliceWin(arr));
    }
}

//
//Input: nums = [1,2,3,4,10]
//
//Output: false
//
//Explanation:
//
//Alice cannot win by choosing either single-digit or double-digit numbers.