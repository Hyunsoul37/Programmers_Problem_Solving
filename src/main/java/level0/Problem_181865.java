package level0;

import java.util.Arrays;

public class Problem_181865 {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");

        switch (arr[1]) {
            case "+":
                answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                break;
            case "-":
                answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                break;
            case "*":
                answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181865 p = new Problem_181865();

        System.out.println(p.solution("43 + 12"));
        System.out.println(p.solution("0 - 7777"));
        System.out.println(p.solution("40000 * 40000"));
    }
}
