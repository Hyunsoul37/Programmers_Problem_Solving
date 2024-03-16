package level2;

public class Problem_12951 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] charArray = s.toLowerCase().split("");
        boolean isFirst = true;

        for(String word : charArray) {
            if(isFirst) {
                word = word.toUpperCase();
                isFirst = false;
            }

            if(word.equals(" ")) {
                isFirst = true;
            }

            answer.append(word);
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Problem_12951 p = new Problem_12951();

        System.out.println(p.solution("3people unFollowed me"));
        System.out.println(p.solution("for the last week"));
    }
}
