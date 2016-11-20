
/**
 * Created by rajit on 11/16/2016.
 */


public class KnockOut {
    private static int noOfTeams;
    private static String[] teams = new String[noOfTeams];

    public KnockOut(String Teams[],int NOofTeams) {
        noOfTeams = NOofTeams;
        teams = Teams;
        DisplayTeams();
    }

    public void DisplayTeams(){
        for( int i = 0; i < noOfTeams; i++ ){
            System.out.println("Team " +(i+1)+" : "+ teams[i]);
        }
    }

    public static void ArrangTeams(){
        if( noOfTeams/2 == 0 ) Method1();
        else Method2();
    }


    public static void Method1(){


    }



    public static void Method2(){}
}
