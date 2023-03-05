package basic;
// Read two numbers d find the value of one number raised to power of another
/* ip: 2 and 5
   op: 32=(2*2*2*2*2)
 */

import java.util.Scanner;

public class NoRaised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
    
        int result = 1;
        for(int i=0; i<y; i++) {
            result *= x;
        }
        System.out.println(result);
        sc.close();
    }
    
}
