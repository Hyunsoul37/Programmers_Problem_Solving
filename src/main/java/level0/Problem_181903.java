package level0;

public class Problem_181903 {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < code.length(); i++) {
            if(i % q == r) {
                sb.append(code.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Problem_181903 p = new Problem_181903();

        System.out.println(p.solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(p.solution(1, 0 ,"programmers"));
    }
}
