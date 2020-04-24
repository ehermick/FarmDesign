package crops;

import farm.Farm;

public class Rice extends Crops {
    
    public Rice(String name, int health, int age, int harvestCycle, int production) {
        super(name, health, age, harvestCycle, production);
    }
    
    //Each harvest makes the farm $1
    public static void harvestRice() {
        System.out.println("You harvested Rice!");
        Farm.setCurrency(1);
        Farm.setCurrencyChange(1);
    }

}
