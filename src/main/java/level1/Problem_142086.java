package level1;

import java.util.HashMap;
import java.util.Map;

public class Problem_142086 {
    public int[] solution(String s)
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArr = s.toCharArray();
        int[] result = new int[charArr.length];

        for (int i = 0; i < charArr.length; i++)
        {
            if (!map.containsKey(charArr[i]))
            {
                result[i] = -1;
            }
            else
            {
                result[i] = map.get(charArr[i]);
            }

            map.put(charArr[i], 0);
            map.replaceAll((key, value) -> value + 1);
        }

        return result;
    }

    public static void main(String[] args)
    {
        Problem_142086 p = new Problem_142086();

        int[] result1 = p.solution("banana");

        for (int i = 0; i < result1.length; i++)
        {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        int[] result2 = p.solution("foobar");

        for (int i = 0; i < result2.length; i++)
        {
            System.out.print(result2[i] + " ");
        }
    }
}