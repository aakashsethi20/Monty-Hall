

/**
 * The class <b>Door</b> stores the information about one of the door: 
 * does it have the prize behind it? Is it open or closed? Was it 
 * selected by the player?
 * 
 * It provides other objects access to these information through some
 * <b>setters</b> and <b>getters</b>.
 * 
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
public class Door {
	
	// ADD YOUR INSTANCE VARIABLES HERE
	
	private String name;
	private boolean open;
	private boolean prize;
	private boolean choosen;
	
	/** 
     * Creates an instance of the Door object.
     * Initially, the door is closed, doesn't have a prize behind it 
     * and has not been chosen by the player.
     * 
     * @param name identifier for that door
     */
	public Door(String name){
		this.name = name;
		this.open = false;
		this.prize = false;
		this.choosen = false;
	}

	/** 
     * Resets the door to its initial state: closed, without a prize behind it 
     * and not chosen by the player.
     */
	public void reset(){
		open = false;
		prize = false;
		choosen = false;
	}
	
	/** 
     * Sets this door open.
     */
	public void open(){
		open = true;
	}
	
	/** 
     * Checks if the door is open.
     * @return true if the door is open
     */
	public boolean isOpen(){
		return open;
	}
	
	/** 
     * Puts the prize behind this door.
     */
	public void setPrize(){
		prize = true;
	}
	
	/** 
     * Checks if the door has the prize.
     * @return true if the door has the prize
     */
	public boolean hasPrize(){
		return prize;
	}
	
	/** 
     * Sets this door as selected by the player.
     */
	public void choose(){
		choosen = true;
	}

	/** 
     * Checks if the door is selected by the player.
     * @return true if the door is selected by the player
     */
	public boolean isChosen(){
		return choosen;
	}
	
	
	/** 
     * @return the door's identifier
     */
	public String getName(){
		return name;
	}
}
