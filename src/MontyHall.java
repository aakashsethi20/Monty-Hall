
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

     private Door[] doors;

	/** 
     * Initializes the three doors.
     */
 	public MontyHall(){
 		doors = new Door[3];
 		
 		doors[0] = new Door("Door-A");
 		doors[1] = new Door("Door-B");
 		doors[2] = new Door("Door-C");
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
 		
 		// Door for prize randomly chosen
 		int randPrize = (int)(Math.random() * 3);
 		doors[randPrize].setPrize();
 		Door chosenDoor = doors[randPrize];
 		System.out.println("The prize is behind " + chosenDoor.getName() + ".");
 		
 		// Randomly picking a door out of the three
 		Door pickedDoor = pickADoor();
 		System.out.println("The player chose " + pickedDoor.getName() + ".");
 		
 		
 		// Opened door
 		Door openedDoor = openOtherDoor(chosenDoor, pickedDoor);
 		System.out.println("The host opened " + openedDoor.getName() + ".");
			
		if(chosenDoor == pickedDoor){
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
 		// Player chooses door randomly
 	 	int randDoor = (int)(Math.random() * 3);
 	 	doors[randDoor].choose();
 	 	return doors[randDoor];
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
 		
 		boolean opened = false;
 		int doorNum = -1;
 		
 		while(!opened) {
 			int rand = (int)(Math.random() * 3);
 			if(!doors[rand].hasPrize() && !doors[rand].isChosen()) {
 				opened = true;
 				doorNum = rand;
 				doors[rand].open();
 			}
 		}
 		return doors[doorNum];
	
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
		
		//StudentInfo.display();
		montyHall = new MontyHall();		
		
		montyHall.oneGame();
	}

}
