package level0;

public class Problem_181863 {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }

    public static void main(String[] args) {
        Problem_181863 p = new Problem_181863();

        System.out.println(p.solution("masterpiece"));
        System.out.println(p.solution("programmers"));
        System.out.println(p.solution("jerry"));
        System.out.println(p.solution("burn"));
    }
}
