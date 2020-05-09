public class cmd_Help extends Command
{
    // instance variables - replace the example below with your own
    private CommandWords commands;

    /**
     * Constructor for objects of class CommandUnkown
     */
    public cmd_Help(CommandWords commands)
    {
        this.commands = commands;
    }
    
    
    /**
     * Action for cmd_Help
     * Prints basic text for the player to know simple boundaries of the game.
     * Lists out commands and explains surroundings.
     * 
     * This method performs the classes actions for Player in Game 
     * This abstract method from Command is contained in each command extension
     */
    public void action() 
    {        
        System.out.println("Welcome to Creature War. Type valid commands and hit enter.");
        System.out.println(commands.showAllString());
    }
}