package animals;

import farm.Farm;

public class Cow extends Animal {

    public Cow(String name, int health, int age, int birthCycle, int harvestCycle) {
        super(name, health, age, birthCycle, harvestCycle);

    }
    
    /**
     * Each milking makes the farm $2.
     */
    public static void harvestMilk() {
        
        System.out.println("You harvested Milk!");
        Farm.setCurrency(2);
        Farm.setCurrencyChange(2);
    }

}
