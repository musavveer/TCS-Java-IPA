package complex;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motel[] Motel = new Motel[4];

        for(int i=0; i<Motel.length; i++) {
            int motelId = sc.nextInt(); sc.nextLine();
            String motelName = sc.nextLine();
            String date = sc.nextLine();
            int noOfRooms = sc.nextInt(); sc.nextLine();
            String cab = sc.nextLine();
            double bill = sc.nextDouble();sc.nextLine();

            Motel[i] = new Motel(motelId, motelName, date, noOfRooms, cab, bill);
        }

        String cabFaci = sc.nextLine();
        int nos = totalNoOfRoomsBooked(Motel, cabFaci);
        
        if(nos>0) {
            System.out.println(nos);
        }
        else {
            System.out.println("No such rooms booked");
        }
    }

    public static int totalNoOfRoomsBooked(Motel[] motel, String cabFaci) {
        int count = 0;
        for(Motel mo:motel) {
            if(mo.getnoOfRoomsBooked() > 5 && mo.getCabFacility().equalsIgnoreCase(cabFaci)) {
                count = count+mo.getnoOfRoomsBooked();
            }
        }
        return count;
    }
}

class Motel {
    int motelId;
    String motelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String cabFacility;
    double totalBill;

    public int getMotelId() {
        return motelId;
    }
    public void setMotelId(int motelId) {
        this.motelId = motelId;
    }
    public String getmotelName() {
        return motelName;
    }
    public void setMotelName(String motelName) {
        this.motelName = motelName;
    }
    public String getdateOfBooking() {
        return dateOfBooking;
    }
    public void setdateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }
    public int getnoOfRoomsBooked() {
        return noOfRoomsBooked;
    }
    public void setnoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }
    public String getCabFacility() {
        return cabFacility;
    }
    public void setCabFacility(String cabFacility) {
        this.cabFacility = cabFacility;
    }
    public double getTotalBill() {
        return totalBill;
    }
    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
    
    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill){
        
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }
}