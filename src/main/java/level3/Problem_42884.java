package level3;

import java.util.*;

public class Problem_42884 {
    public int solution(int[][] routes)
    {
        List<Integer> cameras = new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        for (int[] route : routes)
        {
            pq.offer(route);
        }

        while (!pq.isEmpty())
        {
            int[] route = pq.poll();
            System.out.println(route[0] + " " + route[1]);
            boolean isChecked = false;

            for (int i = 0; i < cameras.size(); i++)
            {
                if (route[0] <= cameras.get(i) && route[1] >= cameras.get(i))
                {
                    isChecked = true;
                    break;
                }
            }

            if (!isChecked)
            {
                cameras.add(route[1]);
            }
        }

        return cameras.size();
    }

    public static void main(String[] args) {
        Problem_42884 p = new Problem_42884();

        int[][] routes = new int[][]{{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}};

        System.out.println(p.solution(routes));
    }
}
