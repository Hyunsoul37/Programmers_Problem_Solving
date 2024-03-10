package level1;

public class Problem_12947 {
    boolean solution(int x) {
        int addNum = 0;
        int divNum = x;

        while(divNum > 0) {
            addNum += divNum % 10;
            divNum /= 10;
        }

        return x % addNum == 0;
    }

    public static void main(String[] args) {
        Problem_12947 p = new Problem_12947();

        System.out.println(p.solution(10));
        System.out.println(p.solution(11));
        System.out.println(p.solution(12));
        System.out.println(p.solution(13));
    }
}