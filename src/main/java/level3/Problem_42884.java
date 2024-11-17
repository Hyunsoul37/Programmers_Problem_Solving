package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem_42884 {
    public int solution(int[][] routes)
    {
        List<Integer> cameras = new ArrayList<>();

        // 이동 거리가 짧은순
        //Arrays.sort(routes, (route1, route2) -> (route2[0] - route2[1]) - (route1[0] - route1[1]));

        // 일찍 나간 순
        Arrays.sort(routes, (route1, route2) -> route1[1] - route2[1]);
        cameras.add(routes[0][1]);

        for (int i = 0; i < routes.length; i++)
        {
            boolean found = true;

            for (int camera = 0; camera < cameras.size(); camera++)
            {
                if (routes[i][0] <= cameras.get(camera) && routes[i][1] >= cameras.get(camera))
                    found = true;
                else
                    found = false;
            }

            if (!found)
                cameras.add(routes[i][1]);
        }

        return cameras.size();
    }

    public static void main(String[] args) {
        Problem_42884 p = new Problem_42884();

        int[][] routes = new int[][]{{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};

        System.out.println(p.solution(routes));
    }
}
