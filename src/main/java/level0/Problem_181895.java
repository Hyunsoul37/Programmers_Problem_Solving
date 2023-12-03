package level0;

import java.util.Arrays;

public class Problem_181895 {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer;

        int[] arr1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] arr2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

        answer = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, answer, 0, arr1.length);
        System.arraycopy(arr2, 0, answer, arr1.length, arr2.length);

        return answer;
    }

    public static void main(String[] args) {
        Problem_181895 p = new Problem_181895();

        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};

        int[] result = p.solution(arr, intervals);

        for(int i : result) {
            System.out.println(i);
        }
    }
}
