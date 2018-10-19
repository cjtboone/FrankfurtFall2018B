/**
 * Tour class containing tour id and route information. 
 * 
 * @Author Paul Traxler
 * @Version 1.0
 * @Date 10/18/18
 */

package main.java.memoranda;

public class Tour {
	// Variables
	private int id;
	private Route route; 
	
	/**
	 * Constructor for Tour class 
	 * @param id - The id to assign the tour
	 * @param route - The route the tour will take
	 */
	public Tour(int id, Route route){
		this.id = id;
		this.route = route;
	}
	
	/**
	 * Gets the ID for a tour
	 * @return Tour ID
	 */
	public int getID(){
		return id;
	}
	
	/**
	 * Gets the route a tour will take
	 * @return Tour Route
	 */
	public Route getRoute(){
		return route;
	}
	
	/**
	 * Sets the route a tour will take
	 * @param route - New route to assign to tour
	 */
	public void setRoute(Route route){
		this.route = route;
	}
}

