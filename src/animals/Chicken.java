package animals;

import farm.Farm;

import java.util.ArrayList;

public class Chicken extends Animal {
    
    private static ArrayList<Animal> animals = Farm.getAnimals();

    public Chicken(String name, int health, int age, int birthCycle, int harvestCycle) {
        super(name, health, age, birthCycle, harvestCycle);
    }
    


    /**
     * Each egg makes the farm $5.
     */
    public static void harvestEggs() {

        System.out.println("You harvested Eggs! (+$5)");
        Farm.setCurrency(5);
        Farm.setCurrencyChange(5);
        
    }
    
}
