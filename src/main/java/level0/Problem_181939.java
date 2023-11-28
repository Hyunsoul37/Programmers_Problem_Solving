package level0;

import java.util.Scanner;

public class Problem_181939 {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = Integer.toString(a) + Integer.toString(b);
        String s2 = Integer.toString(b) + Integer.toString(a);

        if(Integer.parseInt(s1) > Integer.parseInt(s2))
            answer = Integer.parseInt(s1);
        else
            answer = Integer.parseInt(s2);

        return answer;
    }

    public static void main(String[] args) {
        Problem_181939 cb = new Problem_181939();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(cb.solution(a, b));
    }
}
