package level0;

public class Problem_181927 {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        int lastElement = 0;

        for(int i = 0 ; i < len; i++) {
            answer[i] = num_list[i];
        }

        if(num_list[len - 2] < num_list[len - 1]) {
            lastElement = num_list[len - 1] - num_list[len - 2];
        }
        else
            lastElement = num_list[len - 1] * 2;

        answer[len] = lastElement;

        return answer;
    }

    public static void main(String[] args) {
        Problem_181927 p = new Problem_181927();
        int[] num_list_1 = {2, 1, 6};
        int[] num_list_2 = {5, 2, 1, 7, 5};

        int[] result1 = p.solution(num_list_1);
        int[] result2 = p.solution(num_list_2);

        for(int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : result2) {
            System.out.print(i + " ");
        }

    }
}
