package level0;

public class Problem_181915 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int i : index_list) {
            answer += my_string.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181915 p = new Problem_181915();

        System.out.println(
                p.solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7})
        );

        System.out.println(
                p.solution("zpiaz", new int[] {1, 2, 0, 0, 3})
        );
    }
}
