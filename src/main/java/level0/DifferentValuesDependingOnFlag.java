package level0;

import java.util.Scanner;

public class DifferentValuesDependingOnFlag {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

    public static void main(String[] args) {
        DifferentValuesDependingOnFlag dv = new DifferentValuesDependingOnFlag();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        boolean flag = false;

        if(s.equals("true")) {
            flag = true;
        }

        System.out.println(dv.solution(a, b, flag));
    }
}
