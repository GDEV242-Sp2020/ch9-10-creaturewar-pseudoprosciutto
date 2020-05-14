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
    
    private GameWorld World()
    {
        _GameWorld = Game.gameworld();
        return _GameWorld;
    }
    
    /**
     * Look at something specific and print description
     * 
     * This method performs the classes actions for Player in Game 
     * This abstract method from Command is contained in each command extension
     */
    public void action() 
    {

         GameWorld World = Game.gameworld(); //this is a test to see where the error is with loading roster. 
        
        if (!hasSecondWord()) {
            // look around the room
            
            System.out.println("please finish command. army <command>");
            System.out.println("Commands: engage/battle");                    
            return;
        }
        
        
        switch(getSecondWord().toLowerCase()) //force string to be lowercase here in case it wasnt done before
        {
        case "list":
        World.ListArmy(-1);
        break;
        case "list1":
        World().ListArmy(1);
        break;
        case "list2":
        World().ListArmy(2);
        break;
        case "engage" :
        case "fight"  :
        case "battle" :        
        World().EngageArmies();
        break;
    }
    }
    //Creaure
}