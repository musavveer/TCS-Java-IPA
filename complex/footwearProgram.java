package complex;
import java.util.*;

public class footwearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear[] footwears = new Footwear[5];

        for(int i=0; i<5; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            footwears[i] = new Footwear(a,b,c,d);
        }

        String inputFootwearType = sc.nextLine();
        String inputFootwearName = sc.nextLine();

        int count = getCountByType(footwears, inputFootwearType);

        if(count>0) {
            System.out.println(count);
        }
        else {
            System.out.println("No footwears available");
        }

        Footwear obj = getSecondHighestPriceByBrand(footwears, inputFootwearName);
        if(obj == null) {
            System.out.println("Brand not available");
        }
        else {
            System.out.println(obj.footwearId);
            System.out.println(obj.footwearName);
            System.out.println(obj.price);
        }
    }

    public static int getCountByType(Footwear[] footwears, String inputFootwearType) {
        int count = 0;
        for(int i=0; i<5; i++) {
            if(footwears[i].footwearType.equalsIgnoreCase(inputFootwearType)) {
                count = count+1;
            }
        }
        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String inputFootwearBrand) {
        int arrOfPrice[] = new int[0];
        for(int i=0; i<5; i++) {
            if(footwears[i].footwearName.equalsIgnoreCase(inputFootwearBrand)) {
                arrOfPrice = Arrays.copyOf(arrOfPrice, arrOfPrice.length+1);
                arrOfPrice[arrOfPrice.length-1] = footwears[i].price;
            }
        }
        Arrays.sort(arrOfPrice);
        if(arrOfPrice.length>0) {
            int x = arrOfPrice[arrOfPrice.length-2];
            for(int i=0; i<5; i++) {
                if(footwears[i].price==x) {
                    return footwears[i];
                }
            }
        }
        return null;
    }
}

class Footwear {
    int footwearId;
    String footwearName;
    String footwearType;
    int price;

    // parameterized constructor
    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    // getters and setters
    public int getFootwearId() {
        return footwearId;
    }

    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}