
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by rajit on 11/16/2016.
 */

public class Inputs {

    public static String tournamentType;
    public static int noOfTeams;
    private static String[] teams;

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel label0;
    private static JLabel label1;
    private static JLabel label2;
    private static JTextField text1;
    private static JTextField text2;
    private static JTextField text3;

    private static ArrayList<String> list;

    private static boolean status1 = false;
    private static boolean status2 = false;
    private static int count = 0;

    public Inputs(){


        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch(Exception e){
            System.out.println(e);
        }
        SetGUI();
    }

    public void SetGUI() {
        frame = new JFrame("Administrator's Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 600);
        panel = new JPanel();

        panel.setLayout(new GridLayout(10,10,10,10));
       // frame.pack();
        frame.add(panel);
     }
}
