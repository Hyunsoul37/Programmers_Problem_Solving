package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem_76502 {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            if (isCorrect(s))
                answer++;

            char first = s.charAt(0);
            s = s.substring(1) + first;
        }

        return answer;
    }

    private boolean isCorrect(String s) {
        char[] characters = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : characters) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (!stack.empty() && stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                    break;
                case '}':
                    if (!stack.empty() && stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                    break;
                case ']':
                    if (!stack.empty() && stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                    break;
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        Problem_76502 p = new Problem_76502();

        System.out.println(p.solution("[](){}"));
        System.out.println(p.solution("}]()[{"));
        System.out.println(p.solution("[)(]"));
    }
}
