package complex;

import java.util.Arrays;
import java.util.Scanner;

public class VesselSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] vessels = new NavalVessel[4];

        for(int i=0; i<vessels.length; i++) {
            int vesselId = sc.nextInt(); sc.nextLine();
            String vesselName = sc.nextLine();
            int noOfVoyagesPlanned = sc.nextInt(); sc.nextLine();
            int noOfVoyagesCompleted = sc.nextInt(); sc.nextLine();
            String purpose = sc.nextLine();

            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }
        int percentage = sc.nextInt(); sc.nextLine();
        String srcPurpose = sc.nextLine();
        sc.close();
    }
    public static int findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        int sum=0; 
        int k=0;
        for(int i=0; i<vessels.length; i++) {
            if(vessels[i].getNoOfVoyagesCompleted()*100/vessels[i].getNoOfVoyagesPlanned() > percentage) {
                sum = sum+vessels[i].getNoOfVoyagesCompleted();
                k++;
            }
        }
        if(k>0) {
            int avg = sum/k;
            return avg;
        }
        else {
            return 0;
        }
    }

    public static NavalVessel[] findVesselByGrade(NavalVessel[] vessels,String srcPurpose) {
        NavalVessel[] refined = new NavalVessel[0];
        for(int i=0; i<vessels.length; i++) {
            if(vessels[i].getPurpose().equalsIgnoreCase(srcPurpose)) {
                refined = Arrays.copyOf(refined, refined.length+1);
                refined[refined.length-1] = vessels[i];
            }
        }
        if(refined.length > 0) {
            return refined;
        }
        else {
            return null;
        }
    }
}

class NavalVessel {
    int vesselId;
    String vesselName;
    int noOfVoyagesPlanned;
    int noOfVoyagesCompleted;
    String purpose;

    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted,
            String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }

    public int getVesselId() {
        return vesselId;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
}