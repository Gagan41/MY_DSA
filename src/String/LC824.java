package String;

public class LC824 {
    public String toGoatLatin(String sentence) {
        String[] word = sentence.split(" ");
        StringBuilder res = new StringBuilder();

        for(int i=0; i<word.length; i++){
            String w = word[i];

            if(!isV(w.charAt(0))){
                w = w.substring(1) + w.charAt(0);
            }

            w += "ma";

            for(int j=0; j<=i; j++){
                w += "a";
            }

            if(i>0){
                res.append(" ");
            }

            res.append(w);
        }

        return res.toString();
    }

    private boolean isV(char c){
        c = Character.toLowerCase(c);

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
