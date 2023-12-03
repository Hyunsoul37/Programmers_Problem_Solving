package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_181897 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch (n) {
            case 1:
                answer = one(slicer, num_list);
                break;
            case 2:
                answer = two(slicer, num_list);
                break;
            case 3:
                answer = three(slicer, num_list);
                break;
            case 4:
                answer = four(slicer, num_list);
                break;
        }
        return answer;
    }

    public int[] one(int[] slicer, int[] num_list) {
        return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
    }

    public int[] two(int[] slicer, int[] num_list) {
        return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
    }

    public int[] three(int[] slicer, int[] num_list) {
        return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
    }

    public int[] four(int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(i ->i).toArray();
    }

    public static void main(String[] args) {
        Problem_181897 p = new Problem_181897();

        int[] result = p.solution(1, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        for (int i : result) {
            System.out.print(i);
        }
        System.out.println();

        result = p.solution(2, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        for (int i : result) {
            System.out.print(i);
        }
        System.out.println();

        result = p.solution(3, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        for (int i : result) {
            System.out.print(i);
        }
        System.out.println();

        result = p.solution(4, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        for (int i : result) {
            System.out.print(i);
        }
        System.out.println();
    }
}
