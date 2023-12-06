package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181867 {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                answer.add(cnt);
                cnt = 0;
            }
            else {
                cnt++;
            }
        }
        answer.add(cnt);
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem_181867 p = new Problem_181867();

        int[] result = p.solution("oxooxoxxox");
        for(int i : result) {
            System.out.println(i);
        }

    }
}
