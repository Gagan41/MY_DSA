package greedy;

public class LC605 {
    static boolean canPlaceFlowers(int[] flowerbed, int n){
        int len = flowerbed.length;

        for(int i=0; i<len && n>0; i++){
            if(flowerbed[i]==0){
                int l = (i == 0) ? 0 : flowerbed[i-1];
                int r = (i == len-1) ? 0 : flowerbed[i+1];

                if(r==0 && l==0){
                    flowerbed[i]=1;
                    n--;
                }
            }
        }
        return n==0;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(arr,n));
    }
}


//You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted
// in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false