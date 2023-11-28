package level0;

public class Problem_181931 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                answer += a;
            }

            a+=d;
        }

        return answer;
    }

    public static void main(String[] args) {
        Problem_181931 p = new Problem_181931();
        int a1 = 3;
        int d1 = 4;
        boolean[] included1 = {true, false, false, true, true};

        int result = p.solution(a1, d1, included1);

        System.out.println(result);
    }
}
