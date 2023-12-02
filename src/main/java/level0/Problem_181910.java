package level0;

public class Problem_181910 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {
        Problem_181910 p = new Problem_181910();

        System.out.println(p.solution("ProgrammerS123", 11));
        System.out.println(p.solution("He110W0r1d", 5));
    }
}
