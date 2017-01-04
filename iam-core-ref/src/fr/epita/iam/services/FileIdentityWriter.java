/**
 * 
 */
package fr.epita.iam.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import fr.epita.iam.datamodel.Identity;

/**
 * @author tbrou
 *
 */
public class FileIdentityWriter {

	private PrintWriter writer;

	/**
	 * 
	 */

	public FileIdentityWriter(String fileName) {
		// TODO remove that hardcoded filename
		this.writer = initWriter(new File(fileName));
	}

	public void write(Identity identity) {
		writer.println("---------IDENTITY:BEGIN-------");
		writer.println(identity.getDisplayName());
		writer.println(identity.getEmail());
		writer.println(identity.getUid());
		writer.println("---------IDENTITY:END---------");
		writer.flush();

	}

	/**
	 * @param file
	 */
	private static PrintWriter initWriter(File file) {
		if (!file.exists()) {
			try {
				// "risky" operations
				File parentFile = file.getParentFile();
				if (parentFile != null) {
					parentFile.mkdirs();
				}
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return writer;
	}

}
