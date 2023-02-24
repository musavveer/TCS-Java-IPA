package complex;

import java.util.Scanner;
import java.util.Arrays;

public class PlayerSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] player = new Player[4];
        
        for(int i=0; i<player.length; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            int iccRank = sc.nextInt();
            int matchesPlayed = sc.nextInt();
            int runsScored = sc.nextInt();

            player[i] = new Player(id, name, iccRank, matchesPlayed, runsScored);
        }
        int target = sc.nextInt(); sc.nextLine();

        double[] averageRun = findAverageOfRuns(player, target);
        for(int i=0; i<averageRun.length; i++) {
            if(averageRun[i] >= 80 && averageRun[i] <= 100) {
                System.out.println("Grade A");
            }
            else if(averageRun[i] >= 50 && averageRun[i] <= 79) {
                System.out.println("Grade B");
            } 
            else {
                System.out.println("Grade C");
            }
        }
    }
    /******** */

    public static double[] findAverageOfRuns(Player[] player, int target) {
        double averageRun[] = new double[0];
        for(int i=0; i<player.length; i++) {
            if(player[i].matchesPlayed >= target) {
                averageRun = Arrays.copyOf(averageRun, averageRun.length+1);
                averageRun[averageRun.length-1] = (double)(player[i].runsScored /player[i].matchesPlayed);
            }
        }
        return averageRun;
    }
}

class Player {
    int id;
    String name;
    int iccRank;
    int matchesPlayed;
    int runsScored;

    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this. runsScored = runsScored;
    }
}
