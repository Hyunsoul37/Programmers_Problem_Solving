package level0;

public class Problem_181856 {
    public int solution(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;

        if(arr1.length > arr2.length) {
            return 1;
        }
        else if (arr1.length < arr2.length) {
            return -1;
        }

        for(int i = 0; i < arr1.length; i++) {
            sumArr1 += arr1[i];
            sumArr2 += arr2[i];
        }

        if(sumArr1 == sumArr2) {
            return 0;
        }

        return sumArr1 > sumArr2 ? 1 : -1;
    }

    public static void main(String[] args) {
        Problem_181856 p = new Problem_181856();

        System.out.println(p.solution(new int[] {49, 13}, new int[] {70, 11, 2}));
        System.out.println(p.solution(new int[] {100, 17, 84, 1}, new int[] {55, 12, 65, 36}));
        System.out.println(p.solution(new int[] {1, 2, 3, 4, 5}, new int[] {3, 3, 3, 3, 3}));
    }
}
