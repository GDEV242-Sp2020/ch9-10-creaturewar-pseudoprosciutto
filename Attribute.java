import java.util.Random;
/**
 * Parent class of all attributes
 *
 * @author Matthew Sheehan
 * @version 05/08/2020
 */

public abstract class Attribute
{
    int max;
    int amt;
    Random random = new Random();
    public int Amt()
    {
        return amt;
    }
    public int MaxAmount()
    {
        return max;
    }
    public abstract void randomize();
}
