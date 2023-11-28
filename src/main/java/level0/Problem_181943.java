package level0;

import java.util.Scanner;

public class Problem_181943 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int overLen = overwrite_string.length();

        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overLen);
        System.out.println(my_string.length());

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int n = sc.nextInt();

        Problem_181943 os = new Problem_181943();

        s1 = os.solution(s1, s2, n);

        System.out.println(s1);
    }
}
