package level0;

public class Problem_181928 {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for(int i = 0 ; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even *= 10;
                even += num_list[i];
            }
            else {
                odd *= 10;
                odd += num_list[i];
            }
        }

        return odd + even;
    }

    public static void main(String[] args) {
        Problem_181928 p = new Problem_181928();

        System.out.println(p.solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(p.solution(new int[] {5, 7, 8, 3}));


    }
}
