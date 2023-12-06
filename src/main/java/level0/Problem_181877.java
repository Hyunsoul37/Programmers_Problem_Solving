package level0;

public class Problem_181877 {
    public String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        Problem_181877 p = new Problem_181877();

        System.out.println(p.solution("aBcDeFg"));
        System.out.println(p.solution("AAA"));
    }
}
