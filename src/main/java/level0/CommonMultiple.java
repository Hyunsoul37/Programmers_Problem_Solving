package level0;

import java.util.Scanner;

public class CommonMultiple {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number % n == 0 && number % m == 0)
            answer = 1;

        return answer;
    }

    public static void main(String[] args) {
        CommonMultiple cm = new CommonMultiple();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(cm.solution(num, a, b));
    }
}
