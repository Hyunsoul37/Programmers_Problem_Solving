package level0;

public class Problem_181922 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] i : queries) {
            for(int j = i[0]; j <= i[1]; j++) {
                if(j % i[2] == 0)
                    arr[j]++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Problem_181922 p = new Problem_181922();

        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};

        int[] result = p.solution(arr,queries);

        for(int i : result) {
            System.out.println(i);
        }
    }
}
