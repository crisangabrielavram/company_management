/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiunefirma;

import java.sql.*;
/**
 *
 * @author User
 */
public class UserDB {
    
        private static String url = "jdbc:mysql://127.0.0.1:3306/company";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String user = "root";
	private static String password = "";
    public UserDB()
	{
		
	}
    public User readUser(String username)
	{
		User u = null;
		
		try
		{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement state = conn.prepareStatement("SELECT * FROM user_details WHERE username = ?");
			state.setString(1, username);
			ResultSet result = state.executeQuery();
			
			while (result.next())
			{
				int id = result.getInt("id");
				String name = result.getString("name");
				String surname = result.getString("surname");
				String username1 = result.getString("username");
				String empl_code = result.getString("employee_code");
				String  position = result.getString("position");
				
				
				
				u = new User(id,name,surname,username1,empl_code,position);
			}
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return u;
                
	}
    
}
