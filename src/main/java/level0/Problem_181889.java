package level0;

import java.util.Arrays;

public class Problem_181889 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,0, n);
    }

    public static void main(String[] args) {
        Problem_181889 p = new Problem_181889();

        int[] result = p.solution(new int[] {5, 2, 1, 7, 5}, 3);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
