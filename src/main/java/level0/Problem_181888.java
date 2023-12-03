package level0;

public class Problem_181888 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        int size = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        answer = new int[size];

        for(int i = 0; i < num_list.length; i += n) {
            answer[i / n] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181888 p = new Problem_181888();

        int[] result;
        int[] num_list = {4, 2, 6, 1, 7, 6};

        result = p.solution(num_list, 2);
        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();

        result = p.solution(num_list, 4);
        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
