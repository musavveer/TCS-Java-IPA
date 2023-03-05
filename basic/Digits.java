package basic;

import java.util.Scanner;
// read a number and print all the digits in the number
/*
 * ip: 12345
 * op: 5    4   3   2   1
 */

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num>0) {
            int rem=num%10;
            System.out.println(rem);
            num = num/10;
        }
        sc.close();
    }
}
