package String;

public class LC1967 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for(String pat:patterns){
            if(word.indexOf(pat) != -1){
                count++;
            }
        }

        return count;
    }}
