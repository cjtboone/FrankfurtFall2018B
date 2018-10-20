/**
 * <h1>Driver Class</h1>
 * The Driver program initializes bus driver objects with the following data fields:
 * 	- id
 * 	- firstName
 * 	- lastName
 * 	- name
 * 	- phone
 * <p>
 * @author	Cristi DeLeo
 * @version 2.0
 * @since 2018-10-18
 */

package main.java.memoranda;

import java.lang.*;

public class Driver 
{
	private int id;				// 5-digit bus driver ID
	private String firstName;	// Bus driver's first name
	private String lastName;	// Bus driver's last name
	private String name;		// Bus driver's first initial and last name
	private int phone;			// 10-digit bus driver phone number
	
	/**
	 * Constructor for Driver Class
	 */
	public Driver()
	{
		id = 00000;				// Initializes ID to 00000
		firstName = "New";		// Initializes firstName to "New"
		lastName = "Driver";	// Initializes lastName to "Driver"
		name = getDriverName();		// Initializes name to "N. Driver" by calling setName method
		phone = 0000000000;		// Initializes phone to 0000000000
	}
	
	/**
	 * Constructor for Driver Class
	 * @param driverID
	 * @param driverFirstName
	 * @param driverLastName
	 * @param driverPhone
	 */
	public Driver(int driverID, String driverFirstName, String driverLastName, int driverPhone)
	{
		id = driverID;
		firstName = driverFirstName;
		lastName = driverLastName;
		setDriverName(firstName, lastName);
		name = getDriverName();
		phone = driverPhone;
	}
	
	/**
	 * This method is used to initialize the value of 'id' to that of the parameter 'driverID.'
	 * @param driverID	The only parameter of setDriverID method.
	 */
	public void setDriverID(int driverID)
	{
		// if-else determines if ID is a valid int within the range of 00001-99999
		if (driverID > 00000 && driverID < 100000)
		{
			id = driverID;
		}
		
		else		// Executes if driverID is out of range 
		{
			return;	// Returns without initializing the value of 'id' 
		}
	}
	
	/**
	 * This method is used to initialize the value of 'firstName' and 'lastName' to that
	 * of the 'driverFirstName' and 'driverLastName' parameters.
	 * @param driverFirstName	This is the first parameter of the setDriverName method.
	 * @param driverLastName	This is the second parameter of the setDriverName method.
	 */
	public void setDriverName(String driverFirstName, String driverLastName)
	{
		// Creates a string that consists of the driver's first initial and entire last name in
		// the form of N. Driver.
		String result = driverFirstName.charAt(0) + ". " + driverLastName;
		
		// Initializes 'name' to reflect proper format.
		name = result;
	}
	
	/**
	 * This method is used to initialize the value of 'phone' to that of the 'driverPhone' parameter.
	 * @param driverPhone	This is the first and only parameter of the setDriverPhone method.
	 */
	public void setDriverPhone(int driverPhone)
	{
		phone = driverPhone;
	}
	
	/**
	 * This method returns the bus driver's id.
	 * @return	The bus driver's id.
	 */
	public int getDriverID()
	{
		return id;
	}
	
	/**
	 * This method returns the bus driver's formatted name.
	 * @return	The bus driver's formatted name.
	 */
	public String getDriverName()
	{
		return name;
	}
	
	/**
	 * This method returns the bus driver's phone number.
	 * @return	The bus driver's phone number.
	 */
	public int getDriverPhone()
	{
		return phone;
	}
}
