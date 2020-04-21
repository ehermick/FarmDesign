package animals;

import affinities.AnimalAffinities;
import farm.AnimalFarm;
import farm.HybridFarm;
import state.StateContext;

public class Animal {

    public String name;
    public int age;
    private int health;
    public int birthCycle;
    private int dayLastHarvested;
    private int productWorth;
    private AnimalFarm animalFarm;
    private AnimalAffinities animalAffinities;
    private HybridFarm hybridFarm;
    
    
    public Animal(String name, int health, int age, int birthCycle) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.birthCycle = birthCycle;
    }

    /**
     * Calculates the age of the animal based off the number of cycles
     * @param animal The animal in question
     */
    public static int animalAge(Animal animal) {
        int calculatedAge = StateContext.count % 2; //1 day + 1 night per cycle
       return animal.age = calculatedAge;
        
       
    }
    
    /**
     * Animals harvest their products.
     */
    public static void harvest(Animal animal) {
        
        //If animal is a chicken
        if (animal instanceof Chicken) {
            Chicken.harvestEggs();
        }

    }
   



    /**
     * Injured or sick animals (from attacks or disease).
     */
    public void injury() {

    }

}
