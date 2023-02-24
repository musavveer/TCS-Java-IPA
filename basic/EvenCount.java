package basic;

import java.util.Scanner;

/*  print number of even digits if it is greater than 3 else It is not a valid number
 4536782  - 4  
 1365279 - It is not a valid number
*/
public class EvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int count = 0;
        while(num>0) {
            int rem = num%10; // to get the last digit 1234 -- 4
            if(rem%2 == 0) {
                count++;
            }
            num = num/10; // to ignore the last digit 123
        }

        if(count>3) {
            System.out.println(count);
        }
        else {
            System.out.println("It is not a valid number");
        }
        sc.close();
    }
}
