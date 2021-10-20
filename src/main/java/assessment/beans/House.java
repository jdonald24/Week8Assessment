package assessment.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Entity
public class House {
	@Id
	@GeneratedValue
	private long id;
	private double cost;
	private String address;
	private int squareFeet;
	private int numOfRooms;
	/**
	 * 
	 */
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param cost
	 * @param address
	 * @param squareFeet
	 * @param numOfRooms
	 */
	public House(double cost, String address, int squareFeet, int numOfRooms) {
		super();
		this.cost = cost;
		this.address = address;
		this.squareFeet = squareFeet;
		this.numOfRooms = numOfRooms;
	}
	/**
	 * @param cost
	 * @param address
	 */
	public House(double cost, String address) {
		super();
		this.cost = cost;
		this.address = address;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the squareFeet
	 */
	public int getSquareFeet() {
		return squareFeet;
	}
	/**
	 * @param squareFeet the squareFeet to set
	 */
	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	/**
	 * @return the numOfRooms
	 */
	public int getNumOfRooms() {
		return numOfRooms;
	}
	/**
	 * @param numOfRooms the numOfRooms to set
	 */
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", cost=" + cost + ", address=" + address + ", squareFeet=" + squareFeet
				+ ", numOfRooms=" + numOfRooms + "]";
	}
}
