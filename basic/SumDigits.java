package basic;

import java.util.Scanner;

/* Read number and print sum of all digits in that number
 * ip: 2030
 * op: 5
 */

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        int sum=0;
        while(num>0) {
            int rem = num%10; // to take the last digit
            sum = sum+rem; // to find the sum
            num = num/10; // to eliminate the last digit
        }
        System.out.println(sum);
        sc.close();
    }
}
