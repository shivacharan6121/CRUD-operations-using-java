import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
public class DisplayEmpData {
    public static void main(String[] args) {
 
        Connection conn1 = null;
    
 
        try {
  
            String url1 = "jdbc:mysql://localhost:3306/employee";
            String user = "root";
            String password = "123456";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected successfully");
            }
 
            
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}


