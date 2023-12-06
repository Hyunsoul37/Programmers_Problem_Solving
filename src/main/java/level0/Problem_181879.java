package level0;

public class Problem_181879 {
    public int solution(int[] num_list) {
        int answer = 0;

        if(num_list.length > 10) {
            answer = overLengthTen(num_list);
        }
        else {
            answer = lessLengthTen(num_list);
        }

        return answer;
    }

    public int overLengthTen(int[] num_list) {
        int answer = 0;

        for(int i : num_list) {
            answer += i;
        }

        return answer;
    }

    public int lessLengthTen(int[] num_list) {
        int answer = 1;

        for(int i : num_list) {
            answer *= i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181879 p = new Problem_181879();

        int[] num_list1 = new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list2 = new int[] {2, 3, 4, 5};

        System.out.println(p.solution(num_list1));
        System.out.println(p.solution(num_list2));
    }
}
