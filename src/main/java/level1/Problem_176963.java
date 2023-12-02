package level1;

import java.util.HashMap;
import java.util.Map;

public class Problem_176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> scoreMap = new HashMap<>();

        for(int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++) {
            int score = 0;

            for(String people : photo[i]) {
                if(scoreMap.containsKey(people)) {
                    score += scoreMap.get(people);
                }
            }

            answer[i] = score;
        }


        return answer;
    }

    public static void main(String[] args) {
        Problem_176963 p = new Problem_176963();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] result = p.solution(name, yearning, photo);

        for(int i : result) {
            System.out.println(i);
        }
    }
}
