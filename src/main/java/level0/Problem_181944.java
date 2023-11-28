package level0;

import java.util.Scanner;

public class Problem_181944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println(n + " is even");
                break;
            case 1:
                System.out.println(n + " is odd");
                break;
        }
    }
}
