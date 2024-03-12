package level2;

import java.util.ArrayList;
import java.util.List;

public class Problem_131701 {
    public int solution(int[] elements) {
        List<Integer> list = new ArrayList<>();

        // 초기화
        for (int e : elements) {
            list.add(e);
        }

        for (int add = 2; add <= elements.length; add++) {
            for(int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int i = j; i < j +add; i++) {
                    sum += list.get(i % elements.length);
                }
                list.add(sum);
            }
        }

        return (int) list.stream().distinct().count();
    }

    public static void main(String[] args) {
        Problem_131701 p = new Problem_131701();

        System.out.println(p.solution(new int[] {1,1,4,7,9}));
    }
}
