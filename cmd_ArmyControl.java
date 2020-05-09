/**
 * Army Control commands
 */
public class cmd_ArmyControl extends Command
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor
     * @Param Player the current player
     */
    public cmd_ArmyControl()
    {

        
        
    }
    
    
    /**
     * Look at something specific and print description
     * 
     * This method performs the classes actions for Player in Game 
     * This abstract method from Command is contained in each command extension
     */
    public void action() 
    {

        
        if (!hasSecondWord()) {
            // look around the room
            
            System.out.println("please finish command. army <command>");
            System.out.println("Commands: engage,");                    
            return;
        }
        
        String secondWord = getSecondWord();         // Object name to search what to describe
        if(secondWord.equals("engage"))
        {
            
        }       
    }
    
    /**
     * Look at the room for an item with the given name and
     * show its description.
     * @return true if the item is found or false if it's not.
     */
    private boolean canDescribeItem(String name)
    {
        
}