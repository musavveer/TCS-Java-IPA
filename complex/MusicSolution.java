package complex;

import java.util.Arrays;
import java.util.Scanner;

public class MusicSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Music[] musics = new Music[4];

        for(int i=0; i<musics.length; i++) {
            int playListNo = sc.nextInt(); sc.nextLine();
            String type = sc.nextLine();
            int count = sc.nextInt(); sc.nextLine();
            double duration = sc.nextDouble(); sc.nextLine();

            musics[i] = new Music(playListNo, type, count, duration);
        }
        int srcCount = sc.nextInt(); sc.nextLine();
        double srcDuration = sc.nextDouble(); sc.nextLine();
        sc.close();

        int avg = findAvgOfCount(musics, srcCount);
        if(avg == 0) {
            System.out.println("No playlist found");
        }
        else {
            System.out.println(avg);
        }

        String[] sort = sortTypeByDuration(musics, srcDuration);
        if(sort==null) {
            System.out.println("No playlist found with mentioned attribute");
        }
        else {
            for(int i=0; i<sort.length; i++) {
                System.out.println(sort[i]);
            }
        }

    }
    /************************ */
    public static int findAvgOfCount(Music[] musics, int srcCount) {
        int k = 0;
        int sum = 0;
        for(int i=0; i<musics.length; i++) {
            if(musics[i].getCount()>srcCount) {
                sum = sum+musics[i].getCount();
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

    public static String[] sortTypeByDuration(Music[] musics, double srcDuration) {
        String[] m = new String[0];
        double[] refined = new double[0];
        for(int i=0; i<musics.length; i++) {
            if(musics[i].getDuration()>srcDuration) {
                refined = Arrays.copyOf(refined, refined.length+1);
                refined[refined.length-1] = musics[i].getDuration();
                Arrays.sort(refined);
            }
        }
        for(int i=0; i<refined.length; i++) {
            for(int j=0; j<musics.length; j++) {
                if(musics[j].getDuration() == refined[i]) {
                    m = Arrays.copyOf(m, m.length+1);
                    m[m.length-1] = musics[j].getType();
                }
            }
        }

        if(m.length > 0) {
            return m;
        }
        else {
            return null;
        }
        
    }
}

class Music {
    int playListNo;
    String type;
    int count;
    double duration;

    public Music(int playListNo, String type, int count, double duration) {
        this.playListNo = playListNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }

    public int getPlayListNo() {
        return playListNo;
    }
    
    public void setPlayListNo(int playListNo) {
        this.playListNo = playListNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

/*
111
WorkOut
10
15.2
321
Dance Party
20
55.500
721
Childhood Jams
6
50.60
521
Chill
30
78.89
15
20


output:
25
Childhood Jams
Dance Party
Chill

 */
