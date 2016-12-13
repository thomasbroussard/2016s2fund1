/**
 * 
 */
package fr.epita.iam.tests;

import java.io.File;
import java.io.IOException;

/**
 * @author tbrou
 *
 */
public class TestFiles {
	
	
	
	public static void main(String[] args) {
		File file = new File("test.txt");
		if (!file.exists()){
			try {
				//"risky" operations
				file.createNewFile();
			} catch (IOException e) {
				// do something to handle the exceptional case
				e.printStackTrace();
			}finally{
				//always executed
			}
		}
	}
	

}