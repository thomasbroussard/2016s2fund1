/**
 * 
 */
package fr.epita.iam.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import fr.epita.iam.datamodel.Identity;

/**
 * @author tbrou
 *
 */
public class TestFiles {

	public static void main(String[] args) {
		
		

		File file = new File("/tests/subTest/test.txt");
		PrintWriter writer = initWriter(file);
		Identity identity = new Identity("123", "Thomas Broussard", "thomas.broussard@gmail.com");
		
		writer.println("---------IDENTITY:BEGIN-------");
		writer.println(identity.getDisplayName());
		writer.println(identity.getEmail());
		writer.println(identity.getUid());
		writer.println("---------IDENTITY:END---------");
		
		
		writer.close();
	}

	/**
	 * @param file
	 */
	private static PrintWriter initWriter(File file) {
		if (!file.exists()) {
			try {
				// "risky" operations
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException e) {
				// do something to handle the exceptional case
				e.printStackTrace();
			} finally {
				// always executed
			}
		}
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(file);
			writer.println("First Writing test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return writer;
	}

}
