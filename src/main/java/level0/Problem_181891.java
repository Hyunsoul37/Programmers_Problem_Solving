package level0;

import java.util.Arrays;

public class Problem_181891 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        int[] arr1 = Arrays.copyOfRange(num_list, 0, n);
        int[] arr2 = Arrays.copyOfRange(num_list, n, num_list.length);

        System.arraycopy(arr2, 0, answer, 0, arr2.length);
        System.arraycopy(arr1, 0, answer, arr2.length, arr1.length);

        return answer;
    }

    public static void main(String[] args) {
        Problem_181891 p = new Problem_181891();

        int[] result = p.solution(new int[] {5, 2, 1, 7, 5}, 3);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}
