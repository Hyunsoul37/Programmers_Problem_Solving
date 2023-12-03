package level0;

public class Problem_181902 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char spell = my_string.charAt(i);

            if (spell >= 'A' && spell <= 'Z') {
                answer[spell - 'A']++;
            }
            else if (spell >= 'a' && spell <= 'z') {
                answer[26 + spell - 'a']++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181902 p = new Problem_181902();

        int[] result = p.solution("Programmers");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
