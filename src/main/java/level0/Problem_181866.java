package level0;

import java.util.Arrays;

public class Problem_181866 {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);

        return Arrays.stream(answer).filter(s->!s.isEmpty()).toArray(String[]::new);
    }

    public static void main(String[] args) {
        Problem_181866 p = new Problem_181866();

        String[] result = p.solution("axbxcxdx");
        for (String s : result) {
            System.out.println(s);
        }

        result = p.solution("dxccxbbbxaaaa");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
