package level0;

public class Problem_181917 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        Problem_181917 p = new Problem_181917();

        System.out.println(p.solution(false, true, true, true));
        System.out.println(p.solution(true, false, false, false));
    }
}
