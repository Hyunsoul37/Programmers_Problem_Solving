package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181899 {
    public int[] solution(int start, int end_num) {
        List<Integer> answer = new ArrayList<>();

        for (int i = start; i >= end_num; i--) {
            answer.add(i);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem_181899 p = new Problem_181899();

        int[] result = p.solution(10, 3);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
