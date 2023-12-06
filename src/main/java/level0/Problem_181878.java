package level0;

public class Problem_181878 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }

    public static void main(String[] args) {
        Problem_181878 p = new Problem_181878();

        System.out.println(p.solution("AbCdEfG", "aBc"));
        System.out.println(p.solution("aaAA", "aaaaa"));
    }
}
