import java.util.*;
/**
 * This is the world where the armies populate and wage war in. 
 * 
 *
 * @author Matthew Sheehan
 * @version 05/08/2020
 */
public class GameWorld
{
    private  ArrayList<Creature> Creatures;
    private  ArrayList<Creature> worldArmy1 = new ArrayList<Creature>();
    private  ArrayList<Creature> worldArmy2 = new ArrayList<Creature>();
    private  List<ValidCreatures> validCreature;   //test valid creatures with enum list //should be redundant
   // private Populace populator;
    //private ArrayList<Creature> unassignedCreatures; //maybe for future implementation

    public GameWorld()
    {
        
        List<ValidCreatures> validCreature = Arrays.asList(ValidCreatures.values());
                                        
        //ArrayList<Creature> unassignedCreatures = new ArrayList<Creature>(); //should be redundant.
       
        //Populace populator = new Populace();
        createGenericArmies();
    }
    
    /**
     * creates generic armies
     */
    private void createGenericArmies()
    {
        Creature balrog = new Balrog();
        worldArmy1.add(new Human());
        worldArmy2.add(balrog);
    }
    
    //In order to let populator do all the work the information needs to be sent between the two classes
    // /**
     // * update armies from populator
     // */
    // private void updateArmies()
    // {
        // worldArmy1.clear();
        // worldArmy1.addAll(populator.getArmy1());
        // worldArmy2.clear();
        // worldArmy2.addAll(populator.getArmy2());
    // }
    
    // /**
     // * armies to be sent to child classes
     // */
    // protected ArrayList<Creature> getArmy1()
    // {
        // return worldArmy1;
    // }
    // protected ArrayList<Creature> getArmy2()
    // {
        // return worldArmy2;
    // }
    //CREATURE MECHANICS
    
    // /**
     // * prints all valid creatures using enum
     // * this is public so a command can access this.
     // */
    // public void printValidCreatures(){
    // for (ValidCreatures creature : validCreature) 
        // { 
            // // Calling ordinal() to find index 
            // System.out.println(creature + " at index "
                             // + creature.ordinal()); 
        // } 
    // }
    
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
            if(worldArmy1.indexOf(rosterNum) != -1)
            {
                creature = worldArmy1.get(rosterNum);
                return creature;
            }
            break;
            case 2:
            if(worldArmy2.indexOf(rosterNum) != -1)
            {
                creature = worldArmy2.get(rosterNum);
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
        for(Creature creature : worldArmy1)
        {
            if(creature.IsAlive() ==false)
            worldArmy1.remove(creature);
        }
                for(Creature creature : worldArmy1)
        {
            if(creature.IsAlive() ==false)
            worldArmy1.remove(creature);
        }
    }
    
    public boolean isValidCreature(){
        return true;
    }
    
    public void ListValidCreatures()
    {
        int n=0;
       for (Creature creature : Creatures)
        {
            System.out.println(n+" " + creature.getType());
            n++;
        }
    }

    public void ListArmy(int forArmy)
    {
       // ArrayList<Creature> worldArmy1 = populator.getArmy1();
       // ArrayList<Creature> worldArmy2 = populator.getArmy2();

        int n;
        switch (forArmy)
        { 
            case 1:
            n = 0;
            System.out.println("Army 1 has in its roster:");
            for(Creature creature : worldArmy1)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                    creature.getType() +" ");

            }
            break;
            case 2:
            n = 0;
            System.out.println("Army 2 has in its roster:");
            for(Creature creature : worldArmy2)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                    creature.getType() +" ");
            }
            break;
            case -1: //print both armies
            n = 0;
            System.out.println("Army 1 has in its roster:");
            for(Creature creature : worldArmy1)
            {
                n++;
                System.out.println("Soldier "+n+": "+
                    creature.getType() +" ");

            }
            n = 0;
            System.out.println("Army 2 has in its roster:");
            for(Creature creature : worldArmy2)
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
    public void RemoveCreature(int armyNumber, int rosterNumber)
    {
        switch (armyNumber)
        {
            case 1 :
            worldArmy1.remove(rosterNumber);
            break;

            case 2 :
            worldArmy1.remove(rosterNumber);
            break;

            default:
            System.out.println("Not a valid choice.");
            break;            
        }
    }

    /**
     * 
     * Creates a creature
     * @param int for army
     * @param String creature type
     */
    public void CreateCreature(int forArmy, String creatureType)
    {
        Creature creature = NewCreature(creatureType);
        System.out.println("Created a "+creature.printString()+ ".");

        switch (forArmy)
        {
            case 1:
            worldArmy1.add(creature);
            break;

            case 2:
            worldArmy2.add(creature);
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
        System.out.println("Armies Engaging");
        String report = "";
        
        //attack wave
        while(worldArmy2.size()>0 && worldArmy2.size()>0) //each iteration is an attack wave/ round of battle.
        { 
            for(int i = 0; i < getArmy(getSmallestArmy()).size(); i++ ){
                Creature worldArmy1Unit = worldArmy1.get(i);
                Creature worldArmy2Unit = worldArmy2.get(i);
                Fight(worldArmy1Unit, worldArmy2Unit);
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
            return worldArmy1;
            case 2:
            return worldArmy2;
            default:
            System.out.println("Invalid GetArmy call. Army doesnt exist.");
        }
        return null;
    }

    private int getSmallestArmy()
    {
        //compare army sizes and return smallest
        if (worldArmy1.size()>worldArmy2.size())
            return 1;
        else //armies are same size or 2 is smallest 
            return 2;
    }

    private String BattleReport()
    {
        return "battleReport";
    }
}