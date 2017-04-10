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
public class PrivDB {
    private static String url = "jdbc:mysql://127.0.0.1:3306/company";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String user = "root";
	private static String password = "";
    public PrivDB(){}
    
     public Priv readUser(String username)
	{
		Priv p = null;
		
		try
		{
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement state = conn.prepareStatement("SELECT privs.acces FROM `users` \n" +
"JOIN user_details ON users.username=user_details.username \n" +
"JOIN user_role ON user_details.position=user_role.position \n" +
"JOIN role ON user_role.user=role.id \n" +
"JOIN role_priv ON role.role=role_priv.role\n" +
"JOIN privs ON role_priv.privs=privs.priv WHERE users.username = ?");
			state.setString(1, username);
			ResultSet result = state.executeQuery();
			
			while (result.next())
			{
				
				String  access = result.getString("acces");
				
				
				
				p = new Priv(access);
			}
			conn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return p;
                
	}
    
    
}
