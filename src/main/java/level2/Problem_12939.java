package level2;

import level1.Problem_12916;

public class Problem_12939 {
    public String solution(String s) {
        String answer = "";
        String arrStr[] = s.split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String t : arrStr) {
            int tmp = Integer.parseInt(t);

            if(tmp > max)
                max = tmp;
            if(tmp < min)
                min = tmp;
        }

        answer += min + " " + max;
        return answer;
    }

    public static void main(String[] args) {
        Problem_12939 p = new Problem_12939();

        System.out.println(p.solution("1 2 3 4"));
        System.out.println(p.solution("-1 -2 -3 -4"));
        System.out.println(p.solution("-1 -1"));
    }
}
