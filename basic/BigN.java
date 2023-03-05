package basic;

import java.util.Scanner;

public class BigN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int big = 0;
        int small = 0;
        int n = 0;
        for(int i=0; i<count; i++) {
            n = sc.nextInt();
            if(i==0) {
                small = n; // first number is stored as smallest
            }
            if(n>big) {
                big = n;
            }
            if(n<small) {
                small = n;
            }
        }
        System.out.println("Results");
        System.out.println(big);
        System.out.println(small);
        sc.close();
    }
}
