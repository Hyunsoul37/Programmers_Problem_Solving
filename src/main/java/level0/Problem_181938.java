package level0;

import java.util.Scanner;

public class Problem_181938 {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = Integer.toString(a) + Integer.toString(b);
        answer = Integer.parseInt(s1);

        if(2 * a * b > answer)
            answer = 2 * a * b;

        return answer;
    }

    public static void main(String[] args) {
        Problem_181938 co = new Problem_181938();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(co.solution(a, b));
    }
}
