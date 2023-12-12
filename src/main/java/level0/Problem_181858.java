package level0;

import java.util.Arrays;

public class Problem_181858 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < answer.length; j++) {
                if(answer[j] == arr[i]) {
                    break;
                }
                else if(answer[j] == -1) {
                    answer[idx++] = arr[i];
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181858 p = new Problem_181858();

        int[] result = p.solution(new int[] {0, 1, 1, 2, 2, 3}, 3);
        for(int i : result) {
            System.out.println(i);
        }

        result = p.solution(new int[] {0, 1, 1, 1, 1}, 4);
        for(int i : result) {
            System.out.println(i);
        }
    }
}
