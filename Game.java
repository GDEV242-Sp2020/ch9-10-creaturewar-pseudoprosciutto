import java.util.*;
/**
 * The Game class creates and controls game states
 *
 * @Matthew Sheehan
 * @5/8/2020
 */
public class Game
{
    // instance variables - replace the example below with your own
    private static GameWorld CreatureWarSimulation;
    //input command prompt
    public Parser parser;    
    
    //Game State
    boolean wantToQuit = false;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        parser = new Parser();
        CreatureWarSimulation = new GameWorld();
        // Stack<Room> roomStack = new Stack<Room>();
        // GameItems = new HashSet<Items>();

        createValidCommands();
    }
   
    public void createValidCommands()
    {
        CommandWords commands = parser.getCommands();
        commands.addCommand("quit", new cmd_Quit()); 
        commands.addCommand("help", new cmd_Help(commands));
        commands.addCommand("army",new cmd_ArmyControl());
        commands.addCommand("addUnit", new cmd_Create());
        commands.addCommand("subUnit", new cmd_RemoveUnit());
        //commands.addCommand("test", new cmd_Test);
    }    
    
    private void printWelcome()
    {
        System.out.println("Welcome to creature war simulation. To begin simulation, type commands.\n"
        + "Type Help to list all commands at any time.");
        
    }
    
    //GAME STATES
        public void play()
    {
        printWelcome();
    
            // Enter the main command loop.  Here we repeatedly read commands and
            // execute them until the game is over.
        boolean finished = false;
            while (! finished) {
                
                //might need to send this instance when creating a command but not sure
                
                Command command = parser.getCommand(); // gets new command
                
                finished = processCommand(command);     // runs boolean check while decripting commandWord
            }
            System.out.println("Thank you for playing.  Good bye.");
    }
    
    /**
     * executes unique action method depending on the cmd_* class called.
     */
    private boolean processCommand(Command command)
    {
        
        command.action();
        return command.wantToQuit(); // Overridden in cmd_Quit so when thats launched return true
    }
    
    /**
     * A check for wantToQuit status.
     */
     private boolean WantToQuit()
     {
         return wantToQuit;
     }
    
     /**
     * Changes boolean wantToQuit to true
     */
    public void setQuit()
    {
        wantToQuit = true;
    }

    /**
     * allows access to the one instance of the gameworld
     */
    public static GameWorld gameworld()
    {
        return CreatureWarSimulation;
    }
    
}
