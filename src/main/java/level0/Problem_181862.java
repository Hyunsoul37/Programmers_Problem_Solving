package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181862 {
    public String[] solution(String myStr) {
        List<String> strArr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myStr.length(); i++) {
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
                strArr.add(sb.toString());
                sb.setLength(0);
            }
            else {
                sb.append(myStr.charAt(i));
            }
        }
        strArr.add(sb.toString());

        String[] answer = strArr.stream().filter(s -> !s.isEmpty()).toArray(String[]::new);

        if (answer.length == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181862 p = new Problem_181862();

        String[] result = p.solution("baconlettucetomato");
        for (String s : result) {
            System.out.println(s);
        }

        result = p.solution("abcd");
        for (String s : result) {
            System.out.println(s);
        }

        result = p.solution("cabab");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
