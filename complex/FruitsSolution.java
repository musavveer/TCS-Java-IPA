package complex;

import java.util.Scanner;

class FruitsSolution {
    public static void main(String[] args) {
        int fruitid;
        String fruitname;
        int price;
        int rating;

        Scanner sc = new Scanner(System.in);
        Fruits[] fruits = new Fruits[4];

        for(int i=0; i<fruits.length; i++) {
            fruitid=sc.nextInt();
            sc.nextLine();
            fruitname = sc.nextLine();
            price = sc.nextInt();
            rating = sc.nextInt();

            fruits[i] = new Fruits(fruitid, fruitname, price, rating);
        }
        int rating1 = sc.nextInt();

        Fruits fruit1 = findMaximumPriceByRating(fruits, rating1);

        if(fruit1 == null) {
            System.out.println("No such fruit");
        } 
        else {
            System.out.println(fruit1.getFruitid());
        }
    }
    /************ */
    public static Fruits findMaximumPriceByRating(Fruits[] fruits, int rating) {

        int highestPrice = 0;
        Fruits fruitWithMaximumPrice = null;

        for(int i=0; i<fruits.length; i++){
            if(fruits[i].getRating() > rating) {
                if(fruits[i].getPrice() > highestPrice) {
                    highestPrice = fruits[i].getPrice();
                    fruitWithMaximumPrice = fruits[i];
                }
            }
        }
        return fruitWithMaximumPrice;
    }
}

class Fruits {
    int fruitid;
    String fruitname;
    int price;
    int rating;

    public Fruits(int fruitid, String fruitname, int price, int rating) {
        this.fruitid = fruitid;
        this.fruitname = fruitname;
        this.price = price;
        this.rating = rating;
    } 

    public int getFruitid() {
        return fruitid;
    }

    public void setFruitid(int fruitid) {
        this.fruitid = fruitid;
    }

    public String getFruitname() {
        return fruitname;
    }

    public void setFruitname(String fruitname) {
        this.fruitname = fruitname;
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
}