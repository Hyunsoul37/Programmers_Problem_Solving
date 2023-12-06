package level0;

import java.util.Arrays;

public class Problem_181881 {
    public int solution(int[] arr) {
        int answer = 0;
        int[] prevArr = new int[arr.length];

        while (!Arrays.equals(prevArr, arr)) {
            prevArr = Arrays.copyOf(arr, arr.length);

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                }
                else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            answer++;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        Problem_181881 p = new Problem_181881();
        System.out.println(p.solution(new int[] {1, 2, 3, 100, 99, 98}));
    }
}
