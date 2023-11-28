package level0;

import java.util.Scanner;

public class Problem_181934 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        switch (ineq) {
            case ">":
                if(eq.equals("=")) {
                    answer = n >= m ? 1 : 0;
                }
                else if (eq.equals("!")) {
                    answer = n > m ? 1 : 0;
                }
                break;
            case "<":
                if (eq.equals("=")) {
                    answer = n <= m ? 1 : 0;
                }
                else if (eq.equals("!")) {
                    answer = n < m ? 1 : 0;
                }
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181934 cs = new Problem_181934();
        Scanner sc = new Scanner(System.in);
        String ineq = sc.next();
        String eq = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(cs.solution(ineq, eq, n, m));
    }
}
