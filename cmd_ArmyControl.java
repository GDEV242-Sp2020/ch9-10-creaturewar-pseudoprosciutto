public class cmd_ArmyControl extends Command
{
    // instance variables - replace the example below with your own
    private Player player;


    /**
     * Constructor
     * @Param Player the current player
     */
    public cmd_ArmyControl()
    {
        this.player = player;
        
        
    }
    
    
    /**
     * Look at something specific and print description
     * 
     * This method performs the classes actions for Player in Game 
     * This abstract method from Command is contained in each command extension
     */
    public void action() 
    {
        if(player.getCurrentRoom().isDark()){//check to see if room is dark
            System.out.println("The room is pitchblack and you are unable to see anything");
            System.out.println();
            return;   
        }
        
        if (!hasSecondWord()) {
            // look around the room
            
            System.out.println(player.getCurrentRoom().printLocationInfo());
            System.out.println();                    
            return;
        }
        
        String objName = getSecondWord();         // Object name to search what to describe
        boolean found = canDescribeItem(objName); // Can Describe this item in room?
        if (!found) {
            found = canDescribeHeldItem(objName); // No, then how about Inventory?
            if (!found) {
                found = canDescribeNPC(objName);  // No, is this a character?
            }
        }
        
        if (!found) {                             // No that object name isn't found
            System.out.println("Look what?");
        }
    }
    
    /**
     * Look at the room for an item with the given name and
     * show its description.
     * @return true if the item is found or false if it's not.
     */
    private boolean canDescribeItem(String name)
    {
        Items item = player.getCurrentRoom().getItem(name);
        if (item != null) {
            System.out.println(item.getDescription());
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Looks in inventory for an item with name.
     * @param String 
     * @return boolean true if found or false if not.
     */
    private boolean canDescribeHeldItem(String name)
    {
        Items item = player.getItem(name);
        if (item != null) {
            System.out.println(item.getDescription());
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Look at a character with the given name and show
     * its description.
     * @return true if the character is found or false if it's not.
     */
    public boolean canDescribeNPC(String name)
    {
        if(player.getCurrentRoom().getNPC(name) != null){
            System.out.println(player.getCurrentRoom().getNPC(name).getDescription());
            return true;
        }
        else {
            return false;
        }        
    }
}