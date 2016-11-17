//pacpackage GUI;

import java.util.*;
import java.lang.*;

public class League{

    int Points_Win = 2, Points_Lose = 0, Points_Draw = 1;
    String [][] teamUp;

    public League(int noTeams, String [] teams) {
        System.out.println("Teams are : "+ Arrays.deepToString(teams));

        //for Even number of Teams
        if (noTeams%2==0) {
            teamUp = new String [noTeams/2][2];
            for (int i = 0; i < (noTeams/2); i++) {
                teamUp[i][0] = teams[i];
                teamUp[i][1] = teams[noTeams-i-1];
            }
        }

        //for Odd number of Teams
        else{
            teamUp = new String [(noTeams+1)/2][2];
            for (int i = 0; i < (noTeams/2); i++) {
                teamUp[i][0] = teams[i];
                teamUp[i][1] = teams[noTeams-i-1];
            }
            teamUp[(noTeams-1)/2][0] = teams[(noTeams-1)/2];
            teamUp[(noTeams-1)/2][1] = teams[(noTeams-1)/2];
        }
        System.out.println("Teams were paired as : "+ Arrays.deepToString(teamUp));

    }
    //Test Case Running (Temporary)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=7;
        String [] SArray = {"fdss", "asd", "gfcv", "gfhgvhb", "fdxh", "suck", "dick"};
        new League(n,SArray);

    }
}
