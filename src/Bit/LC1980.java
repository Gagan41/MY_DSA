package Bit;

public class LC1980 {
    static String findDifferentBinaryString(String[] nums){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<nums.length; i++){
            sb.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] nums = {"01", "10"};
        System.out.println(findDifferentBinaryString(nums));
    }
}
