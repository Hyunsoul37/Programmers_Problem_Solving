package level1;

public class Problem_12937 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Problem_12937 p = new Problem_12937();
        System.out.println(p.solution(3));
        System.out.println(p.solution(4));
    }
}