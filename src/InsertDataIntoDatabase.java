import java.sql.*;
public class InsertDataIntoDatabase {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "DB_PWD";
        String query =  "insert into employee(id, name, job_title, salary) values(6, 'Mahesh', 'Java Developer', 89000.0)";

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
                System.out.println("Insert Successful! "+rowsAffected+" row(s) affected.");
            }
            else{
                System.out.println("Insertion Failed...!");
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
