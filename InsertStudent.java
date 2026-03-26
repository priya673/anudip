/*
 * OUTPUT
 * Record Inserted Successfully
*/

package anudip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {

	public static void main(String[] args) {
		 try {

	            // 1. Load Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // 2. Create Connection
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/college", "root", "root@1234");

	            // 3. SQL Insert Query
	            String query = "INSERT INTO Student(id,name,address,age,phone_no,email) VALUES(?,?,?,?,?,?)";

	            // 4. Create PreparedStatement
	            PreparedStatement ps = con.prepareStatement(query);

	            // 5. Set Values
	            ps.setInt(1, 9);
	            ps.setString(2, "priyanka");
	            ps.setString(3, "aroli");
	            ps.setInt(4, 21);
	            ps.setString(5, "797789489");
	            ps.setString(6, "priyanka@gmail.com");
	            
	          
	            // 6. Execute Query
	            int i = ps.executeUpdate();

	            if (i > 0) {
	                System.out.println("Record Inserted Successfully");
	            } else {
	                System.out.println("Record Not Inserted");
	            }

	            // 7. Close Connection
	            con.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }

	}

}
