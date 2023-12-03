package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181901 {
    public int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();

        for(int i = k; i <= n; i += k) {
            answer.add(i);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem_181901 p = new Problem_181901();

        int[] result = p.solution(10, 3);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
