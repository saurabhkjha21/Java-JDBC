import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Mysql@123";
        String query = "UPDATE  EMPLOYEE SET job_title='Data Analyst'," +
                " salary=90000.0, name='Sohit' where id=4";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully!");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Establish Successfully!...");
            Statement stmt = con.createStatement();
            int rowsAffected=stmt.executeUpdate(query);

            if(rowsAffected>0){
                System.out.println("Updation Successful! "+rowsAffected+" row(s) affected.");
            }
            else{
                System.out.println("Updation Failed...!");
            }

            stmt.close();
            con.close();
            System.out.println("Connection Closed Successfully....!");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
