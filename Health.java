
/**
 * Write a description of class HealthModule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Health extends Attribute
{
    private int max;
    private int start_hp;
    private int amt;// current amount
    public Health(int Total)
    {
        max = Total;
        start_hp = Total;
        amt = Total;

    }
    
    public int Hurt(int num)
    {
        
        if(amt < num ) amt= 0;
        else amt = amt-num;
        
        return amt;
    }
    public int Heal(int num)
    {
        if(amt == 0) return amt; //dead
        amt += num;
        if(amt > max) amt = max; //full health
              
        return amt;
    }
    
    public int Amt()
    {
        return amt;
    }

}
