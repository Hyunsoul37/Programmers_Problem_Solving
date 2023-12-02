package level0;

public class Problem_181907 {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

    public static void main(String[] args) {
        Problem_181907 p = new Problem_181907();

        System.out.println(p.solution("ProgrammerS123", 11));
        System.out.println(p.solution("He110W0r1d", 5));
    }
}
