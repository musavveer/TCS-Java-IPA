package complex;


import java.util.Scanner;

public class FlowerSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flowers[] flowers = new Flowers[4];

        for(int i=0; i<flowers.length; i++) {
            int flowerId = sc.nextInt(); sc.nextLine();
            String flowerName = sc.nextLine();
            int price = sc.nextInt(); sc.nextLine();
            int rating = sc.nextInt(); sc.nextLine();
            String type = sc.nextLine();

            flowers[i] = new Flowers(flowerId, flowerName, price, rating, type);
        }
        String srcType = sc.nextLine();
        sc.close();

        Flowers solution = findMinPriceByType(flowers, srcType);
        if(solution != null) {
            System.out.println(solution.getFlowerId());
        }
        else {
            System.out.println("There is no flower with given type");
        }
    }

    public static Flowers findMinPriceByType(Flowers[] flowers, String srcType ) {
        Flowers minPriceFlower = null;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<flowers.length; i++) {
            if(flowers[i].getRating()> 3 && flowers[i].getType().equalsIgnoreCase(srcType)) {
                if(flowers[i].getPrice() < minPrice) {
                    minPrice = flowers[i].getPrice();
                    minPriceFlower = flowers[i];
                }
            }
        }
        return minPriceFlower;
    }
}
class Flowers {
    int flowerId;
    String flowerName;
    int price;
    int rating;
    String type;

    public Flowers(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    } 
    
}

/*

input:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
ephemerals



output:

213
*/