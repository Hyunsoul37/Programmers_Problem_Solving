package level0;

public class Problem_181913 {
    public String solution(String my_string, int[][] queries) {
        for(int[] query : queries) {
            my_string = reserveString(query[0], query[1], my_string);
        }

        return my_string;
    }

    public String reserveString(int start, int end, String input) {
        char[] arrChar = input.toCharArray();

        while(start < end) {
            char c = arrChar[start];
            arrChar[start] = arrChar[end];
            arrChar[end] = c;

            start++;
            end--;
        }

        return String.valueOf(arrChar);
    }

    public static void main(String[] args) {
        Problem_181913 p = new Problem_181913();

        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        System.out.println(p.solution(my_string, queries));
    }
}
