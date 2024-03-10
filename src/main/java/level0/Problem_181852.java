package level0;

import java.util.Arrays;

public class Problem_181852 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5 ,num_list.length);
    }

    public static void main(String[] args) {
        Problem_181852 p = new Problem_181852();

        int[] result = p.solution(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10});
        for (int i : result) {
            System.out.println(i);
        }
    }
}
