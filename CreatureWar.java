
/**
 * Main Class to start application
 * 
 * Creature war is a simulation where the user creates two armies consisting of different creatures which fight each other.
 * Battle occurs upon command engage and the winner is listed as the army with creatures still alive after battle
 *
 * @author Matthew Sheehan
 * @version 05/09/2020
 */
public class CreatureWar
{
    //instantiate game world
    private Game CreatureWar;

    /**
     * Launch Creature War Game
     */
    public static void main(String[] args){
        Game CreatureWar = new Game();
        CreatureWar.play();
    }
}
