/**
 * 
 */
package fr.epita.iam.tests;

import java.sql.SQLException;

import fr.epita.iam.services.IdentityJDBCDAO;

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
		
		IdentityJDBCDAO dao = new IdentityJDBCDAO();
		System.out.println(dao.readAllIdentities());
		 

	}

}
