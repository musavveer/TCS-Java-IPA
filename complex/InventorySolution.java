package complex;

import java.util.*;

public class InventorySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory[] inventory = new Inventory[4];

        for(int i=0; i<inventory.length; i++) {
            String inventoryId = sc.nextLine();
            int maximumQuantity = sc.nextInt(); sc.nextLine();
            int currentQuantity = sc.nextInt(); sc.nextLine();
            int threshold = sc.nextInt(); sc.nextLine();

            inventory[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }

        int limit = sc.nextInt(); sc.nextLine();
        sc.close();

        Inventory[] result = replenish(inventory, limit);
        for(int i=0; i<result.length; i++) {
            if(result[i].threshold>=75) {
                System.out.println(result[i].inventoryId+" Critical Filling");
            }
            else if(result[i].threshold >=50 && result[i].threshold < 75) {
                System.out.println(result[i].inventoryId+" Moderate Filling");
            }
            else {
                System.out.println(result[i].inventoryId+" Non-Critical Filling");
            }
        }
        

    }

    /************* Static Method *******/
    public static Inventory[] replenish(Inventory[] inventory, int limit) {
        Inventory[] result = new Inventory[0];
        for(int i=0; i<inventory.length; i++) {
            if(inventory[i].threshold<=limit) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = inventory[i];
            }
        }
        return result;
    }
}

class Inventory {
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(String i, int m, int c, int t) {
        this.inventoryId = i;
        this.maximumQuantity = m;
        this. currentQuantity = c;
        this.threshold = t;
    }
}