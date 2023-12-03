package level0;

import java.util.Arrays;

public class Problem_181892 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }

    public static void main(String[] args) {
        Problem_181892 p = new Problem_181892();

        for(int i : p.solution(new int[] {5, 2, 1, 7, 5}, 2)) {
            System.out.print(i + " ");
        }
    }
}
