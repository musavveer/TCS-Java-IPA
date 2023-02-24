package basic;

import java.util.Scanner;

/* take 5 values as input from the user add find the sum of the odd values, if the odd value is greater than 8 than print the odd sum else print 'NA' 
ex:
1
2
3
5
7

16
*/

public class SumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;

        for(int i=0; i<5; i++) {
            int num = sc.nextInt();
            if(num%2!=0) {
                res += num;
            }
        }

        if(res>8) {
            System.out.println("The odd sum is "+res);
        }
        else {
            System.out.println("NA");
        }
        sc.close();
    }
}
