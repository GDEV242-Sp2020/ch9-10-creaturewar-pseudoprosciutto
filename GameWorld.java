import java.util.*;
/**
 * Write a description of class GameWorld here.
 *
 * @author Matthew Sheehan
 * @version 05/08/2020
 */
public class GameWorld
{
    private  ArrayList<Creature> Creatures;
    private  ArrayList<Creature> Army1;
    private  ArrayList<Creature> Army2;
    //private ArrayList<Creature> unassignedCreatures;

    public GameWorld()
    {
        //master list of valid creatures
        ArrayList<Creature> Creatures = new ArrayList<Creature>();
        ArrayList<Creature> unassignedCreatures = new ArrayList<Creature>(); //should be redundant.

        ArrayList<Creature> Army1 = new ArrayList<Creature>();
        ArrayList<Creature> Army2 = new ArrayList<Creature>();
        System.out.println("GameWorld init");
        //createValidCreatures();
    }

    //CREATURE MECHANICS
    /**
     * get creature
     * @param int from army number
     * @return Creature
     */
    public Creature getCreature(int fromArmy, int rosterNum)
    {
        Creature creature;
        switch(fromArmy)
        {
            case 1:
            if(Army1.indexOf(rosterNum) != -1)
            {
                creature = Army1.get(rosterNum);
                return creature;
            }
            break;
            case 2:
            if(Army2.indexOf(rosterNum) != -1)
            {
                creature = Army2.get(rosterNum);
                return creature;
            }
            break;
            default:
            System.out.println("Invalid get, Army does not exist.");
        }
        System.out.println("Invalid get, creature does not exist in this army.");
            return null;            
        }
        
        
    

    /** Create instances to add a registry of all valid creatures - purposely unformatted because blueJ doesnt fold regions  **/
    private void createValidCreatures(){Creatures.add(new Human());        Creatures.add(new Balrog());        Creatures.add(new CyberDemon());        Creatures.add(new Demon());        Creatures.add(new Elf());    }    

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
        int n;
        switch (forArmy)
        { 
            case 1:
            n = 0;
            for(Creature creature : Army1)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                    creature.getType() +" ");

            }
            break;
            case 2:
            n = 0;
            for(Creature creature : Army2)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                    creature.getType() +" ");
            }
            break;
            case -1: //print both armies
            n = 0;
            System.out.println("Army 1 has in its roster:");
            for(Creature creature : Army1)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                    creature.getType() +" ");

            }
            n = 0;
            for(Creature creature : Army2)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                    creature.getType() +" ");
            }
            break;
            default:
            System.out.println("Army doesnt exist");
            break;
        }
    }

    public void removeCreature(int armyNumber, int rosterNumber)
    {
        switch (armyNumber)
        {
            case 1 :
            Army1.remove(rosterNumber);
            break;

            case 2 :
            Army1.remove(rosterNumber);
            break;

            default:
            System.out.println("Not a valid choice.");
            break;            
        }

    }

    /**
     * 
     * Creates a creature
     * @param 
     */
    public void createCreature(String creatureType, int forArmy)
    {
        Creature creature = NewCreature(creatureType);
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
    private Creature NewCreature(String newCreatureType)
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

    public void EngageArmies()
    {
        Battle();
    }

    private void Battle()
    {
        System.out.println("Armies be engaging. All the maths will be here.");
        System.out.println("Outcome: ");
    }
}
