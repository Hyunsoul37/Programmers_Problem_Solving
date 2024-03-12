package level2;

import java.util.ArrayList;
import java.util.List;

public class Problem_12985 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            if (a % 2 == 1) a += 1;
            if (b % 2 == 1) b += 1;

            a /= 2;
            b /= 2;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_12985 p = new Problem_12985();

        System.out.println(p.solution(8,4, 7));
    }
}
