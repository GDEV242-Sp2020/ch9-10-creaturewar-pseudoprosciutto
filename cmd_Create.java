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
    
    
        private GameWorld World()
    {
        _GameWorld = Game.gameworld();;
        return _GameWorld;
    }
    
    /**
     * Add creature to GameWorld
     *  
     * This method performs the classes actions for Player in Game 
     * This abstract method from Command is contained in each command extension
     */
public void action() 
    {
        if (!hasSecondWord()) { // no second word
            System.out.println("Add to which army? Try: addunit <army#>");
            System.out.println("Army options: army1, army2, all");
            return;
        }   
        Parser parser = new Parser();
        
        
        switch(getSecondWord().toLowerCase())
        {
            case "army1" :
            System.out.println("Roster to choose unit:");
            World().ListValidCreatures();
            System.out.println("Enter soldier number to add unit to army.");
            int soldierTypeSelect = parser.askInt();
            
            World().CreateCreature(1,CreatureType(soldierTypeSelect).getType()); //string value of type located in creature subclass
          
            break;
            
            case "army2" :
            System.out.println("Roster to choose unit:");
            World().ListArmy(2);
            System.out.println("Enter soldier number to add unit from army.");
            soldierTypeSelect = parser.askInt();
           // World().removeCreature(2,soldierType);
            break;
            
            case "all":
            System.out.println("");
            
            
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
    private Creature CreatureType(int selection)
    {
        return World().SelectCreature(selection);
    }

}