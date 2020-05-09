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
   private int hp;
   private int strength = 10;
   private int minStrength= 5;
   //creature name
   private String name;
   //creature details
   private String printString;
   //creature type
   private String creatureType;
   
   
   //instantiate random object for rng
   Random random = new Random();

   public Creature()
   {
   }

   
   public String printString()
   {
   return getName() + " "+ strength;
}
   public String getType()
   {
       return creatureType;
    }
public String getName()
{
    return name;
}

   public int damage()
   {
       int randomDamage = 1 + (random.nextInt(strength));
       return randomDamage;// a random number between 1 and strength`
   }
    
    

   public boolean isAlive() 
   {
// if hitpoints > 0`
     return true;
   }
//There is no getter(accessor) for strength.
   private void setStrength(int newStrength)
   {
        if(newStrength<minStrength)
        strength=minStrength;
    }

}
