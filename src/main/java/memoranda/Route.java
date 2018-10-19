/**
 * Route class holding all information on routes. 
 * 
 * @Author Paul Traxler
 * @Version 1.0
 * @Date 10/18/18
 */
package main.java.memoranda;

public class Route {
	private String name;
	private int id;
	private int length;
	private int duration;
	private int[][] points;
	
	/**
	 * Constructor for Route class, assigns all variables
	 * @param name - Route name
	 * @param id - Route ID
	 * @param length - Route length
	 * @param duration - Route duration
	 * @param points - Route points (latitude and longitude)
	 */
	public Route(String name, int id, int length, int duration, int[][] points){
		this.name = name;
		this.id = id;
		this.length = length;
		this.duration = duration;
		this.points = points;
	}
	
	/**
	 * Gets the name of the route
	 * @return Route name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Gets the ID of the route
	 * @return Route ID
	 */
	public int getID(){
		return id;
	}
	
	/**
	 * Gets the length of the route
	 * @return Route length
	 */
	public int getLength(){
		return length;
	}
	
	/**
	 * Gets the duration of the route
	 * @return Route duration
	 */
	public int duration(){
		return duration;
	}
	
	public int[][] points(){
		return points;
	}
}
