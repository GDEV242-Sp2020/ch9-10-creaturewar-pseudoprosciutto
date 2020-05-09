//import java.util.*;
import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Creature
{
   private int hp = 10;

//   private int minStrength= 5;
   private Health health;
   private Strength strength;
   private String name;
   private String printString;
   private String creatureType;
   private String description;
   private boolean isAlive;
   
   //instantiate random object for rng
   Random random = new Random();

   public Creature()
   {
       Attribute health = new Health(10);
       Attribute strength = new Strength(10);
       isAlive = true;
   }

   
   public String printString()
   {
   return getName() + " with " +hp +" HP and "+  strength + "Strength";
   }
   public String getType()
   {
       return creatureType;
   }
   public String getName()
   {
    return name;
    }
   public String getDescription()
   {
    return description;
    }
   public int damage()
   {
       int randomDamage = 1 + (random.nextInt(strength.Amt()));
       return randomDamage;// a random number between 1 and strength`
   }
   
   public boolean isAlive() 
   {
       // if hitpoints > 0`
     return true;
   }
   
   //health commands
   public int heal(int num)
   {
    return health.Heal(num);   
    }
    
   public int hurt(int num)
   {
       return health.Hurt(num);
   }
   
   public boolean IsAlive()
   {
   return isAlive;
   }
}
