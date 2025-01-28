package level1;


import java.util.HashMap;
import java.util.Map;

public class Problem_178871_2
{
    public String[] solution(String[] players, String[] callings)
    {
        String[] answer;
        Map<String, Integer> playerMap = new HashMap<>();
        Map<Integer, String> raceMap = new HashMap<>();

        for(int i = 0; i < players.length; i++)
        {
            playerMap.put(players[i], i);   // 플레이어 순위 맵
            raceMap.put(i, players[i]);     // 순위에 따른 플레이어 맵
        }

        for (String calling : callings)
        {
            int race = playerMap.get(calling);      // 호명된 선수의 순위
            String name = raceMap.get(race - 1);    // 호명된 선수의 앞 순위 선수

            playerMap.put(calling, race - 1);       // 호명된 선수의 순위 올림
            playerMap.put(name, race);              // 호명된 선수와 앞 선수 순위 바꿈

            raceMap.put(race, name);                // race 순위 업데이트
            raceMap.put(race - 1, calling);
        }

        answer = new String[raceMap.size()];

        for(int i : raceMap.keySet()) {
            answer[i] = raceMap.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_178871_2 p = new Problem_178871_2();

        String[] player = {"mumu", "soe", "poe", "kai", "mine"};
        String[] calling = {"kai", "kai", "mine", "mine"};

        String[] result = p.solution(player, calling);

        for(String s : result) {
            System.out.println(s);
        }
    }
}
