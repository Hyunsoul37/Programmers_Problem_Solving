package level1;

import java.util.HashMap;
import java.util.Map;

public class Problem_178871 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> playerMap = new HashMap<>();
        Map<Integer, String> raceMap = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
            raceMap.put(i, players[i]);
        }

        for(int i = 0; i < callings.length; i++) {
            int race = playerMap.get(callings[i]);
            String name = raceMap.get(race - 1);

            playerMap.put(callings[i], race - 1);
            playerMap.put(name, race);

            raceMap.put(race, name);
            raceMap.put(race - 1, callings[i]);
        }

        answer = new String[raceMap.size()];
        for(int i : raceMap.keySet()) {
            answer[i] = raceMap.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_178871 p = new Problem_178871();

        String[] player = {"mumu", "soe", "poe", "kai", "mine"};
        String[] calling = {"kai", "kai", "mine", "mine"};

        String[] result = p.solution(player, calling);

        for(String s : result) {
            System.out.println(s);
        }
    }
}
