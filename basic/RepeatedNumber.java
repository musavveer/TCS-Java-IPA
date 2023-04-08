package basic;

import java.util.Scanner;

// a2b3c1 = aabbbc

public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        for(int i=0; i<s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))) {
                System.out.println(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))) {
                int x = Integer.parseInt(String.valueOf(s.charAt(i)));
                for(int j=1; j<x; j++) {
                    System.out.println(s.charAt(i-1));
                }
            }
        }
    }
}
