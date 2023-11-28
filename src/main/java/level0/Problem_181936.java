package level0;

import java.util.Scanner;

public class Problem_181936 {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number % n == 0 && number % m == 0)
            answer = 1;

        return answer;
    }

    public static void main(String[] args) {
        Problem_181936 cm = new Problem_181936();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(cm.solution(num, a, b));
    }
}
