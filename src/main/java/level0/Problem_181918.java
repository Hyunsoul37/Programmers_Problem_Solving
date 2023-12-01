package level0;

import java.util.Stack;

public class Problem_181918 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++) {
            if(stack.empty()) {
                stack.add(arr[i]);
                continue;
            }

            if(stack.peek() < arr[i]) {
                stack.add(arr[i]);
            }
            else {
                stack.pop();
                i--;
            }

        }

        return stack.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Problem_181918 p = new Problem_181918();

        int[] arr = {1, 4, 2, 5, 3};

        int[] result = p.solution(arr);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
