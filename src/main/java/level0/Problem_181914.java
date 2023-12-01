package level0;

public class Problem_181914 {
    public int solution(String number) {
        int answer = 0;

        for(int i = 0; i < number.length(); i++) {
            answer += number.charAt(i) - '0';
        }

        return answer % 9;
    }

    public static void main(String[] args) {
        Problem_181914 p = new Problem_181914();

        System.out.println(p.solution("123"));
        System.out.println(p.solution("78720646226947352489"));
    }
}
