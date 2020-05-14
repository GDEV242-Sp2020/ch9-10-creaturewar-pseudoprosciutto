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
   protected boolean isAlive;
   
   //instantiate random object for rng
   Random random = new Random();

   // public Creature()
   // {
       
   // }

   
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
    
   public int getDamage()
   {
       int randomDamage = 1 + (random.nextInt(strength.Amt()));
       return randomDamage;// a random number between 1 and strength`
   }
   
   
   //health commands
   public int Heal(int num)
   {
    return health.Heal(num);   
    }
    
   public int Hurt(int num)
   {
       
       if(health.Amt() <= 0){
           isAlive = false;
        }
        return health.Hurt(num);
   }
   
   public boolean IsAlive()
   {
   return isAlive;
   }
}
