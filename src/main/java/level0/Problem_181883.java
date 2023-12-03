package level0;

public class Problem_181883 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries) {
            for(int i = query[0]; i <= query[1]; i++) {
                arr[i]++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Problem_181883 p = new Problem_181883();

        int[] arr = new int[] {0, 1, 2, 3, 4};
        int[][] queries = new int[][] {{0, 1}, {1, 2}, {2, 3}};
        int[] result = p.solution(arr, queries);

        for (int i : result) {
            System.out.println(i);
        }

    }
}
