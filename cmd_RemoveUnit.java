
/**
 * Take command picks up an item from the room and adds it to the player's inventory.
 * The player can then move from room to room still having access to that item until dropped.
 *
 * @author Matthew Sheehan, 
 * @version 05/8/2020
 */
public class cmd_RemoveUnit extends Command
{


    /**
     * Constructor
     * @param Player current player
     */
    public cmd_RemoveUnit()
    {
    
    }
     
        //gameworld access
    private GameWorld World()
    {
        _GameWorld = Game.gameworld();;
        return _GameWorld;
    }
    /**
     * Picks up an item from the room if the item can be held
     * 
     * This method performs the classes actions for Player in Game 
     * This abstract method from Command is contained in each command extension
     */
public void action() 
    {
        if (!hasSecondWord()) { // no second word
            System.out.println("Remove from which army? Try: subunit <army#>");
            System.out.println("Army options: army1, army2");
            return;
        }   
        Parser parser = new Parser();
        int soldierNum = -1; //-1 will be invalid
        
        switch(getSecondWord().toLowerCase())
        {
            case "army1" :
            System.out.println("Roster to choose unit:");
            World().ListArmy(1);
            System.out.println("Enter soldier number to delete unit from army.");
            soldierNum = parser.askInt();
            
            World().RemoveCreature(1,soldierNum);
          
            break;
            
            case "army2" :
            System.out.println("Roster to choose unit:");
            World().ListArmy(2);
            System.out.println("Enter soldier number to delete unit from army.");
            soldierNum = parser.askInt();
            World().RemoveCreature(2,soldierNum);
            break;
            
            default :
            System.out.println("Not Recognized Command. Remove from which army? Try: subunit <army#>");
            System.out.println("Command options: army1, army2");
            break;
        }
        int i =0;
        if (i==1) {
        }
        else {
            System.out.println("");
        }        
    }
}
