package level0;

import java.util.HashMap;
import java.util.Map;

public class Problem_181916 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(a, 1);

        if(map.containsKey(b))
            map.put(b, map.get(b) + 1);
        else
            map.put(b, 1);

        if(map.containsKey(c))
            map.put(c, map.get(c) + 1);
        else
            map.put(c, 1);

        if(map.containsKey(d))
            map.put(d, map.get(d) + 1);
        else
            map.put(d, 1);


        switch (map.size()) {
            case 1:
                answer = 1111 * a;
                break;
            case 2:
                int min = 0;
                int max = 0;
                boolean isDouble = false;

                for (int i : map.keySet()) {
                    if(map.get(i) == 1) {
                        min = i;
                    }
                    else if(map.get(i) == 2 && min == 0) {
                        min = i;
                        isDouble = true;
                    }
                    else {
                        max = i;
                    }
                }

                if (isDouble) {
                    answer = (min + max) * Math.abs(min - max);
                }
                else {
                    answer =  (int)Math.pow(10 * max + min, 2);
                }

                break;
            case 3:
                answer = 1;

                for (int i : map.keySet()) {
                    if(map.get(i) == 1) {
                        answer *= i;
                    }
                }
                break;
            case 4:
                answer = 6;
                for (int i : map.keySet()) {
                    if(answer > i) {
                        answer = i;
                    }
                }
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181916 p = new Problem_181916();

        System.out.println(p.solution(2, 2, 2, 2));
        System.out.println(p.solution(4, 1, 4, 4));
        System.out.println(p.solution(6, 3, 3, 6));
        System.out.println(p.solution(2, 5, 2, 6));
        System.out.println(p.solution(6, 4, 2, 5));
    }
}
