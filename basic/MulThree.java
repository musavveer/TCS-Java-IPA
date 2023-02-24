package basic;

import java.util.Scanner;

/*
 Take the input and get the sum, if sum is multiple of 3 then print true else false

 333 -- True
 200 -- False
 */

class MulThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0;

        while(n>0) {
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        if(sum%3 == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        sc.close();
    }    
}
