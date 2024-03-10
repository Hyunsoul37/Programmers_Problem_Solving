package level1;

public class Problem_12944 {

    public double solution(int[] arr) {
        double answer = 0;

        for(int i : arr) {
            answer += i;
        }
        return answer / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {5,5};

        Problem_12944 p = new Problem_12944();

        System.out.println(p.solution(arr));
        System.out.println(p.solution(arr2));
    }
}