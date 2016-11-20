
import java.util.Timer;
import java.util.TimerTask;

public class Cricket implements Runnable{
    public static int noOfTeams = 0;
    public static String TType = "";
    public static String[] teams;


    public Cricket() {

    }

    public static void main(String[] args) {

        Inputs tournament1 = new Inputs();
 //       noOfTeams = tournament1.NoOfTeams();
        System.out.println("no of teams"+noOfTeams);

        teams = new String[noOfTeams];
       // teams = tournament1.GetTeams();

   //     TType = tournament1.SetTournamentType();


        System.out.println(TType);



    }

    public static void TournamentType(String Type){

        System.out.println(Type);
        if( Type.equals("L")){
            System.out.println(Type.equals("L"));
            League league = new League();
        }
        else if ( Type.equals("K") ){
            System.out.println(Type.equals("K"));
            KnockOut knockOut = new KnockOut(teams,noOfTeams);
        }
        else{
            System.out.println("Wrong Input");
        }
    }


    @Override
    public void run() {

    }
}
