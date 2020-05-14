
/**
 * List Commands. List armies, List valid/creatures, 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cmd_List extends Command
{
    public cmd_List()
    {
    }
       private GameWorld World()
    {
        _GameWorld = Game.gameworld();
        return _GameWorld;
    }
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
        case "valid":
        World().ListArmy(-1);
        break;
        case "army1":
        World().ListArmy(1);
        break;
        case "army2":
        World().ListArmy(2);
        break;
        case "engage" :
        case "fight"  :
        case "battle" :        
        World().EngageArmies();
        break;
    }
    }
    
}
    