package complex;

import java.util.Arrays;
import java.util.Scanner;

public class AssSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Associate[] associate = new Associate[5];

        for(int i=0; i<associate.length; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String technology = sc.nextLine();
            int experienceInYears = sc.nextInt();
            sc.nextLine();

            associate[i] = new Associate(id, name, technology, experienceInYears);
        }
        String searchTechnology = sc.nextLine();

        Associate[] result = associatesForGivenTechnology(associate, searchTechnology);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i].getId());
        }
        
        
    }
    /******************** */
    public static Associate[] associatesForGivenTechnology(Associate[] associate, String searchTechnology) {
        
        Associate[] refined = new Associate[0];
        for(int i=0; i<associate.length; i++) {
            if(associate[i].getTechnology().equals(searchTechnology) && associate[i].getExperienceInYears()%5 == 0) {
                refined = Arrays.copyOf(refined, refined.length+1);
                refined[refined.length-1] = associate[i];
            }
        }
        
        return refined;
    }
}

class Associate {
    int id;
    String name;
    String technology;
    int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
