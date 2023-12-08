package level0;

import java.util.Stack;

public class Problem_181859 {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        for(int i  = 0; i < arr.length; i++) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
            }
            else if (stk.peek() == arr[i]) {
                stk.pop();
            }
            else {
                stk.add(arr[i]);
            }
        }

        if (stk.isEmpty()) {
            stk.add(-1);
        }

        return stk.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem_181859 p = new Problem_181859();
        int[] result = p.solution(new int[] {0, 1, 1, 1, 0});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
