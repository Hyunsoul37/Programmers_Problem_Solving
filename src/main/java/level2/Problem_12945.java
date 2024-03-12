package level2;

import java.util.ArrayList;
import java.util.List;

public class Problem_12945 {
    public int solution(int n) {
        List<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);

        for(int i = 2; i <= n; i ++) {
            fibo.add((fibo.get(i - 2) + fibo.get(i - 1)) % 1234567);
        }

        return fibo.get(n);
    }

    public static void main(String[] args) {
        Problem_12945 p = new Problem_12945();

        System.out.println(p.solution(3));
        System.out.println(p.solution(5));
    }
}
