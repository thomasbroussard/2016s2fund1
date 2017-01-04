/**
 * 
 */
package fr.epita.iam.tests;

import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.services.FileIdentityWriter;

/**
 * @author tbrou
 *
 */
public class TestFiles {

	public static void main(String[] args) {
		
		FileIdentityWriter identityWriter = new FileIdentityWriter("tests.txt");
		identityWriter.write(new Identity("123", "Thomas Broussard", "thomas.broussard@gmail.com"));

		
	}


}
