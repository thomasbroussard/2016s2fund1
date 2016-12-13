/**
 * 
 */
package fr.natsystem.iam.business;

import java.util.Scanner;

import fr.natsystem.iam.datamodel.Identity;

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
		System.out.println(identity);
		
		System.out.println("creation Done");
		
	}
	

}
