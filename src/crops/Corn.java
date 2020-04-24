package crops;

import farm.Farm;

public class Corn extends Crops {
    
    public Corn(String name, int health, int age, int harvestCycle, int production) {
        super(name, health, age, harvestCycle, production);
    }
    
    
    /**
     * Each harvest makes the farm $6.
     */
    public static void harvestCorn() {
        
        System.out.println("You harvested Corn!");
        Farm.setCurrency(6);
        Farm.setCurrencyChange(6);
    }

}
