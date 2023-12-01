package level0;

import java.util.Arrays;

public class Problem_181923 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0 ; i < queries.length; i++) {
            int[] tmp = Arrays.copyOfRange(arr, queries[i][0], queries[i][1] + 1);
            int num = -1;

            for(int j = 0; j < tmp.length; j++) {
                if(tmp[j] > queries[i][2]) {
                    if(num == -1)
                        num = tmp[j];
                    else if (num > tmp[j])
                        num = tmp[j];
                }
            }
            answer[i] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181923 p = new Problem_181923();

        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};

        int[] result = p.solution(arr, queries);

        for(int i : result) {
            System.out.println(i);
        }
    }
}
