package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_172928 {

    public int[] solution(String[] park, String[] routes) {
        int[] answer = checkStartPos(park);

        for (int i = 0; i < routes.length; i++) {
            answer = move(park, routes[i], answer);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    private int[] move(String[] park, String route, int[] pos)
    {
        String[] split = route.split(" ");
        String operation = split[0];
        int count = Integer.parseInt(split[1]);

        int width = park[0].length();
        int height = park.length;

        int x = pos[1];
        int y = pos[0];


        switch(operation.toUpperCase())
        {
            case "E":
                for (int n = 1; n <= count; n++)
                {
                    if (width <= x + n || park[y].charAt(x + n) == 'X')
                    {
                        return pos;
                    }
                }

                pos[1] += count;
                break;
            case "W":
                for (int n = 1; n <= count; n++)
                {
                    if (x - n < 0 || park[y].charAt(x - n) == 'X')
                    {
                        return pos;
                    }
                }

                pos[1] -= count;
                break;
            case "S":
                for (int n = 1; n <= count; n++)
                {
                    if (height <= y + n || park[y + n].charAt(x) == 'X')
                    {
                        return pos;
                    }
                }

                pos[0] += count;
                break;
            case "N":
                for (int n = 1; n <= count; n++)
                {
                    if (y - n < 0  || park[y - n].charAt(x) == 'X')
                    {
                        return pos;
                    }
                }

                pos[0] -= count;
                break;
        }

        return pos;
    }


    private int[] checkStartPos(String[] park)
    {
        int[] result = new int[2];

        for (int i = 0; i < park.length; i++)
        {
            for (int j = 0; j < park[i].length(); j++)
            {
                if (park[i].charAt(j) == 'S')
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Problem_172928 p = new Problem_172928();

        String[] park1 = {"SOO", "OOO", "XOO"};
        String[] routes1 = {"S 1"};

        String[] park2 = {"SOO","OXX","OOO"};
        String[] routes2 = {"E 2","S 2","W 1"};

        String[] park3 = {"OOO","OOO","OXO","OOS"};
        String[] routes3 = {"E 2","S 3","W 1"};

        int[] result1 = p.solution(park1, routes1);
        int[] result2 = p.solution(park2, routes2);
        int[] result3 = p.solution(park3, routes3);
//        for(int i : result2) {
//            System.out.println(i);
//        }
    }
}
