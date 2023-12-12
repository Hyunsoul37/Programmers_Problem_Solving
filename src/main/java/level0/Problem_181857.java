package level0;

public class Problem_181857 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int size = 1;
        int pow = 0;

        while (size < arr.length) {
            size = (int)Math.pow(2, pow++);
        }
        answer = new int[size];

        System.arraycopy(arr, 0, answer, 0, arr.length);

        return answer;
    }

    public static void main(String[] args) {
        Problem_181857 p = new Problem_181857();

        int[] result = p.solution(new int[] {1, 2, 3, 4, 5, 6});
        for(int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();

        result = p.solution(new int[] {58, 172, 746, 89});
        for(int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();

        result = p.solution(new int[] {58});
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}
