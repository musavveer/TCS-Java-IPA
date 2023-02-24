package complex;
import java.util.Scanner;

public class TravelSolution {
    public static void main(String[] args) {
        // basic step
        int regNo;
        String agencyName;
        String packageType;
        int price;
        boolean flightFacility;

        Scanner sc = new Scanner(System.in);
        TravelAgencies[] travelAgencies = new TravelAgencies[4];
        

        for(int i=0; i<travelAgencies.length; i++) {
            regNo = sc.nextInt(); sc.nextLine();
            agencyName = sc.nextLine();
            packageType = sc.nextLine();
            price = sc.nextInt();
            flightFacility = sc.nextBoolean();

            travelAgencies[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }
        int regNo1 = sc.nextInt(); sc.nextLine();
        String packageType1 = sc.nextLine();

        int highestPackagePrice = findAgencywithHighestPackagePrice(travelAgencies);
        System.out.println(highestPackagePrice);

        TravelAgencies travelAgency1 = agencyDetailsForGivenIdAndType(travelAgencies, regNo1, packageType1);
        System.out.println(travelAgency1.agencyName + ":" + travelAgency1.price);

        
    }
    // main out
    /****************** */

    public static int findAgencywithHighestPackagePrice(TravelAgencies[] travelAgencies) {
        int highestPackagePrice = 0;
        for(int i=0; i<travelAgencies.length; i++) {
            if(travelAgencies[i].price > highestPackagePrice) {
                highestPackagePrice = travelAgencies[i].price;
            }
        }
        return highestPackagePrice;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] travelAgencies, int regNo, String packageType) {
        for(int i=0; i<travelAgencies.length; i++) {
            if(travelAgencies[i].flightFacility) {
                if(travelAgencies[i].regNo == regNo && travelAgencies[i].packageType.equalsIgnoreCase(packageType)) {
                    return travelAgencies[i];
                }
            }
        }
        return null;
    }


}

class TravelAgencies {

    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.flightFacility = flightFacility;
        this.packageType = packageType;
        this.price = price;
        this.regNo = regNo;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}
