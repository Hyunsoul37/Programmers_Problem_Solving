package level0;

import java.util.Arrays;

public class Problem_181900 {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        Arrays.sort(indices);

        for(int i = 0; i < my_string.length(); i++) {
            if(index < indices.length && i == indices[index]) {
                index++;
            }
            else {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Problem_181900 p = new Problem_181900();

        System.out.println(p.solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }
}
