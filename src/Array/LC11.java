package Array;

public class LC11 {
    static int maxArea(int[] height){
        int area = 0, l = 0, r = height.length-1;
        while(l<r){
            area = Math.max(area,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            } else {
                r--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(arr);
        System.out.println(res);
    }
}

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.

//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
//In this case, the max area of water (blue section) the container can contain is 49.