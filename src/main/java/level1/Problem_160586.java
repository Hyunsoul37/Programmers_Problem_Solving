package level1;

import java.util.HashMap;
import java.util.Map;

public class Problem_160586 {
    public int[] solution(String[] keymap, String[] targets)
    {
        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();

        // 알파벳 순 누르는 최소 횟수 Map 생성
        for (String key : keymap)
        {
            for (int i = 0; i < key.length(); i++)
            {
                if (!map.containsKey(key.charAt(i)))
                {
                    map.put(key.charAt(i), i + 1);
                }
                else
                {
                    // 이미 map에 저장된 알파벳일 경우 적게 누르는 횟수 저장
                    int pushCnt = map.get(key.charAt(i));
                    map.put(key.charAt(i), Math.min(pushCnt, i + 1));
                }
            }
        }

        // target 누르는 횟수 확인
        for (int i = 0; i < targets.length; i++)
        {
            int pushCnt = 0;

            for (Character alphabet : targets[i].toCharArray())
            {
                if (map.containsKey(alphabet))
                {
                    pushCnt += map.get(alphabet);
                }
                else
                {
                    // map에 해당 알파벳이 존재하지 않는 경우
                    pushCnt = -1;
                    break;
                }
            }

            answer[i] = pushCnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_160586 p = new Problem_160586();

        String[] keymap1 = {"ABACD", "BCEFD"};
        String[] targets1 = {"ABCD","AABB"};

        String[] keymap2 = {"ABACD", "BCEFD"};
        String[] targets2 = {"DG"};

        String[] keymap3 = {"AGZ", "BSSS"};
        String[] targets3 = {"ASA","BGZ"};

        printAnswer(p.solution(keymap1, targets1));
        printAnswer(p.solution(keymap2, targets2));
        printAnswer(p.solution(keymap3, targets3));
    }

    public static void printAnswer(int[] answer)
    {
        for (int i = 0; i < answer.length; i++)
        {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }
}