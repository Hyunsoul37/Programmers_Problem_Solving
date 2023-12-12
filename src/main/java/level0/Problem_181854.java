package level0;

public class Problem_181854 {
    public int[] solution(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0 && i % 2 == 1) {
                arr[i] += n;
            }
            else if (arr.length % 2 == 1 && i % 2 == 0){
                arr[i] += n;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Problem_181854 p = new Problem_181854();

        int[] result = p.solution(new int[] {49, 12, 100, 276, 33, 1}, 27);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
