package level0;

import java.util.Scanner;

public class Problem_181942 {
    public String solution(String str1, String str2) {
        String answer = "";

        int totalLength = str1.length() + str2.length();

        for(int i = 0; i < totalLength; i++) {
            if(i % 2 == 0) {
                answer += str1.charAt(i / 2);
            }
            else {
                answer += str2.charAt(i / 2);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Problem_181942 ss = new Problem_181942();

        System.out.println(ss.solution(s1, s2));
    }
}
