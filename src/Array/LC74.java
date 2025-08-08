package Array;

public class LC74 {
    //Made using liner search not Binary search
    static boolean searchMatrix(int[][] matrix, int target) {
        boolean found = false;
        for(int i=0; i<matrix.length; i++){
            for(int j=0 ; j<matrix[i].length; j++){
                if(matrix[i][j] == target){
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        return found;
    }

    //binary search
    static boolean searchBinary(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
        System.out.println(searchBinary(matrix,target));
    }
}


//You are given an m x n integer matrix matrix with the following two properties:
//
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//
//You must write a solution in O(log(m * n)) time complexity.

//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true