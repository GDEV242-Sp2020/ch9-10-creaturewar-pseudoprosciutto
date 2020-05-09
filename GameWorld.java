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
        
        createValidCreatures();
      

        
    }

    //CREATURE MECHANICS
    /**
     * Gets creature from prefab list of valid creatures to be referenced and compared to.
     */
    public Creature SelectCreature(int selection)
    {
        return Creatures.get(selection);
    }
    
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

    /**
     * Clears all the dead units from the battle field.
     */
    private void clearDead()
    {
        for(Creature creature : Army1)
        {
            if(creature.IsAlive() ==false)
            Army1.remove(creature);
        }
                for(Creature creature : Army1)
        {
            if(creature.IsAlive() ==false)
            Army1.remove(creature);
        }
    }
    
    /** Create instances to add a registry of all valid creatures - purposely unformatted because blueJ doesnt fold regions  **/
    private void createValidCreatures(){Creatures.add(new Human());        Creatures.add(new Balrog());        Creatures.add(new CyberDemon());        Creatures.add(new Demon());        Creatures.add(new Elf());    }    

    public boolean isValidCreature(){
        return true;
    }
    
    public void listValidCreatures()
    {
        int n=0;
       for (Creature creature : Creatures)
        {
            System.out.println(n+" " + creature.getType());
            n++;
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
    /**
     * remove a specific creature
     * @param armyNumber int which army
     * @param rosterNumber int creature's roster number in army
     */
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
    public void createCreature(int forArmy, String creatureType)
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

    /**
    *Engage in battle rounds until there are no more units standing in one or both armies. 
    *only all of the smallest army's units fight. the other army keeps units uncontested as back up until rosters align.
    *creatures with equal roster placement in opposite armies fight each other until roster order changes.
    */
    public void EngageArmies()
    {
        String report = "";
        
        //attack wave
        while(Army2.size()>0 && Army2.size()>0) //each iteration is an attack wave/ round of battle.
        { 
            for(int i = 0; i < getArmy(getSmallestArmy()).size(); i++ ){
                Creature army1Unit = Army1.get(i);
                Creature army2Unit = Army2.get(i);
                Fight(army1Unit, army2Unit);
            }
            //whenever enemies die in round of battle they are set to dead. This clears the field before restarting cycle.
            clearDead();
        }
        
    }
    
    private void Fight(Creature c1, Creature c2)
    {
        int c1Dmg = c1.getDamage();
        c2.Hurt(c1Dmg);
        System.out.println("Army1's "+ c1.getType() +" does "+ c1Dmg +" to Army2's " + c2.getType());

        int c2Dmg = c2.getDamage();
        c1.Hurt(c2Dmg);
        System.out.println("Army1's "+ c1.getType() +" does "+ c1Dmg +" to Army2's " + c2.getType());

        if(c1.IsAlive() == false){
            System.out.println("Army1's "+ c1.getType() +" has died");
        }
        if(c2.IsAlive() == false){
            System.out.println("Army2's "+ c2.getType() +" has died");
        }
        
    }
    
    private void Battle()
    {
        System.out.println("Armies be engaging. All the maths will be here.");
        System.out.println("Outcome: " + BattleReport());
    }

    private ArrayList<Creature> getArmy(int num)
    {
        switch (num){
            case 1:
            return Army1;
            case 2:
            return Army2;
            default:
            System.out.println("Invalid GetArmy call. Army doesnt exist.");
        }
        return null;
    }

    private int getSmallestArmy()
    {
        //compare army sizes and return smallest
        if (Army1.size()>Army2.size())
            return 1;
        else //armies are same size or 2 is smallest 
            return 2;
    }

    private String BattleReport()
    {
        return "battleReport";
    }
}