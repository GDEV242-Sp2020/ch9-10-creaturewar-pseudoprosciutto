import java.util.*;
/**
 * Write a description of class GameWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameWorld
{
    private ArrayList<Creature> Creatures;
    private ArrayList<Creature> Army1;
    private ArrayList<Creature> Army2;
    
    
    public GameWorld()
    {
        //master list of valid creatures
        ArrayList<Creature> unassignedCreatures = new ArrayList<Creature>();
        ArrayList<Creature> Creatures = new ArrayList<Creature>();
        ArrayList<Creature> Army1 = new ArrayList<Creature>();
        ArrayList<Creature> Army2 = new ArrayList<Creature>();
        System.out.println("GameWorld init");
        //createValidCreatures();
    }
    
    //CREATURE MECHANICS
    /**
     * Create instances to Add a registry of all valid creatures 
     */
    private void createValidCreatures()
    {
        
        Creatures.add(new Human());
        
        Creatures.add(new Balrog());
        
        Creatures.add(new CyberDemon());

        Creatures.add(new Demon());

        Creatures.add(new Elf());
    }
    
    public void listValidCreatures()
    {
        for (Creature creature : Creatures)
        {
            String name = creature.getName();
            System.out.println(name);
        }
    }
    
    public void listArmy(int forArmy)
    {
        int n = 0;
           switch (forArmy)
        { 
            case 1:
            for(Creature creature : Army1)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                                    creature.getType() +" ");
                
            }
            break;
            
            case 2:
            for(Creature creature : Army2)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                                    creature.getType() +" ");
            }
            break;
            default:
            System.out.println("Army doesnt exist");
        }
    }
    
    /**
     * Creates a creature
     * @param 
     */
    public void createCreature(String creatureType, int forArmy)
    {
        Creature creature = newCreature(creatureType);
        System.out.println("Created a "+creature.printString()+ ".");
        
        switch (forArmy)
        {
            case 1:
            Army1.add(creature);
            break;
            
            case 2:
            Army2.add(creature);
            break;
        }
    }
    
    //iterate through possibilities using a case statement and create a new creature
    private Creature newCreature(String newCreatureType)
    {
       String creatureType = newCreatureType;
       
       switch (creatureType.toLowerCase())
       {
           case "human" :
           Creature human = new Human();
            Creatures.add(human);
            return human;
            
           case "balrog" :
           Creature balrog = new Balrog();
            Creatures.add(balrog);
            return balrog;
           
           case "cyberdemon":
           case "cyber demon":
           case "cyber":
           case "cd":
           Creature cyberdemon = new CyberDemon();
            Creatures.add(cyberdemon);
            return cyberdemon;
            
           case "demon" :
           Creature demon = new Demon();
            Creatures.add(demon);
            return demon;
            
           case "elf" :
           Creature elf = new Elf();
            Creatures.add(elf);
            return elf;
            default:
       }
        return null;
    }       
}
