
/**
 * The Command class is now abstract and only frames what commands are.
 *
 * @author Matthew Sheehan
 * @version 05/09/2020
 */

public abstract class Command
{
    public GameWorld _GameWorld;
    private String secondWord;
    private String thirdWord; // just in case
        
    //No longer need a constructor. this class is now abstract and only frames what commands are.

    
    //SECOND WORD
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
    
    //THIRD WORD
        /**
     * @return The third word of this command. Returns null if there was no
     * third word.
     */
    public String getThirdWord()
    {
        return thirdWord;
    }
    /**
     * Sets the third word of the command so the child class can use the variable.
     */
    public void setThirdWord(String word3)
    {
        this.thirdWord = word3;
    }
    /**
     * @return true if the command has a third word.
     */
    public boolean hasThirdWord()
    {
        return (thirdWord != null);
    }
    
    public boolean wantToQuit(){
        return false;
    }
    
    abstract public void action(); //abstract method unique to each command sub

}

