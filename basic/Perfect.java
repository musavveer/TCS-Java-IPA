package basic;
// In main method read an integer (containing only numeric digits without decimal and special characters) and check whether the given number is perfect square or not. If it is print TRUE (as string) else print FALSE(as string )

import java.util.Scanner;

class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        n = Math.sqrt(n);

        if((int)n==n) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }

        sc.close();
    }
}