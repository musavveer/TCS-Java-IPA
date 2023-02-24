package complex;

import java.util.Scanner;

public class CarSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] car = new AutonomousCar[4];

        for(int i=0; i<car.length; i++) {
            int carId = sc.nextInt(); sc.nextLine();
            String brand = sc.nextLine();
            int noOfTestsConducted = sc.nextInt(); sc.nextLine();
            int noOfTestsPassed = sc.nextInt(); sc.nextLine();
            String environment = sc.nextLine();
            

            car[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }
        String env = sc.nextLine();
        String brand = sc.nextLine();
        sc.close();

        int testPassed = findTestPassedByEnv(car, env);
        if(testPassed == 0) {
            System.out.println("There are not tests passed for particular env");
        }
        else {
            System.out.println(testPassed);
        }

        AutonomousCar updatedCar = updateCarGrade(brand, car);
        if(updatedCar == null) {
            System.out.println("No car available");
        }
        else {
            System.out.println(updatedCar.getBrand() + "::" + updatedCar.getGrade());
        }
    }
    /************** */
    public static int findTestPassedByEnv(AutonomousCar[] car, String env) {

        int sum=0;
        for(int i=0; i<car.length; i++) {
            if(env.equalsIgnoreCase(car[i].getEnvironment())) {
                sum = sum+car[i].getNoOfTestsPassed();
            }
        }
        return sum;
    }

    public static AutonomousCar updateCarGrade(String brand, AutonomousCar[] car) {

        int rating;
        for(int i=0; i<car.length; i++) {
            if(car[i].getBrand().equalsIgnoreCase(brand)) {
                rating = (car[i].getNoOfTestsPassed()*100)/(car[i].getNoOfTestsConducted());
                if(rating>=80) {
                    car[i].setGrade("A1");
                }
                else {
                    car[i].setGrade("B2");
                }
                return car[i];
            }
        }
        return null;
    }
}

class AutonomousCar {
    int carId;
    String brand;
    int noOfTestsConducted;
    int noOfTestsPassed;
    String environment;
    String grade;
    

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }

    public void setNoOfTestsConducted(int noOfTestsConducted) {
        this.noOfTestsConducted = noOfTestsConducted;
    }

    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }

    public void setNoOfTestsPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public   String getGrade() {
        return grade;
    }
}
