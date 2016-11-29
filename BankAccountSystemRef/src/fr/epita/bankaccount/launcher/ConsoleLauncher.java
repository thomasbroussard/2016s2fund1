/**
 * 
 */
package fr.epita.bankaccount.launcher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import fr.epita.bankaccount.datamodel.Customer;
import fr.epita.bankaccount.datamodel.SavingsAccount;

/**
 * @author tbrou
 *
 */
public class ConsoleLauncher {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		System.out.println("Hello, Welcome to the Bank account system application!");
		System.out.println("Please type a customer name : ");
		
		Scanner scanner = new Scanner(System.in);
		String customerName = scanner.nextLine();
		
		System.out.println("Please type the customer address : ");
		String customerAddress = scanner.nextLine();
		
		
		Customer customer = new Customer();
		customer.setName(customerName);
		customer.setAddress(customerAddress);
		
		
		System.out.println(customer);
		
		Customer customer2 = new Customer("Clement", "Maisons-Alfort");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("09/04/1986");
		customer2.setBirthDate(date);
	
		System.out.println(customer2);
		
		
		SavingsAccount savingsAccount = new SavingsAccount();
		
		System.out.println("Please fill the account interest rate");
		double interestRate = scanner.nextDouble();
		
		savingsAccount.setInterestRate(interestRate);
		
		
		System.out.println("account interestRate :" + savingsAccount.getInterestRate());
		
		scanner.close();
		
	}

}
