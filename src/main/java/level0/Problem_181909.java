package level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_181909 {
    public String[] solution(String my_string) {
        List<String> dictionary = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++) {
            String subString = my_string;
            subString = subString.substring(i);
            dictionary.add(subString);
        }

        return dictionary.stream().sorted().collect(Collectors.toList()).toArray(String[]::new);
    }

    public static void main(String[] args) {
        Problem_181909 p = new Problem_181909();

        String[] result = p.solution("banana");

        for (String s : result) {
            System.out.println(s);
        }
    }
}
