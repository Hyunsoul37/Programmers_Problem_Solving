package level0;

public class Problem_181921 {
    public int[] solution(int l, int r) {
        int[] answer = {};
        int base = 5;
        int add = 0;

        while((base + add) <= r) {
            if(base + add >= l && base + add <= r) {
                System.out.println(base + add + " - base : " + base + ", add : " + add);
            }

            if(add == 0) {
                add = 5;
            }
            else {
                add *= 10;
            }

            if(base <= add) {
                add = 0;
                base *= 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181921 p = new Problem_181921();

        int[] result = p.solution(5,5555);

        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();

        result = p.solution(10, 20);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
