package Stack;
import java.util.*;

public class LC496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
            while(!st.isEmpty() && nums2[i] > nums2[st.peek()]){
                int popi = st.pop();
                map.put(nums2[popi], nums2[i]);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int indx = st.pop();
            map.put(nums2[indx], -1);
        }

        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
