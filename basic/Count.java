package basic;

import java.util.Scanner;

//  Write a Porgram to Print no.of Spaces and Characters in a given input input: Hello This is ABCD from XYZ city output : No of Spaces : 6 and characters : 26 

class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int space_count = 0, char_count = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ' ') {
                space_count++;
            }
            else {
                char_count++;
            }
        }
        System.out.println("No of spaces: "+space_count+ " and characters: "+char_count);
        
        sc.close();
    }

}
