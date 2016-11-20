import java.sql.*;

public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConnect (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            st = con.createStatement();
        }

        catch(Exception ex){
            System.out.println("Error : "+ ex);
        }
    }

    public void insertData(){
        try{
            String name = "rajitha";
            String age = "24";
            String insert1 = "INSERT INTO persons VALUES (0,'"+name+ "', "+ age + ")";
            st.executeUpdate(insert1);
        }
        catch(Exception exc){
            System.out.println("error : "+ exc);
        }
    }

    public void getData(){
        try{
            String query = "Select * from persons";
            rs = st.executeQuery(query);
            System.out.println("Records from database");
            while(rs.next()){
                String name = rs.getString("name");
                String age = rs.getString("age");
                System.out.println("Name : "+ name +"  "+"Age : "+age);
            }
        }
        catch(Exception err){
            System.out.println(err);
        }

    }
}
