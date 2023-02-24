package basic;
import java.util.Scanner;

// To print matrix at odd position of a String input: Matrix   output:Mti

class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i+=2) {
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}
