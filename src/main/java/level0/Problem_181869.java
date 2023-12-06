package level0;

public class Problem_181869 {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        Problem_181869 p = new Problem_181869();

        String[] result = p.solution("i love you");
        for(String s : result) {
            System.out.println(s);
        }
    }
}
