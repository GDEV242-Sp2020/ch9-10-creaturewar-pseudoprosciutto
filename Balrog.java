
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Creature
{
private String creatureType = "Balrog";
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        System.out.println("new Balrog created");
        Attribute health = new Health(10);
       Attribute strength = new Strength(10);
       isAlive = true;
    }
    
    @Override
    public void ability()
    {
        
    }
}
