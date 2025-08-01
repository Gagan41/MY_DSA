package Sorting;

public class BubbleSort {
    public static void bSort(int [] arr){
        int n = arr.length;
        for(int i=0; i<n-1 ; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array elements are:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {6,3,5,3,5,4,3,6};
        bSort(arr);
    }
}
