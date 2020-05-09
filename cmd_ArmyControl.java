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
        _GameWorld = Game.gameworld();;
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

        
        if (!hasSecondWord()) {
            // look around the room
            
            System.out.println("please finish command. army <command>");
            System.out.println("Commands: engage/battle");                    
            return;
        }
        
        
        switch(getSecondWord().toLowerCase()) //force string to be lowercase here in case it wasnt done before
        {
        case "engage" :
        case "fight"  :
        case "battle" :        
        World().EngageArmies();
        break;
    }
    }
    //Creaure
}