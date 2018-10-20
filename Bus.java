package main.java.memoranda;

/**
 * <h1>Bus Class</h1>
 * The Bus program initializes bus driver objects with the following data fields:
 * 	- id
 * 	- seats
 * <p>
 * @author	Cristi DeLeo
 * @version 1.0
 * @since 2018-10-19
 */
public class Bus 
{
	private int id;		// Bus ID number
	private int seats;	// Number of total passenger seats on the bus
	
	/**
	 * Default constructor for Bus class.
	 */
	public Bus()
	{
		id = 0;		// Initializes id to 0
		seats = 0;	// Initializes number of seats to 0
	}
	
	/**
	 * Constructor with parameters for Bus class.
	 * @param busID
	 * @param busSeats
	 */
	public Bus(int busID, int busSeats)
	{
		id = busID;			// Initializes id to busID parameter
		seats = busSeats;	// Initializes number of seats to busSeats parameter
	}
	
	/**
	 * This method initializes the bus ID to that of the 'busID' parameter.
	 * @param busID	The first and only parameter of the setBusID method.
	 */
	public void setBusID(int busID)
	{
		id = busID;
	}
	
	/**
	 * This method initializes the number of passenger seats to that of the 'busSeats' parameter.
	 * @param busSeats	The first and only parameter of the setBusSeats method.
	 */
	public void setBusSeats(int busSeats)
	{
		seats = busSeats;
	}
	
	/**
	 * This method returns the bus ID.
	 * @return	Returns the bus ID.
	 */
	public int getBusID()
	{
		return id;
	}
	
	/**
	 * This method returns the number of passenger seats on the bus.
	 * @return	Returns the number of passenger seats on the bus.
	 */
	public int getBusSeats()
	{
		return seats;
	}
}
