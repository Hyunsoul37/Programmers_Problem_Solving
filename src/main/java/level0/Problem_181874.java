package level0;

public class Problem_181874 {
    public String solution(String myString) {
        char[] answer = myString.toCharArray();

        for(int i = 0; i < answer.length; i++) {
            if(answer[i] == 'a' || answer[i] == 'A') {
                answer[i] = 'A';
            }
            else {
                if(answer[i] >= 'B' && answer[i] <= 'Z') {
                    answer[i] = (char)(answer[i] - ('A' - 'a'));
                }
            }
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        Problem_181874 p = new Problem_181874();

        System.out.println(p.solution("abstract algebra"));
        System.out.println(p.solution("PrOgRaMmErS"));
    }
}
