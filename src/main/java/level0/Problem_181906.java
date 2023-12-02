package level0;

public class Problem_181906 {
    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    public static void main(String[] args) {
        Problem_181906 p = new Problem_181906();

        System.out.println(p.solution("banana", "ban"));
        System.out.println(p.solution("banana", "nan"));
        System.out.println(p.solution("banana", "abcd"));
        System.out.println(p.solution("banana", "bananan"));
    }
}
