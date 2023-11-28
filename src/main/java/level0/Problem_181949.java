package level0;

import java.util.Scanner;

public class Problem_181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int gep = 'A' - 'a';

        for(int i = 0; i < a.length(); i++) {

            char c = a.charAt(i);

            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                c += gep;
            }
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                c -= gep;
            }

            System.out.print(c);
        }
    }
}
