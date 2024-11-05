package level1;

import java.util.Stack;

public class Problem_689353
{
    public int solution(int n)
    {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        while (n > 0)
        {
            stack.add(n % 3);
            n /= 3;
        }

        int pow = 0;

        while (!stack.empty())
        {
            int pop = stack.pop();
            answer += (int) (Math.pow(3, pow) * pop);
            pow++;
        }


        return answer;
    }

    public static void main(String[] args)
    {
        Problem_689353 p = new Problem_689353();

        int n = 125;

        System.out.println(p.solution(n));
    }
}
