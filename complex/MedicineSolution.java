package complex;

import java.util.Scanner;
import java.util.Arrays;

public class MedicineSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicine[] medicine = new Medicine[4];

        for(int i=0; i<medicine.length; i++) {
            String MedicineName = sc.nextLine();
            String Batch = sc.nextLine();
            String Disease = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();
            medicine[i] = new Medicine(MedicineName, Batch, Disease, price);
        }
        String Disease1 = sc.nextLine();
        sc.close();

        Integer[] result = getPriceByDisease(medicine, Disease1);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }

    }
    /***************** Static Method **************/
    public static Integer[] getPriceByDisease(Medicine[] medicine, String Disease1) {
        Integer[] result = new Integer[0];
        for(int i=0; i<medicine.length; i++) {
            if(medicine[i].getDisease().equalsIgnoreCase(Disease1)) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = medicine[i].getPrice();
            }
            Arrays.sort(result);
        }
        return result;
    }

}

class Medicine {
    String MedicineName;
    String Batch;
    String Disease;
    int price;

    public Medicine(String m, String b, String d, int p) {
        this.MedicineName = m;
        this.Batch = b;
        this.Disease = d;
        this.price = p;
    }
    public String getMedicineName() {
        return MedicineName;
    }
    public void setMedicineName(String m) {
        this.MedicineName = m;
    }
    public String getBatch() {
        return Batch;
    }
    public void setBatch(String b) {
        this.Batch = b;
    }
    public String getDisease() {
        return Disease;
    }
    public void setDisease(String d) {
        this.Disease = d;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int p) {
        this.price = p;
    }
}
