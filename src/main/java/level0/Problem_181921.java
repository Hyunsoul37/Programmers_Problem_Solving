package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181921 {
    public int[] solution(int l, int r) {
        int[] answer;
        List<Integer> result = new ArrayList<>();

        for(int i = l; i <= r; i++) {
            if(OnlyFiveOrZero(i)) {
                result.add(i);
            }
        }

        answer = result.stream().mapToInt(i -> i).toArray();

        if (answer.length == 0) {
            answer = new int[] {-1};
        }

        return answer;
    }

    public boolean OnlyFiveOrZero(int num) {
        while (num > 0) {
            int tmp = num % 10;
            if(tmp != 0 && tmp != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Problem_181921 p = new Problem_181921();

        int[] result = p.solution(5,5555);

        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();

        result = p.solution(10, 20);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
