
/**
 * The class <b>MontyHall</b> simulates one game. Is uses three <b>Door</b> objects
 * to simulate the three doors. One game consists of the following steps
 * <ol>
 * <li>Resets all three doors</li>
 * <li>Simulates the selection of one of the doors by the player</li>
 * <li>Simulates opening of an empty door by the host</li>
 * <li> provide the outcome for switching and not switching door</li>
 * </ol>
 * @author gvj (gvj@eecs.uottawa.ca)
 *
 */
public class MontyHall {

     // ADD YOUR INSTANCE VARIABLES HERE

	/** 
     * Initializes the three doors.
     */
 	public MontyHall(){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
		}
	
	/** 
     * Simulates one Monty Hall game.  
     * <ol>
     * <li>Resets all three doors</li>
	 * <li>Simulates the selection of one of the doors by the player</li>
	 * <li>Simulates opening of an empty door by the host</li>
	 * <li>prints the outcome for switching and not switching door to standard output</li>
	 * </ol>
     */
 	public void oneGame(){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
			
		if(/* SWITCHING STRATEGY LOST */){
			System.out.println("Switching strategy would have lost");
		} else{
			System.out.println("Switching strategy would have won");	
		}
		
	}

	/** 
     * Simulates a random selection of one of the three doors.
     * @return the door randomly selected  
     */
 	private Door pickADoor(){
// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
	}
	
/** 
     * Simulates the opening of one of the other doors once the player selected one.
     * It should  open a door chosen randomly among the ones that don't have the prize and
     * that are not selected by the player
     * 
     *   @param prizeDoor the door that hides the prize
     *   @param selectedDoor the door that was selected by the player
     *   @return the door opened
     */
 	private Door openOtherDoor(Door prizeDoor, Door selectedDoor){

// REPLACE THE BODY OF THIS METHOD WITH YOUR OWN IMPLEMENTATION
	
	}
	
 	/**
     * The main method of this program. Examples of the execution of the program
     * from the command line:
     * <pre>
     * > java MontyHall
     * The prize was behind door B
     * The player selected door B
     * The host opened door C
     * Switching strategy would have lost
     * </pre>
     * <pre>
     * > java MontyHall
     * The prize was behind door B
     * The player selected door A
     * The host opened door C
     * Switching strategy would have won
     * </pre>
     * @param args ignored for now
	 */
	public static void main(String[] args) {

		MontyHall montyHall;
		
		StudentInfo.display();
		montyHall = new MontyHall();		
		montyHall.oneGame();
	}

}
