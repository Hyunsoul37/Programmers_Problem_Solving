package level1;

import java.util.Stack;

public class Problem_133502 {
    public int solution(int[] ingredient)
    {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ingredient.length; i++)
        {
            stack.push(ingredient[i]);
            if (isMakeHamburger(stack))
            {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                answer++;
            }
        }

        return answer;
    }

    private boolean isMakeHamburger(Stack<Integer> stack)
    {
        if (stack.isEmpty() || stack.size() < 4)
            return false;

        int stackSize = stack.size();

        return stack.get(stackSize - 1) == 1
                && stack.get(stackSize - 2) == 3
                && stack.get(stackSize - 3) == 2
                && stack.get(stackSize - 4) == 1;
    }

    public static void main(String[] args)
    {
        Problem_133502 p = new Problem_133502();

        int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        System.out.println(p.solution(ingredient1));
        System.out.println(p.solution(ingredient2));
    }
}