package level1;

public class Problem_12925 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Problem_12925 p = new Problem_12925();

        System.out.println(p.solution("12345"));
        System.out.println(p.solution("-12345"));
    }
}