package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181919 {
    public int[] solution(int n) {
        List<Integer> result = new ArrayList<>();

        while(n != 1) {

            result.add(n);

            if(n % 2 == 0) {
                n /= 2;
            }
            else {
                n = n * 3 + 1;
            }

            if(n == 1) {
                result.add(n);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem_181919 p = new Problem_181919();

        int[] result = p.solution(10);

        for(int i : result) {
            System.out.println(i);
        }
    }
}
