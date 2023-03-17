package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitsAL {
    public static void main(String[] args) {
        ArrayList<String> Fruits = new ArrayList<String>();
        Fruits.add("Apple"); 
        Fruits.add("Mango");
        Fruits.add("Banana");
        Fruits.add("Pineapple");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit name");
        String Fruit = sc.nextLine();

        for(int i=0; i<Fruits.size();) {
            if(Fruits.get(i).equals(Fruit)) {
                // fruitAvailabe = true;
                System.out.println("Fruit available");
                break;
            }
            else {
                System.out.println("Not Available");
                break;
            }
        }
        sc.close();
    }
}
