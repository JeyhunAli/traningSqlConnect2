package runConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlRun {

	public static void main(String[] args) {
		
		
		String mydriver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		String url = "jdbc:sqlserver://localhost:1433";
		
		String username = "sa";
		String password = "YourPassword1235758";
		Connection connect;
		Statement stt;
		ResultSet rs;
		

		try {
		    connect = DriverManager.getConnection(url, username, password);
		    stt = connect.createStatement();
			System.out.println("Connected to the database");
			
//------------------------------------------------------------------------------------------------------------			
			
//			String sqlQuery1 = "insert into employee(emp_id, first_name, last_name, adress, city)"
//					+ " values(03, 'emiliya', 'aliyeva', 'shoreparkway', 'brooklyn')";
//			rs = stt.executeQuery(sqlQuery1);
			
			
//------------------------------------------------------------------------------------------------------------			
		
			//String sqlQuery2 = "SELECT * FROM employee";
			String sqlQuery3 = "SELECT * FROM employee where emp_id = 1";
			rs = stt.executeQuery(sqlQuery3);
			
			int count = 0;
			while (rs.next()) {
				String firstname = rs.getString("first_name");
				String lastname = rs.getString("last_name");
				count++;
				System.out.println("employee "+ count + " " + firstname + " " +lastname);
				
			}
			
		} catch (SQLException e) {
System.out.println("ooopppss errrooorrr ");

			
			e.printStackTrace();
		}

	}

}




//  npm install -g sql-cli