package level0;

public class Problem_181924 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            int first = queries[i][0];
            int second = queries[i][1];
            int tmp = arr[first];

            arr[first] = arr[second];
            arr[second] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Problem_181924 p = new Problem_181924();

        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};

        int[] result = p.solution(arr, queries);

        for(int i : result) {
            System.out.println(i);
        }
    }
}
