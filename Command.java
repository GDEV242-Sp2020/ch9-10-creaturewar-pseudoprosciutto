
/**
 * Write a description of class Command here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public abstract class Command
{

    private String secondWord;
        
    //No longer need a constructor. this class is now abstract and only frames what commands are.

    /**
     * @return The second word of this command. Returns null if there was no
     * second word.
     */
    public String getSecondWord()
    {
        return secondWord;
    }
    
    /**
     * Sets the second word of the command so the child class can use the variable.
     */
    public void setSecondWord(String word2)
    {
        this.secondWord = word2;
    }
    


    /**
     * @return true if the command has a second word.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
    
    public boolean wantToQuit(){
        return false;
    }
    abstract public void action(); //abstract method unique to each command sub
}

