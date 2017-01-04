/**
 * 
 */
package fr.epita.iam.tests;

import java.io.FileNotFoundException;
import java.util.List;

import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.services.FileIdentityDAO;

/**
 * @author tbrou
 *
 */
public class TestFiles {

	public static void main(String[] args) throws FileNotFoundException {

		FileIdentityDAO identityDAO = new FileIdentityDAO("tests.txt");
		identityDAO.write(new Identity("123", "Thomas Broussard", "thomas.broussard@gmail.com"));
		identityDAO.write(new Identity("456", "Clément Serrano", "clement.serrano@natsystem.fr"));

		
		List<Identity> list = identityDAO.readAllIdentities();
		System.out.println(list);

	}

}
