package level0;

import java.util.Arrays;

public class Problem_181894 {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                if(start == -1) {
                    start = i;
                    end = i;
                }
                else {
                    end = i;
                }

            }
        }

        return start == -1 ? new int[] {-1} : Arrays.copyOfRange(arr, start, end + 1);
    }

    public static void main(String[] args) {
        Problem_181894 p = new Problem_181894();

        int[] result = p.solution(new int[] {1, 2, 1, 4, 5, 2, 9});
        for(int i : result) {
            System.out.print(i);
        }
        System.out.println();

        result = p.solution(new int[] {1, 2, 1});
        for(int i : result) {
            System.out.print(i);
        }
        System.out.println();

        result = p.solution(new int[] {1, 1, 1});
        for(int i : result) {
            System.out.print(i);
        }
        System.out.println();

        result = p.solution(new int[] {1, 2, 1, 2, 1, 10, 2, 1});
        for(int i : result) {
            System.out.print(i);
        }
        System.out.println();

        result = p.solution(new int[] {2, 2});
        for(int i : result) {
            System.out.print(i);
        }
    }
}
