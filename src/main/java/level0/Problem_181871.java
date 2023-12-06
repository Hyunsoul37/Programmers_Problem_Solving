package level0;

public class Problem_181871 {
    public int solution(String myString, String pat) {
        int answer = 0;
        int loop = myString.length() - pat.length() + 1;

        for(int i = 0; i < loop; i++) {
            if(myString.startsWith(pat)) {
                answer++;
            }

            myString = myString.substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181871 p = new Problem_181871();

        System.out.println(p.solution("banana", "ana"));
        System.out.println(p.solution("aaaa", "aa"));
    }
}
