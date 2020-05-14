
/**
 * Write a description of class Human here.
 ***HUMAN**

 >a basic creature, max str(18) max hp(30), min str(5), min hp(10)
 * @author Matthew Sheehan
 * @version  5/14/2020
 */
public class Human extends Creature
{
    private String creatureType = "Human";

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        System.out.println("new Human created");
        Attribute health = new Health(10);
       Attribute strength = new Strength(10);
       isAlive = true;
    }
    
    @Override
    public void ability()
    {
        
    }
    

}
