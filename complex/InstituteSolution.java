package complex;

import java.util.Scanner;
public class InstituteSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution[] instArray = new Institution[4];
        for(int i=0;i<4;i++){
            int institutionId = sc.nextInt();
            sc.nextLine();
            String institutionName = sc.nextLine();
            String noOfStudentsPlaced = sc.nextLine();
            int noOfStudentsCleared = sc.nextInt();
            sc.nextLine();
            String location= sc.nextLine();
            instArray[i] = new Institution(institutionId,institutionName,noOfStudentsPlaced,noOfStudentsCleared,location);
        }
        String location = sc.nextLine();
        String institutionName = sc.nextLine();
        sc.close();
        int noOfClearance = findNumClearancedByLoc(instArray, location);
        if(noOfClearance!=0) System.out.println(noOfClearance);
        else System.out.println("There are no cleared students in this particular location");
        
        Institution updated = updateInstitutionGrade(instArray, institutionName);
        if(updated!=null) System.out.println(updated.getInstitutionName()+"::"+updated.getGrade());
        else System.out.println("No Institute is available with the specified name");
    }
    
    public static int findNumClearancedByLoc(Institution[] instArray, String location) 
    {
        int noOfClearance = 0;
        for(int i=0;i<instArray.length;i++){
            if(instArray[i].getLocation().equalsIgnoreCase(location)){
                noOfClearance += instArray[i].getNoOfStudentsCleared();
            }
        }
        return noOfClearance;
    }

    public static Institution updateInstitutionGrade(Institution[] instArray, String instName) 
    {
        for(int i=0;i<instArray.length;i++){
            if(instArray[i].getInstitutionName().equalsIgnoreCase(instName)){
                int rating = ((Integer.parseInt(instArray[i].getNoOfStudentsPlaced())*100)/instArray[i].getNoOfStudentsCleared());
                if(rating>=80) instArray[i].setGrade("A");
                else instArray[i].setGrade("B");
                return instArray[i];
            }
        }
        return null;
  }
}

class Institution {
    int institutionId;
    String institutionName;
    String noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;

    Institution(int institutionId,String institutionName,String noOfStudentsPlaced,int noOfStudentsCleared,String location){
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    int getInstitutionId(){
        return institutionId;
    }

    String getInstitutionName(){
        return institutionName;
    }

    String getNoOfStudentsPlaced(){
        return noOfStudentsPlaced;
    }

    int getNoOfStudentsCleared(){
        return noOfStudentsCleared;
    }

    String getLocation(){
        return location;
    }

    String getGrade(){
        return grade;
    }


    void setInstitutionId(int institutionId){
        this.institutionId = institutionId;
    }

    void setInstitutionName(String institutionName){
        this.institutionName = institutionName;
    }

    void setNoOfStudentsPlaced(String noOfStudentsPlaced){
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    void setNoOfStudentsCleared(int noOfStudentsCleared){
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    void setLocation(String location){
        this.location = location;
    }

    void setGrade(String grade){
        this.grade = grade;
    }
}

/*
i/p:
111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

o/p:
22000
Karunya::A

*/

/*
Problem Statement
Create a class Institution with below attributes:

institutionId - int institutionName - String noOfStudentsPlaced - String noOfStudentsCleared- int location - String grade - String

Write getters, setters for the above attributes. Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method. Implement two static methods - findNumClearancedByLoc and updateInstitutionGrade in Solution class.

findNumClearancedByLoc method: This method will take two input parameters - array of Institution objects and string parameter location. The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as parameter. If no institution with the given location is present in the array of institution objects, then the method should return 0.

updateInstitutionGrade method: This method will take a String parameter institutionName, along with the array of Institution objects. The method will return the institution object, if the input String parameter matches with the institutionName attribute of the institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return null.

The grade attribute should be calculated as follows: rating=(noOfStudentsPlaced * 100)/noOfStudentsCleared If the rating &gt= 80 , then grade should be 'A'. Else, then grade should be 'B'

Note: No institution object would have the same value for institutionName attribute. All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value. All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is greater than 0, or it should print "There are no cleared students in this particular location".

For updateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the institution name and A is the grade. If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes in the above mentioned attribute sequence (except grade attribute). Next, read the value for location and institutionName.

*/