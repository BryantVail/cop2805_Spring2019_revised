package week14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseJdbcPractice {

	public static void main(String[] args) throws SQLException {
		// 
		Connection conection  = DriverManager.getConnection("jdbc:mysql://localhost/homework","root"/*user*/, "root"/*pass*/);

	}

}
