/**
 * 
 */
package fr.epita.iam.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.services.FileIdentityWriter;

/**
 * @author tbrou
 *
 */
public class TestFiles {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileIdentityWriter identityWriter = new FileIdentityWriter("tests.txt");
		identityWriter.write(new Identity("123", "Thomas Broussard", "thomas.broussard@gmail.com"));

		Scanner scanner = new Scanner(new File("tests.txt"));
		//TODO repeat to have the whole list of identities
		//delimiter
		scanner.nextLine();
		String displayName = scanner.nextLine();
		String email = scanner.nextLine();
		String uid = scanner.nextLine();
		//delimiter
		scanner.nextLine();
		Identity readIdentity = new Identity(uid, displayName, email);
		System.out.println(readIdentity);
		
		
	}


}
