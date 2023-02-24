package basic;
import java.util.Scanner;

// WAP to print last chars in string input: Hi TCS output:is

class Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");

        for(int i=0; i<words.length; i++) {
            System.out.println(words[i].charAt(words[i].length()-1));
        }
        sc.close();
    }
}
