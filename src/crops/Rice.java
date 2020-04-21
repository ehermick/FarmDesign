package crops;

import farm.Farm;

public class Rice extends Crops {
    
    public Rice(String name, int health, int age, int harvestCycle) {
        super(name, health, age, harvestCycle);
    }
    
    //Each harvest makes the farm $1
    public static void harvestRice() {
        Farm.setCurrency(1);
        Farm.setCurrencyChange(1);
    }

}
