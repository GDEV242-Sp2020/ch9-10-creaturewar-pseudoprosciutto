/**
 * Drop command removes an item from the player's inventory 
 * and adds it to items list for player's current room. The room will hold item until moved.
 *
 * @author Matthew Sheehan
 * @version 05/8/2020
 */
public class cmd_Create extends Command
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor
     * @param 
     */
    public cmd_Create()
    {
        
    }
    
    
    /**
     * This method performs the classes actions for Player in Game 
     * This abstract method from Command is contained in each command extension
     */
    public void action() 
    {
        if (!hasSecondWord()) { // no second word
            System.out.println("Create what? Type: Creatue <CreatureType>");
                        System.out.println("Creature Types:" );
            return;
        }     
  
        
    }
    

}