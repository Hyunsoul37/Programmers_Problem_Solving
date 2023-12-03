package level0;

public class Problem_181884 {
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i : numbers) {
            answer += i;
            if (answer > n) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181884 p = new Problem_181884();

        int[] numbers;

        numbers = new int[] {34, 5, 71, 29, 100, 34};
        System.out.println(p.solution(numbers, 123));

        numbers = new int[] {58, 44, 27, 10, 100};
        System.out.println(p.solution(numbers, 139));
    }
}
