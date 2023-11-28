package level0;

import java.util.Scanner;

public class Problem_181935 {
    public int solution(int n) {
        int answer = 0;

        if(n % 2 == 0) {
            answer = even(n);
        }
        else {
            answer = odd(n);
        }

        return answer;
    }

    public int odd(int n) {
        int result = 0;

        for(int i = 0; i <= n; i++) {
            if(i % 2 == 1)
                result += i;
        }
        return result;
    }

    public int even(int n) {
        int result = 0;

        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0)
                result += i * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Problem_181935 dv = new Problem_181935();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(dv.solution(n));
    }
}
