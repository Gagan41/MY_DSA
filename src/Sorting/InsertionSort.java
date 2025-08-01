package Sorting;

public class InsertionSort {
    public static void iSort(int [] arr){
        int n = arr.length;;
        for( int i=1; i<n; i++){
            int key = arr[i];   // Current element to insert
            int j = i-1;

            while(j>=0 && arr[j]>key){
               arr[j+1] = arr[j];  // Shift element to the right
               j--;
            }
            arr[j+1] = key;    // Place the key in the right position
        }

    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        iSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
