package crops;

import farm.Farm;

public class Wheat extends Crops {
    
    public Wheat(String name, int health, int age, int harvestCycle) {
        super(name, health, age, harvestCycle);
    }
    
    //Each harvest makes the farm $3
    public static void harvestWheat() {
        Farm.currency = Farm.currency + 3;
    }

}
