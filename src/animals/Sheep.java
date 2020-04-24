package animals;

import farm.Farm;

public class Sheep extends Animal {

    public Sheep(String name, int health, int age, int birthCycle, int harvestCycle) {
        super(name, health, age, birthCycle, harvestCycle);

    }
    
    /**
     * Each shearing makes the farm $20.
     */
    public static void harvestWool() {

        System.out.println("You harvested Wool!");
        Farm.setCurrency(20);
        Farm.setCurrencyChange(20);
    }
    


}
