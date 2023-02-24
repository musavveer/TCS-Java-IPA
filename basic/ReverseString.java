package basic;

import java.util.Scanner;

/* print the given string in reverse and all the characters must be in lowercase 
 WelCome -- emoclemw
*/
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        ans = ans.toLowerCase();

        String res = "";
        for(int i=ans.length()-1; i>=0; i--) {
            res += ans.charAt(i);
        }
        System.out.println(res);
        sc.close();
    }
}
