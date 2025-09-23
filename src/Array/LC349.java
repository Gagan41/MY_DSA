package Array;
import java.util.*;

public class LC349 {
    static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        for(int n:nums1){
            set.add(n);
        }

        Set<Integer> res = new HashSet<>();
        for(int n: nums2){
            if(set.contains(n)){
                res.add(n);
            }
        }

        int[] resarr = new int[res.size()];
        int i = 0;
        for(int n: res){
            resarr[i++]= n;
        }
        return resarr;
    }

    static int[] intersection1(int[] num1,int[] num2){
        Arrays.sort(num1);
        Arrays.sort(num2);

        int i = 0,j = 0;
        Set<Integer> res = new HashSet<>();

        while(i<num1.length && j<num2.length){
            if(num1[i] == num2[j]){
                res.add(num1[i]);
                i++;
                j++;
            } else if(num1[i] < num2[j]){
                i++;
            } else {
                j++;
            }
        }

        int resarr[] = new int[res.size()];
        int k = 0;
        for(int n:res){
            resarr[k++] = n;

        }
        return resarr;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,2,1};
        int arr2[] ={2,2};
        int[] res1 = intersection(arr1,arr2);
        System.out.println(Arrays.toString(res1));
        int[] res2 = intersection1(arr1,arr2);
        System.out.println(Arrays.toString(res2));

    }
}

//Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must be unique and you may return the result in any order.

//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.