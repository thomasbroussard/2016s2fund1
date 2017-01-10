/**
 * 
 */
package fr.epita.iam.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.epita.iam.datamodel.Identity;

/**
 * @author tbrou
 *
 */
public class TestJDBC {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		//The goal is to connect to this url : jdbc:derby://localhost:1527/IAM;create=true
		
		Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/IAM;create=true", "tbr", "tbr");
		System.out.println(connection.getSchema());
		
		PreparedStatement statement = connection.prepareStatement("select * from IDENTITIES");
		ResultSet rs = statement.executeQuery();
		
		List<Identity> identities = new  ArrayList<>();
		while (rs.next()){
			int uid = rs.getInt("IDENTITY_ID");
			String displayName = rs.getString("IDENTITY_DISPLAYNAME");
			String email = rs.getString("IDENTITY_EMAIL");
			Identity identity = new Identity(String.valueOf(uid), displayName, email);
			identities.add(identity);
		}
		System.out.println(identities);
		

	}

}
