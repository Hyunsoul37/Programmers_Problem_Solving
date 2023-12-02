package level0;

public class Problem_181908 {
    public int solution(String my_string, String is_suffix) {
        int start = my_string.length() - is_suffix.length();

        if(start < 0) {
            return 0;
        }
        else {
            return my_string.substring(start).equals(is_suffix) ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        Problem_181908 p = new Problem_181908();

        System.out.println(p.solution("banana", "ana"));
        System.out.println(p.solution("banana", "nan"));
        System.out.println(p.solution("banana", "wxyz"));
        System.out.println(p.solution("banana", "abanana"));
    }
}
