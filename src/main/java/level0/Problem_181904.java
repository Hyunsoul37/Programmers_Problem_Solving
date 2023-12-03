package level0;

public class Problem_181904 {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            if(i % m == c - 1) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Problem_181904 p = new Problem_181904();

        System.out.println(p.solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(p.solution("programmers", 1, 1));

    }
}
