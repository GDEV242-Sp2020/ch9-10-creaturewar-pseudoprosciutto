
/**
 * Write a description of class HealthModule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Health extends Attribute
{
    private int start_hp;
    private boolean alive; 
        /**
     * Create a health system module with full health minimum of 1
     * @param int new total health value
     */
    public Health(int Total)
    {

        if(Total <1) Total = 1;
        alive = true;
        max = Total;
        start_hp = Total; //marks starting hp
        amt = Total; //sets hitpoint level
        System.out.println("Health loaded");
    }
    /**
     * lowers health level
     * @param int new health value
     */
    public int Hurt(int num)
    {
        if(amt < num ) {
            amt= 0;
            alive = false;
        }
        else amt = amt-num;
        return amt;
    }
    /**
     * adds to health level
     * @param int new health value
     */
    public int Heal(int num)
    {
        if(amt == 0 || !alive) return amt; //dead

        amt += num;
        if(amt > max) amt = max; //full health
              
        return amt;
    }
     /**
     * sets maximum health level
     * @param int new value
     */
    public void setMax(int num)
    {
        max = num;
    }
    
    /**
     * sets current health level
     * @param int new health value
     */
        public void setHealth(int num)
    {
        amt = num;
    }


    public void randomize()
    {
        
    }
    
    /**
     * @return false if current hp level has reached 0
     */
    public boolean isAlive(){ return alive; }
}
