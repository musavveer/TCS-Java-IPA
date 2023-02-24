package basic;
import java.util.*;

// Reverse the given number

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;

        while(n>0) {
            int rem = n%10; // to get the last digit 12345 - 5
            result = result * 10 + rem; // 0*10+5 = 5 -- 5*10+4 = 54 -- 54*10+3 = 543 
            n = n/10; // to ignore the last digit 12345/10 -- 1234
        }
        System.out.println(result);

        sc.close();
    }    
}