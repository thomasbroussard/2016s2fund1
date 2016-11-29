/**
 * 
 */
package fr.epita.bankaccount.datamodel;

import java.util.Date;

/**
 * @author tbrou
 *
 */
public class Customer {

	private String name;
	private String address;
	private Date birthDate;

	/**
	 * 
	 */
	public Customer() {
	}

	/**
	 * @param name
	 * @param address
	 */
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		if (address != null) {
			this.address = address;
		}
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{'name':'" + name + "', 'address':'" + address + "', 'birthDate':'" + birthDate + "'}";
	}
	
	
	

}
