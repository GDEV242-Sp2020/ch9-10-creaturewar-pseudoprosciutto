
/**
 * Write a description of class cmd_Quit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cmd_Quit extends Command
{
    
    public void action()
    {
    }
    
    @Override //over rides the wantToQuit. not made abstract since only one command uses this method
    public boolean wantToQuit()
    {
        return true;
    }
}
