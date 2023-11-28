package level0;

import java.util.Scanner;

public class Problem_181937 {
    public int solution(int num, int n) {
        int answer = 0;

        if(num % n == 0)
            answer = 1;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        Problem_181937 mn = new Problem_181937();

        System.out.println(mn.solution(num, n));

    }
}
