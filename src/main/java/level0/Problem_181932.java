package level0;

import java.util.Scanner;

public class Problem_181932 {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;

        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }

            if(mode) {
                if(i % 2 == 0)
                    answer += code.charAt(i);
            }
            else {
                if(i % 2 == 1)
                    answer += code.charAt(i);
            }
        }

        if(answer.isEmpty()) {
            answer = "EMPTY";
        }
        return answer;
    }

    public static void main(String[] args) {
        Problem_181932 hc = new Problem_181932();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(hc.solution(str));
    }
}
