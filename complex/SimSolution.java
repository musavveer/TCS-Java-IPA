package complex;

import java.util.Arrays;
import java.util.Scanner;

public class SimSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] sim = new Sim[4];

        for(int i=0; i<sim.length; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String company = sc.nextLine();
            int balance = sc.nextInt(); sc.nextLine();
            double ratePerSecond = sc.nextDouble(); sc.nextLine();
            String circle = sc.nextLine();

            sim[i] = new Sim(id, company, balance, ratePerSecond, circle); /*** IMPORTANT ****/
        }
        String search_circle = sc.nextLine();
        double search_rate = sc.nextDouble(); sc.nextLine();
        sc.close();

        Sim[] result = matchAndSort(sim,search_circle,search_rate);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i].getId());
        }
    }

    /******************************* */
    public static Sim[] matchAndSort(Sim[] sim,String search_circle, double search_rate) {
        
        Sim refined[] = new Sim[0];
        for(int i=0; i<sim.length; i++) {
            if(sim[i].getCircle().equals(search_circle) && sim[i].getRatePerSecond() < search_rate) {
                refined = Arrays.copyOf(refined, refined.length+1);
                refined[refined.length-1] = sim[i];
            }
        }

        // sort in desecnding order 
        for(int i=0; i<refined.length-1; i++) {
            for(int j=0; j<refined.length-i-1; j++) {
                if(refined[j].getBalance() < refined[j+1].getBalance()) {
                    Sim temp = refined[j];
                    refined[j] = refined[j+1];
                    refined[j+1] = temp;
                }    
            }
        }
        return refined;
    }
}

class Sim {
    int id;
    String company;
    int balance;
    double ratePerSecond;
    String circle;

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
