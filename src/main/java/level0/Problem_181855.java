package level0;

import java.util.HashMap;
import java.util.Map;

public class Problem_181855 {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> counter = new HashMap<>();

        for(String str : strArr) {
            if(counter.containsKey(str.length())) {
                counter.put(str.length(), counter.get(str.length()) + 1);
            }
            else {
                counter.put(str.length(), 1);
            }
        }

        for (int i : counter.keySet()) {
            if(counter.get(i) > answer) {
                answer = counter.get(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181855 p = new Problem_181855();

       // System.out.println(p.solution(new String[] {"a","bc","d","efg","hi"}));
        System.out.println(p.solution(new String[] {"a","bcs","ddf","efg","hi"}));
    }
}
