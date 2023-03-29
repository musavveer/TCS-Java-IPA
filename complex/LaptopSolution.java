package complex;

import java.util.Arrays;
import java.util.Scanner;

public class LaptopSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop[] laptop = new Laptop[4];

        for(int i=0; i<laptop.length; i++) {
            int laptopId = sc.nextInt(); sc.nextLine();
            String brand = sc.nextLine();
            String osType = sc.nextLine();
            double price = sc.nextDouble(); sc.nextLine();
            int rating = sc.nextInt(); sc.nextLine();

            laptop[i] = new Laptop(laptopId, brand, osType, price, rating);
        }

        String srcBrand = sc.nextLine();
        String srcOs = sc.nextLine();
        sc.close();

        int count = countOfLaptopsByBrand(laptop, srcBrand);
        if(count > 0) {
            System.out.println(count);
        }
        else {
            System.out.println("The given brand is not available");
        }

        Laptop[] result = searchLaptopByOsType(laptop, srcOs);
        if(result.length == 0) {
            System.out.println("The given os is not available");
        }
        else {
            for(int i=0; i<result.length; i++) {
                System.out.println(result[result.length-i-1].getLaptopId());
                System.out.println(result[result.length-i-1].getRating());
            }
        }  
        
    }
    /************** */
    public static int countOfLaptopsByBrand(Laptop[] laptop,String srcBrand) {
        int count = 0;
        for(int i=0; i<laptop.length; i++) {
            if(laptop[i].getRating() > 3 && laptop[i].getBrand().equalsIgnoreCase(srcBrand)) {
                count++;
            }
        }
        return count;
    }
    public static Laptop[] searchLaptopByOsType(Laptop[] laptop, String srcOs) {
        Laptop[] result = new Laptop[0];
        for(int i=0; i<laptop.length; i++) {
            if(laptop[i].getOsType().equalsIgnoreCase(srcOs)) {
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = laptop[i];
            }
        }
        for(int i=0; i<laptop.length-1; i++) {
            for(int j=0; j<laptop.length-i-1; i++) {
                if(laptop[j].getLaptopId() < laptop[j+1].getLaptopId()) {
                    Laptop temp = laptop[j];
                    laptop[j] = laptop[j+1];
                    laptop[j+1] = temp;
                }
            }
        }

        if(laptop.length>0) {
            return result;
        } 
        else {
            return null;
        }
    }
}

class Laptop {
    int laptopId;
    String brand;
    String osType;
    double price;
    int rating;

    public Laptop(int l, String b, String o, double p, int r) {
       this.laptopId = l;
       this.brand = b;
       this.osType = o;
       this.price = p;
       this.rating = r; 
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

/*

123
hp
windows
35000
5
124
apple
mac os
700000
5
125
dell
ubuntu
30000
4
126
hp
windows
40000
4
hp
windows

o/p:
2
126
4
123
5

*/