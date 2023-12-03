package level0;

public class Problem_181887 {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                even += num_list[i];
            }
            else {
                odd += num_list[i];
            }
        }

        return Math.max(odd, even);
    }

    public static void main(String[] args) {
        Problem_181887 p = new Problem_181887();

        System.out.println(p.solution(new int[] {4, 2, 6, 1, 7, 6}));
        System.out.println(p.solution(new int[] {-1, 2, 5, 6, 3}));
    }
}
