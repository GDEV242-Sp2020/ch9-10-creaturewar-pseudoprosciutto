
/**
 * Strength Attribute
 *
 * @author Matthew Sheehan
 * @version 05/14/2020
 */
public class Strength extends Attribute
{


    /**
     * Create strength module setting maximum strength to the parameter value and the current amt to the maximum value.
     */
    public Strength(int Total)
    {
        if(Total < 1 ) Total = 1;
        max = Total;
        amt = max;
    }

    public void randomize()
    {
        amt = 1 + random.nextInt(max);
    }
}
