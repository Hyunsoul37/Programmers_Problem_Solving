package level0;

public class Problem_181930 {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int loopCnt = 0;

        if(a == b && b == c)
            loopCnt = 3;
        else if(a == b || b == c || a == c)
            loopCnt = 2;
        else
            loopCnt = 1;

        for(int i = 0; i < loopCnt; i++) {
            answer *= (int)Math.pow(a, i + 1) + (int)Math.pow(b, i + 1) + (int)Math.pow(c, i + 1) ;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181930 p = new Problem_181930();

        System.out.println(p.solution(2, 6, 1));
        System.out.println(p.solution(5, 3, 3));
        System.out.println(p.solution(4, 4, 4));
    }
}
