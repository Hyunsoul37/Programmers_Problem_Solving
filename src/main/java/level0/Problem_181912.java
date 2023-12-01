package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181912 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for(String str : intStrs) {
            String str1 = str.substring(s, s + l);

            if(k < Integer.parseInt(str1)){
                answer.add(Integer.parseInt(str1));
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem_181912 p = new Problem_181912();

        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        int[] result = p.solution(intStrs, k, s, l);

        for(int i : result) {
            System.out.println(i);
        }
    }
}
