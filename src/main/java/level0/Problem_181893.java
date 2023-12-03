package level0;

import java.util.Arrays;

public class Problem_181893 {
    public int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            }
            else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Problem_181893 p = new Problem_181893();

        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        int[] result = p.solution(arr, query);

        for(int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();


        arr = new int[] {4, 5, 4};
        query = new int[] {1, 0};
        result = p.solution(arr, query);

        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}
