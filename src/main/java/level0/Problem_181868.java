package level0;

import java.util.Arrays;

public class Problem_181868 {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" ")).filter(s -> !s.isBlank()).toArray(String[]::new);
    }

    public static void main(String[] args) {
        Problem_181868 p = new Problem_181868();

        String[] result = p.solution(" i    love  you");
        for(String s : result) {
            System.out.println(s);
        }
    }
}
