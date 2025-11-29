package CodeChef;

public class CC_Array_Sorted {
    static boolean check(int[] arr){
        int count = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] > arr[(i+1)%n]) count++;

            if(count > 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {6,7,1,2,4,5,5};
        System.out.println(check(arr));
    }
}
