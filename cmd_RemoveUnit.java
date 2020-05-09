
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
    
    
    /**
     * Picks up an item from the room if the item can be held
     * 
     * This method performs the classes actions for Player in Game 
     * This abstract method from Command is contained in each command extension
     */
public void action() 
    {
        if (!hasSecondWord()) { // no second word
            System.out.println("Remove from which army?");
            System.out.println("Try: sub
            return;
        }     

        // if (item != null && player.haveItem(item)) { //item is held - redundant check
            // player.dropItem(item);
            // room.addItem(item);
            
        // }
        // else {
            // System.out.println("Can't find item to drop");
        // } 
        Room room = player.getCurrentRoom();
        Items item = player.getItem(getSecondWord());
        if (item != null) {
            if (player.dropItem(item)) { //returns true and item is picked up
                room.addItem(item);
                System.out.println("You removed the " +item.getName() +" from your possessions.");
                System.out.println("You now have space to hold "+ player.numSpaceLeft() +" more items.");
            }
            else {
                System.out.println("You cannot drop this!");
            }
        }
        else {
            System.out.println("Drop what? (try: drop <item> - make sure its something you're carrying");
        }        
    }
    
}
