package level0;

public class Problem_181873 {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp.charAt(0), (char)(alp.charAt(0) - ('a' - 'A')));
    }

    public static void main(String[] args) {
        Problem_181873 p = new Problem_181873();

        System.out.println(p.solution("programmers", "p"));
        System.out.println(p.solution("lowercase", "x"));
    }
}
