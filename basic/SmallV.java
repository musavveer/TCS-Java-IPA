package basic;
import java.util.*;

/* WAP to print smallest vowel in the given line 
 matrix - a
*/

class SmallV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char large = 'u';

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                if(ch < large) {
                    large = ch;
                }
            }
        }
        System.out.println(large);
        sc.close();
    }    
}
