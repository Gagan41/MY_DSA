package Math;

public class LC556 {
    public int nextGreaterElement(int n) {
        char[] digit = String.valueOf(n).toCharArray();

        int i = digit.length - 2;

        while(i >= 0 && digit[i] >= digit[i+1]){
            i--;
        }

        if(i < 0) return -1;

        int j = digit.length - 1;
        while(digit[j] <= digit[i]){
            j--;
        }

        char temp = digit[i];
        digit[i] = digit[j];
        digit[j] = temp;

        reverse(digit, i+1, digit.length - 1);
        long ans = Long.parseLong(new String(digit));

        return ans > Integer.MAX_VALUE ? -1 : (int) ans;
    }

    public void reverse(char[] arr,int l, int r){
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
