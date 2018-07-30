package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.sqlite.SQLiteException;

import database.SQLiteConnection;

public class LoginModel {
	Connection connection;
	
	public LoginModel() {
		try {
			this.connection= SQLiteConnection.getConnection();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		if(this.connection == null) {
			System.exit(1);
		}
	}
	public boolean isDatabaseConnected() {
		return this.connection !=null;
	}

	public boolean isLogin(
			String user,
			String password,
			String option
			)throws Exception{
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		String sql = "Select * from Login where username = ? adn password = ? and division = ? ";
		
		try {
			preparedStatement = this.connection.prepareStatement(sql);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, option);
			
			resultSet = preparedStatement.executeQuery();
			
			boolean bool;
			
			if(resultSet.next()) {
				return true;
			}
			return false;
		}
		catch(SQLException ex) {
			return false;
		}
		finally {
			{
				preparedStatement.close();
			}
		}
		
	}
}
