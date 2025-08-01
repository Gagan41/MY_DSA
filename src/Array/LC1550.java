package Array;

public class LC1550 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i<=arr.length-3; i++ ){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr  = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
}

//Check every three consecutive numbers in the array for parity.


//Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
//
//
//Example 1:
//
//Input: arr = [2,6,4,1]
//Output: false
//Explanation: There are no three consecutive odds.