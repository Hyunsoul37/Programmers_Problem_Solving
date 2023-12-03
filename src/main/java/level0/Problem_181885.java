package level0;

import java.util.ArrayList;
import java.util.List;

public class Problem_181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                answer.add(todo_list[i]);
            }
        }

        return answer.toArray(new String[answer.size()]);
    }

    public static void main(String[] args) {
        Problem_181885 p = new Problem_181885();

        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        String[] result = p.solution(todo_list, finished);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
