/* OUTPUT
 * 1 Priya vikhroli 24
2 prachi kanjurmarg 18
3 sanjani bhandup 20
4 shaily thane 15
5 anamika kurla 16
6 Priya suryanagar 21
7 sonali aroli 21
 * 
*/


package anudip;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCConnector {
    public static void main(String[] args) {

        try {
            // 1. Register Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
           Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root@1234");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery("select * from student");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3) + " " +
                        rs.getString(4));
                 
            }

            // 5. Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
			
		