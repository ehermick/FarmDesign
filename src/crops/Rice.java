package crops;

import farm.Farm;

public class Rice extends Crops {
    
    public Rice(String name, int health, int age, int harvestCycle, int production) {
        super(name, health, age, harvestCycle, production);
    }
    
    /**
     * Each harvest makes the farm $3.
     */
    public static void harvestRice() {
        System.out.println("You harvested Rice! (+$3)");
        Farm.setCurrency(3);
        Farm.setCurrencyChange(3);
    }

}
