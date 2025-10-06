package Array;
import java.util.*;

public class LC506 {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];

        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = score[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr,(a,b) -> b[0]-a[0]);

        for(int i=0; i<n; i++){
            int idx = arr[i][1];
            if(i==0) res[idx] = "Gold Medal";
            else if(i==1) res[idx] = "Silver Medal";
            else if(i==2) res[idx] = "Bronze Medal";
            else res[idx] = String.valueOf(i+1);
        }

        return res;

    }
}

//You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition.
// All the scores are guaranteed to be unique.
//
//The athletes are placed based on their scores, where the 1st place athlete has the highest score,
// the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
//
//The 1st place athlete's rank is "Gold Medal".
//The 2nd place athlete's rank is "Silver Medal".
//The 3rd place athlete's rank is "Bronze Medal".
//For the 4th place to the nth place athlete, their rank is their placement number
// (i.e., the xth place athlete's rank is "x").
//Return an array answer of size n where answer[i] is the rank of the ith athlete.
//Example 1:
//
//Input: score = [5,4,3,2,1]
//Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
//Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
