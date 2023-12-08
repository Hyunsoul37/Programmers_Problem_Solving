package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181861 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for(int i : arr) {
            for(int idx = 0; idx < i; idx++) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem_181861 p = new Problem_181861();

        int[] result = p.solution(new int[] {5, 1, 4});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
