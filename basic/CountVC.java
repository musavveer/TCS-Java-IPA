package basic;
import java.util.Scanner;

// WAP to read str and to count both vowels and consonants in that string

class CountVC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();

        int vowelCount=0, consonantCount=0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                vowelCount += 1;
            }
            else {
                consonantCount += 1;
            }
        }
        System.out.println("Vowles count: "+vowelCount);
        System.out.println("Consonant count: "+consonantCount);

        sc.close();
    }
}
