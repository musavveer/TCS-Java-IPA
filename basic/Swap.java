package basic;

import java.util.ArrayList;
import java.util.Collections;

//  Swap list form the middle if it is even else return the same list
public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(33);
        ar.add(44);
        ar.add(11);
        ar.add(22);
        ar.add(77);
        ar.add(88);
        ar.add(99);
        ar.add(55);

        int s = ar.size();
        int ele = s/2;
        int mod = s%2; // gives first elem

       for(int i=0; i<ele; i++) {
           if(mod==0) {
               Collections.swap(ar, i, i+ele);
           }
           else {
               Collections.swap(ar, i, i+1+ele);
           }
       }
       for(int j=0; j<ar.size(); j++) {
           System.out.println(ar.get(j));
       }
    }
}
