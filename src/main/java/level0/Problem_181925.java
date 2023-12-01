package level0;

public class Problem_181925 {
    public String solution(int[] numLog) {
        String answer = "";
        int prev = 0;
        int next = 0;

        for(int i = 1; i < numLog.length; i++) {
            prev = numLog[i - 1];
            next = numLog[i];

            switch (next - prev) {
                case 1:
                    answer += 'w';
                    break;
                case -1 :
                    answer += 's';
                    break;
                case 10:
                    answer += 'd';
                    break;
                case -10:
                    answer += 'a';
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181925 p = new Problem_181925();

        System.out.println(p.solution(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}
