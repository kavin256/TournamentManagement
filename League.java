package GUI;

import java.util.*;
import java.lang.*;

public class League{

    int Points_Win = 2;
    int Points_Lose = 0;
    int Points_Draw = 1;


    public League(int numberofTeams, String [] teamsNames) {
        System.out.println("teams are : "+ teamsNames[1]);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //number of teams participating
        int n = sc.nextInt();
        String tms = sc.nextLine();

        new League(3,["as","fdss","asd"]);

    }
}
