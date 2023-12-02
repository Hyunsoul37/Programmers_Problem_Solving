package level0;

public class Problem_181911 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0 ; i < my_strings.length; i++) {
            answer.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Problem_181911 p = new Problem_181911();

        System.out.println(p.solution(
                new String[] {"progressive", "hamburger", "hammer", "ahocorasick"},
                new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
}
