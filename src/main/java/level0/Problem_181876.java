package level0;

public class Problem_181876 {
    public String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        Problem_181876 p = new Problem_181876();

        System.out.println(p.solution("aBcDeFg"));
        System.out.println(p.solution("aaa"));
    }
}
