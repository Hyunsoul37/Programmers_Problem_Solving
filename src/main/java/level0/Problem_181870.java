package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181870 {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        String exStr = "ad";

        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains(exStr)) {
                answer.add(strArr[i]);
            }
        }

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Problem_181870 p = new Problem_181870();

        String[] result = p.solution(new String[] {"and","notad","abcd"});
        for(String s : result) {
            System.out.println(s);
        }

        result = p.solution(new String[] {"there","are","no","a","ds"});
        for(String s : result) {
            System.out.println(s);
        }
    }
}
