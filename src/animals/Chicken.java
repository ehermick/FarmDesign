package animals;

import farm.Farm;

public class Chicken extends Animal {

    public Chicken(String name, int health, int age, int birthCycle, int harvestCycle) {
        super(name, health, age, birthCycle, harvestCycle);
    }
    


    /**
     * Each egg makes the farm $5.
     */
    public static void harvestEggs() {

        System.out.println("You harvested Eggs!");
        Farm.setCurrency(5);
        Farm.setCurrencyChange(5);
        
    }

}
