package complex;

import java.util.Arrays;
import java.util.Scanner;

public class HotelSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel[] = new Hotel[4];
        
        for(int i=0; i<hotel.length; i++) {
            int hotelId = sc.nextInt(); sc.nextLine();
            String hotelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt(); sc.nextLine();
            String wifiFacility = sc.nextLine();
            double totalBill = sc.nextDouble(); sc.nextLine();

            hotel[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);
        }
        String Month = sc.nextLine();
        String wifiAvailability = sc.nextLine();
        sc.close();

        int count = noOfRoomsBookedInGivenMonth(hotel, Month);
        if(count>0) {
            System.out.println(count);
        }
        else {
            System.out.println("No rooms booked in the given month");
        }

        Hotel obj = searchHotelByWifiOption(hotel,wifiAvailability);
        if(obj==null) {
            System.out.println("No such option available");
        }
        else {
            System.out.println(obj.getHotelId());
        }

    }
    /**********************/
    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotel, String Month) {
        int totalRoomsBooked = 0;
        for(int i=0; i<hotel.length; i++) {
            if(hotel[i].getDateOfBooking().split("-")[1].equalsIgnoreCase(Month)) {
                totalRoomsBooked += hotel[i].getNoOfRoomsBooked();
            }
        }
        return totalRoomsBooked;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] hotel, String wifiAvailability) {
        int arrOfBill[] = new int[0];
        for(int i=0; i<hotel.length; i++) {
            if(hotel[i].getWifiFacility().equalsIgnoreCase(wifiAvailability)) {
                arrOfBill = Arrays.copyOf(arrOfBill, arrOfBill.length+1);
                arrOfBill[arrOfBill.length-1] = (int) hotel[i].getTotalBill();
            }
        }
        Arrays.sort(arrOfBill);
        if(arrOfBill.length>0) {
            int x = arrOfBill[arrOfBill.length-2];
            for(int i=0; i<hotel.length; i++) {
                if(hotel[i].getTotalBill() == x) {
                    return hotel[i];
                }
            }
        }
        return null;
    }
    
}



class Hotel {
    int hotelId;
    String hotelName;
    String dateOfBooking;
    int noOfRoomsBooked;
    String wifiFacility;
    double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}

/*
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May
Yes
 */