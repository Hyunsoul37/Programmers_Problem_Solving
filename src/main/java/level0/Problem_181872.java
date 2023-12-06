package level0;

public class Problem_181872 {
    public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }

    public static void main(String[] args) {
        Problem_181872 p = new Problem_181872();

        System.out.println(p.solution("AbCdEFG", "dE"));
        System.out.println(p.solution("AAAAaaaa", "a"));
    }
}
