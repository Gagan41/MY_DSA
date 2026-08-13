package String;
import java.util.*;

public class LC648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, (a, b) -> a.length() - b.length());

        String[] word = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for(String w:word){
            String rep = w;

            for(String root:dictionary){
                if(w.startsWith(root)){
                    rep = root;
                    break;
                }
            }

            if(ans.length() > 0){
                ans.append(" ");
            }

            ans.append(rep);
        }

        return ans.toString();
    }
}
