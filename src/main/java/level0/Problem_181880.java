package level0;

public class Problem_181880 {
    public int solution(int[] num_list) {
        int answer = 0;

        for(int i : num_list) {
            while (i != 1) {
                if(i % 2 == 0) {
                    i /= 2;
                }
                else {
                    i = (i - 1) / 2;
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181880 p = new Problem_181880();

        System.out.println(p.solution(new int[] {12, 4, 15, 1, 14}));
    }
}
