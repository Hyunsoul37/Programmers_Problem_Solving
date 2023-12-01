package level0;

public class Problem_181920 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for(int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181920 p = new Problem_181920();

        int[] result = p.solution(3, 10);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
