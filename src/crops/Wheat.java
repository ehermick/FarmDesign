package crops;

import farm.Farm;

public class Wheat extends Crops {
    
    public Wheat(String name, int health, int age, int harvestCycle, int production) {
        super(name, health, age, harvestCycle, production);
    }
    
    /**
     * Each harvest makes the farm $9.
     */
    public static void harvestWheat() {
        
        System.out.println("You harvested Wheat!");
        Farm.setCurrency(9);
        Farm.setCurrencyChange(9);
    }

}
