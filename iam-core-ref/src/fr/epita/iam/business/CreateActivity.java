/**
 * 
 */
package fr.epita.iam.business;

import java.util.Scanner;

import fr.epita.iam.datamodel.Identity;
import fr.epita.iam.services.FileIdentityWriter;

/**
 * @author tbrou
 *
 */
public class CreateActivity {
	
	
	public static void execute(Scanner scanner){
		System.out.println("Identity Creation");
		System.out.println("please input the displayName");
		String displayName = scanner.nextLine();
		System.out.println("please input the email address");
		String email = scanner.nextLine();
		Identity identity = new Identity("",displayName, email);
		
	
		//persist the identity somewhere
		System.out.println("this is the identity you created");
		FileIdentityWriter identityWriter = new FileIdentityWriter("tests.txt");
		identityWriter.write(identity);

		
		System.out.println("creation Done");
		
	}
	

}
