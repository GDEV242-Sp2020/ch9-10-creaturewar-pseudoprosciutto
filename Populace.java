// import java.util.*;
// /**    NEVER WAS ABLE TO MAKE THIS WORK.
//  *
 // * Populate is a population control manager.
 // * This class will handle adding and removing creatures from the game world.
 // *
 // * @author Matthew Sheehan
 // * @version 05/14/2020
 // */
// public class Populace 
// {
    // private  ArrayList<Creature> Creatures;
    // private  ArrayList<Creature> Army1 = new ArrayList<Creature>();
    // private  ArrayList<Creature> Army2 = new ArrayList<Creature>();
    // //private  List<ValidCreatures> validCreature;
    
    // public Populace()
    // {
        // //ArrayList<Creature> Army1 = new ArrayList<Creature>();
        // //ArrayList<Creature> Army2 = new ArrayList<Creature>();
        // createGeneric(); 
        // System.out.println("Populator init success");
        // System.out.println("Both Armies have been populated with default army roster");
    // }

    // /**
     // * Create a generic set of creatures to populate each army
     // */
    // private void createGeneric()
    // {
     // Creature balrog = new Balrog();
     // Army1.add(balrog);
     // Creature human = new Balrog();
     // Army2.add(human);
     
    // }
    
    // // /**
     // // * update armies from populator
     // // */
    // // private void updateArmies()
    // // {
        // // Army1 = getArmy1();
        // // Army1 = getArmy2();
    // // }
    // public ArrayList<Creature> getArmy1()
    // {
        // return Army1;
    // }
    // public ArrayList<Creature> getArmy2()
    // {
        // return Army2;
    // }
    // /**
     // * Pushes armies created changed and managed to parent class
     // */
    // private void push()
    // {
    // }
    
    // /**
     // * prints all valid creatures using enum
     // * this is public so a command can access this.
     // */
// //    public void printValidCreatures(){
    // // for (ValidCreatures creature : validCreature) 
        // // { 
            // // // Calling ordinal() to find index 
            // // System.out.println(creature + " at index "
                             // // + creature.ordinal()); 
        // // } 
    // // }
    // /**
     // * Gets creature from prefab list of valid creatures to be referenced and compared to.
     // */
    // public Creature SelectCreature(int selection)
    // {
        // return Creatures.get(selection);
    // }
    
    // /**
     // * get creature
     // * @param int from army number
     // * @return Creature
     // */
    // public Creature getCreature(int fromArmy, int rosterNum)
    // {
        // Creature creature;
        // switch(fromArmy)
        // {
            // case 1:
            // if(Army1.indexOf(rosterNum) != -1)
            // {
                // creature = Army1.get(rosterNum);
                // return creature;
            // }
            // break;
            // case 2:
            // if(Army2.indexOf(rosterNum) != -1)
            // {
                // creature = Army2.get(rosterNum);
                // return creature;
            // }
            // break;
            // default:
            // System.out.println("Invalid get, Army does not exist.");
        // }
        // System.out.println("Invalid get, creature does not exist in this army.");
        // return null;            
    // }

    // /**
     // * Clears all the dead units from the battle field.
     // */
    // private void clearDead()
    // {
        // for(Creature creature : Army1)
        // {
            // if(creature.IsAlive() ==false)
            // Army1.remove(creature);
        // }
                // for(Creature creature : Army1)
        // {
            // if(creature.IsAlive() ==false)
            // Army1.remove(creature);
        // }
    // }
    
  

    // public boolean isValidCreature(){
        // return true;
    // }
    
    // public void listValidCreatures()
    // {
        // int n=0;
       // for (Creature creature : Creatures)
        // {
            // System.out.println(n+" " + creature.getType());
            // n++;
        // }
    // }

    // public void listArmy(int forArmy)
    // {
        // int n;
        // switch (forArmy)
        // { 
            // case 1:
            // n = 0;
            // for(Creature creature : Army1)
            // {
                // n++;
                // System.out.println("Soldier "+n+": "+
                    // creature.getType() +" ");

            // }
            // break;
            // case 2:
            // n = 0;
            // for(Creature creature : Army2)
            // {
                // n++;
                // System.out.println("Soldier "+n+": "+
                    // creature.getType() +" ");
            // }
            // break;
            // case -1: //print both armies
            // n = 0;
            // System.out.println("Army 1 has in its roster:");
            // for(Creature creature : Army1)
            // {
                // n++;
                // System.out.println("Soldier "+n+": "+
                    // creature.getType() +" ");

            // }
            // n = 0;
            // for(Creature creature : Army2)
            // {
                // n++;
                // System.out.println("Soldier "+n+": "+
                    // creature.getType() +" ");
            // }
            // break;
            // default:
            // System.out.println("Army doesnt exist");
            // break;
        // }
    // }
    // /**
     // * remove a specific creature
     // * @param armyNumber int which army
     // * @param rosterNumber int creature's roster number in army
     // */
    // public void removeCreature(int armyNumber, int rosterNumber)
    // {
        // switch (armyNumber)
        // {
            // case 1 :
            // Army1.remove(rosterNumber);
            // break;

            // case 2 :
            // Army1.remove(rosterNumber);
            // break;

            // default:
            // System.out.println("Not a valid choice.");
            // break;            
        // }
    // }

    // /**
     // * 
     // * Creates a creature
     // * @param int for army
     // * @param String creature type
     // */
    // public void createCreature(int forArmy, String creatureType)
    // {
        // Creature creature = NewCreature(creatureType);
        // System.out.println("Created a "+creature.printString()+ ".");

        // switch (forArmy)
        // {
            // case 1:
            // Army1.add(creature);
            // break;

            // case 2:
            // Army2.add(creature);
            // break;
        // }
    // }

    // //iterate through possibilities using a case statement and create a new creature
    // private Creature NewCreature(String newCreatureType)
    // {
        // String creatureType = newCreatureType;

        // switch (creatureType.toLowerCase())
        // {
            // case "human" :
            // Creature human = new Human();
            // Creatures.add(human);
            // return human;

            // case "balrog" :
            // Creature balrog = new Balrog();
            // Creatures.add(balrog);
            // return balrog;

            // case "cyberdemon":
            // case "cyber demon":
            // case "cyber":
            // case "cd":
            // Creature cyberdemon = new CyberDemon();
            // Creatures.add(cyberdemon);
            // return cyberdemon;

            // case "demon" :
            // Creature demon = new Demon();
            // Creatures.add(demon);
            // return demon;

            // case "elf" :
            // Creature elf = new Elf();
            // Creatures.add(elf);
            // return elf;
            // default:
        // }
        // return null;
    // }       
// }