package crops;

import farm.Farm;

public class Corn extends Crops {
    
    public Corn(String name, int health, int age, int harvestCycle) {
        super(name, health, age, harvestCycle);
    }
    
    
    //Each harvest makes the farm $2
    public static void harvestCorn() {
        Farm.currency = Farm.currency + 2;
        Farm.currencyChange = Farm.currencyChange + 2;
    }

}
