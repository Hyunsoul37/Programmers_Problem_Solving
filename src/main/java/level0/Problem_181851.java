package level0;

import java.util.HashMap;
import java.util.Map;

public class Problem_181851 {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[][] rankIndex = new int[rank.length][rank.length];

        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {

            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Problem_181851 p = new Problem_181851();

        int[] rank1 = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance1 = {false, true, true, true, true, false, false};
        int[] rank2 = {1, 2, 3};
        boolean[] attendance2 = {true, true, true};
        int[] rank3 = {6, 1, 5, 2, 3, 4};
        boolean[] attendance3 = {true, false, true, false, false, true};

        System.out.println(p.solution(rank1, attendance1));
        System.out.println(p.solution(rank2, attendance2));
        System.out.println(p.solution(rank3, attendance3));

    }
}
