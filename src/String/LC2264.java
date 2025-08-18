package String;

public class LC2264 {
    public String largestGoodInteger(String num) {
        String max = "";
        for(int i=0; i<num.length()-2; i++){
            char c = num.charAt(i);
            if(c == num.charAt(i+1) && c == num.charAt(i+2)){
                String valid = num.substring(i,i+3);
                if(max.isEmpty() || valid.compareTo(max)>0){
                    max =  valid;
                }
            }
        }
        return max;
    }
}

//You are given a string num representing a large integer. An integer is good if it meets the following conditions:
//
//It is a substring of num with length 3.
//It consists of only one unique digit.
//Return the maximum good integer as a string or an empty string "" if no such integer exists.
//
//Note:
//
//A substring is a contiguous sequence of characters within a string.
//There may be leading zeroes in num or a good integer.
//
//
//Example 1:
//
//Input: num = "6777133339"
//Output: "777"
//Explanation: There are two distinct good integers: "777" and "333".
//"777" is the largest, so we return "777".