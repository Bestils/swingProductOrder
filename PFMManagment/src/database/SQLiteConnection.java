package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLiteConnection {
static Connection connection = null;
Statement Statement = null;

public SQLiteConnection(){
	try {
		Class.forName("org.sqlite.JDBC");
		connection = DriverManager.getConnection("jdbc:sqlite:SQLLiteDatabase.db");
		System.out.println("connection with jdbc is ok");
		
		
	}
	catch(Exception e){
		System.out.println("Error"+ e.getMessage());
	}
}

	public static Connection getConnection() throws SQLException{
	try {
		Class.forName("org.sqllite.JDBC");
		return connection;
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return null;
}

public Statement getStatus() {
	return Statement;
}


	public void closeConnection(){
		try {
			connection.close();
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}}
	
		public void executeQuery(String query) {
			try {
				this.Statement=connection.createStatement();
				Statement.executeQuery(query);
			}
			catch(Exception e ) {
				System.out.println(e.getMessage());
			}
		}
	
}
