package level0;

import java.util.Arrays;

public class Problem_181853 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }

    public static void main(String[] args) {
        Problem_181853 p = new Problem_181853();

        int[] result = p.solution(new int[] {12, 4, 15, 46, 38, 1, 14});
        for (int i : result) {
            System.out.println(i);
        }
    }
}
