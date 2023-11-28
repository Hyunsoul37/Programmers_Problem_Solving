package level0;

public class Problem_181941 {
    public String solution(String[] arr) {
        String answer = "";

        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181941 cl = new Problem_181941();
        String[] arr = {"a", "b", "c"};

        System.out.println(cl.solution(arr));

    }
}
