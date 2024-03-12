package level2;

public class Problem_12914 {
    public long solution(int n) {
        long[] answer = new long[n + 1];

        if(n == 1) return 1L;
        if(n == 2) return 2L;

        answer[1] = 1;
        answer[2] = 2;

        for(int i = 3; i <= n; i++) {
            answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
        }

        return answer[n];
    }

    public static void main(String[] args) {
        Problem_12914 p = new Problem_12914();

        System.out.println(p.solution(4));
        System.out.println(p.solution(3));
    }
}
