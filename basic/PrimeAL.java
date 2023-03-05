package basic;

import java.util.ArrayList;

// count of prime number in ArrayList
public class PrimeAL {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(3);
        ar.add(5);
        ar.add(7);
        ar.add(11);


        int cnt=0;
        for(int i=0; i<ar.size(); i++) {
            int cn=0;
            for(int j=2; j<ar.get(i); j++) {
                if(ar.get(i) % j == 0) {
                    cn++;
                    break;
                }
            }
            if(cn>0) {
                cnt++;
            }
        }
        System.out.println(ar.size()-cnt);
    }    
}
