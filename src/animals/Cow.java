package animals;

import farm.Farm;

public class Cow extends Animal {

    public Cow(String name, int health, int age, int birthCycle, int harvestCycle) {
        super(name, health, age, birthCycle, harvestCycle);

    }
    
    /**
     * Each milking makes the farm $10.
     */
    public static void harvestMilk() {
        
        System.out.println("You harvested Milk! (+$10)");
        Farm.setCurrency(10);
        Farm.setCurrencyChange(10);
    }

}
