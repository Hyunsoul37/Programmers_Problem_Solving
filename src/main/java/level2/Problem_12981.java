package level2;

import java.util.HashMap;
import java.util.Map;

public class Problem_12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Map<String, Boolean> wordMap = new HashMap<>();
        char lastChar = ' ';

        for(int i = 0; i < words.length; i++) {
            if(!wordMap.containsKey(words[i])) {
                if(lastChar != ' ' && lastChar != words[i].charAt(0)) {
                    answer = makeAnswer(n, i);
                    break;
                }
                lastChar = words[i].charAt(words[i].length() - 1);
                wordMap.put(words[i], true);
            }
            else {
                answer = makeAnswer(n, i);
                break;
            }
        }

        return answer;
    }

    private int[] makeAnswer(int n, int i) {
        return new int[] {i % n + 1, i / n + 1};
    }

    public static void main(String[] args) {
        Problem_12981 p = new Problem_12981();
        String[] arr1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] arr2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] arr3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] answer1 = p.solution(3, arr1);
        int[] answer2 = p.solution(5, arr2);
        int[] answer3 = p.solution(2, arr3);

        System.out.println(answer1[0] + " " + answer1[1]);
        System.out.println(answer2[0] + " " + answer2[1]);
        System.out.println(answer3[0] + " " + answer3[1]);
    }
}
