package level0;

import java.util.Scanner;

public class StringMultiplication {
    public String solution(String my_string, int k) {
        String answer = "";

        for(int i = 0; i < k; i++) {
            answer += my_string;
        }

        return answer;
    }

    public static void main(String[] args) {
        StringMultiplication sm = new StringMultiplication();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        System.out.println(sm.solution(s, n));
    }
}
