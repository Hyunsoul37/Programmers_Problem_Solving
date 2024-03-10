package level1;

public class Problem_12916 {
    boolean solution(String s) {
        s = s.toLowerCase();
        return s.chars().filter(c -> c == 'p').count() == s.chars().filter(c -> c == 'y').count();
    }

    public static void main(String[] args) {
        Problem_12916 p = new Problem_12916();

        System.out.println(p.solution("pPoooyY"));
        System.out.println(p.solution("Pyy"));
    }
}