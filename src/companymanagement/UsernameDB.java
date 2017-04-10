/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class UsernameDB {
        private static String url = "jdbc:mysql://127.0.0.1:3306/company";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String user = "root";
	private static String password = "";
    public UsernameDB()
	{
		
	}
    public boolean readUser(String username)
	{
		int id;
                String username1 = null,pass = null;
		boolean test=false;
		try
		{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement state = conn.prepareStatement("SELECT * FROM users WHERE username = ?");
			state.setString(1, username);
			ResultSet result = state.executeQuery();
			
			while (result.next())
			{
				 id = result.getInt("id");
				 username1 = result.getString("username");
                                  pass = result.getString("password");
				System.out.println("asd:"+username1+pass);
                                test=true;
			}
                        
			conn.close();
                        
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("asd:"+username1+pass);
                
                return test;
	}
}
