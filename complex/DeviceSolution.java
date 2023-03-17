package complex;

import java.util.Scanner;

public class DeviceSolution {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Phone[] phone = new Phone[4];

        for(int i=0; i<phone.length; i++) {
            int phoneId = sc.nextInt(); sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();

            phone[i] = new Phone(phoneId, os, brand, price);
        }
        String brand1 = sc.nextLine();
        String os1 = sc.nextLine(); 
        sc.close();

        int priceResult = findPriceForGivenBrand(phone, brand1);
        if(priceResult > 0) {
            System.out.println(priceResult);
        }
        else {
            System.out.println("The given Brand is not available");
        }

        Phone phoneResult = getPhoneBasedOnOs(os1, phone);
        if(phoneResult != null) {
           System.out.println(phoneResult.phoneId); 
        }
        else {
            System.out.println("The given Brand is not available");
        }
    }

    /**************** Static Methods **************/
    public static int findPriceForGivenBrand(Phone[] phone, String brand1) {
        int price = 0;
        for(int i=0; i<phone.length; i++) {
            if(phone[i].getBrand().equalsIgnoreCase(brand1)) {
                price += phone[i].getPrice();
            }
        }
        if(price>0) {
            return price;
        } 
        else {
            return 0;
        }
    }

    public static Phone getPhoneBasedOnOs(String os1, Phone[] phone) {
        Phone temp = null;
        for(int i=0; i<phone.length; i++) {
            if(phone[i].getOs().equalsIgnoreCase(os1) && phone[i].getPrice()>=50000) {
                temp = phone[i];
                return temp;
            }
        }
        return temp;
    }
}

class Phone {
    int phoneId;
    String os;
    String brand;
    int price;

    public Phone(int p, String o, String b, int prc) {
        this.phoneId = p;
        this.os = o;
        this.brand = b;
        this.price = prc;
    }

    public int getPhoneId() {
        return phoneId;
    }
    public void setPhoneId(int p) {
        this.phoneId = p;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String o) {
        this.os = o;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String b) {
        this.brand = b;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int prc) {
        this.price = prc;
    }
}