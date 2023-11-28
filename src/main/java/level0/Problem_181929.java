package level0;

public class Problem_181929 {
    public int solution(int[] num_list) {
        int multi = 1;
        int square = 0;

        for(int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
            square += num_list[i];
        }

        square *= square;

        return multi > square ? 0 : 1;
    }

    public static void main(String[] args) {
        Problem_181929 p = new Problem_181929();
        System.out.println(p.solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(p.solution(new int[] {5, 7, 8, 3}));
    }
}
