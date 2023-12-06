package level0;

public class Problem_181882 {
    public int[] solution(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
            else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] *= 2;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Problem_181882 p = new Problem_181882();

        int[] arr = new int[] {1, 2, 3, 100, 99, 98};

        int[] result = p.solution(arr);

        for(int i : result) {
            System.out.println(i);
        }
    }
}