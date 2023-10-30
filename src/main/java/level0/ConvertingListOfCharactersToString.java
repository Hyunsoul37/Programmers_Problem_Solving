package level0;

public class ConvertingListOfCharactersToString {
    public String solution(String[] arr) {
        String answer = "";

        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        ConvertingListOfCharactersToString cl = new ConvertingListOfCharactersToString();
        String[] arr = {"a", "b", "c"};

        System.out.println(cl.solution(arr));

    }
}
