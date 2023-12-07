package level0;

public class Problem_181864 {
    public int solution(String myString, String pat) {
        myString = myString.replace('A', 'C');
        myString = myString.replace('B', 'A');
        myString = myString.replace('C', 'B');
        return myString.contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        Problem_181864 p = new Problem_181864();

        System.out.println(p.solution("ABBAA", "AABB"));
        System.out.println(p.solution("ABAB", "ABAB"));
    }
}
