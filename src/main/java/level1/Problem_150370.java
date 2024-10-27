package level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_150370
{
    public int[] solution(String today, String[] terms, String[] privacies)
    {
        Map<String, Integer> termsMap = new HashMap<>();
        int calcToday = calcDays(today);
        List<Integer> result = new ArrayList<>();

        for (String term : terms)
        {
            String[] split = term.split(" ");
            termsMap.put(split[0], Integer.parseInt(split[1]) * 28);
        }

        for (int i = 0; i < privacies.length; i++)
        {
            String[] split = privacies[i].split(" ");

            // split[0]: 2021.05.02, split[1]: A
            int expirationDate = this.calcDays(split[0]) + termsMap.get(split[1]);

            if (calcToday >= expirationDate)
            {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private int calcDays(String date)
    {
        String[] split = date.split("\\.");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        int result = 0;

        result += year * 12 * 28;
        result += month * 28;
        result += day;

        return result;
    }

    public static void main(String[] args)
    {
        Problem_150370 p = new Problem_150370();
        String today = "2022.05.19";
        String[] terms = new String[] { "A 6", "B 12", "C 3" };
        String[] privacies = new String[] { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };

        int[] result = p.solution(today, terms, privacies);

        for (int i : result)
        {
            System.out.println(i);
        }

    }
}
