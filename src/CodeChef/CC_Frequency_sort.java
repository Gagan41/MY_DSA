package CodeChef;
import java.util.*;

public class CC_Frequency_sort {
    public static String sortByFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());

        Collections.sort(chars, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }
            return a - b;
        });

        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            result.append(String.valueOf(ch).repeat(map.get(ch)));
        }

        return result.toString();
    }

}
