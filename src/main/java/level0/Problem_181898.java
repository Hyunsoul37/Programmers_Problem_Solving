package level0;

public class Problem_181898 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181898 p = new Problem_181898();

        System.out.println(p.solution(new int[] {0, 0, 0, 1}, 1));
        System.out.println(p.solution(new int[] {1, 0, 0, 1, 0, 0}, 4));
        System.out.println(p.solution(new int[] {1, 1, 1, 1, 0}, 3));

    }
}
