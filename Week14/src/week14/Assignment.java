package week14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 
		
		//load driver
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection init
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/salesordersexample", "root", "root");
		
		//statement
		Statement statement = connection.createStatement();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID to look up record");
		
		int vendorId = input.nextInt();
		
		//query with result set
			//must be on the same line as "executeQuery"
		ResultSet resultSet = statement.executeQuery("select VendorId, VendName, VendCity, VendState from Vendors where VendorId = "+ vendorId
		);
		
		//print values
		while(resultSet.next()) {
			//use names of the columns instead of the index; maintainable
			int 	id =   resultSet.getInt("VendorId");
			String 	name = resultSet.getString("VendName");
			String 	city = resultSet.getString("VendCity");
			String 	state = resultSet.getString("VendCity");
			
			
			System.out.println("Vendor: "+ name+ " in "+ city + ", "+state);
		}
		
		connection.close();
		
	}

}
