package crops;

import farm.Farm;

public class Corn extends Crops {
    
    public Corn(String name, int health, int age, int harvestCycle, int production) {
        super(name, health, age, harvestCycle, production);
    }
    
    
    //Each harvest makes the farm $2
    public static void harvestCorn() {
        
        System.out.println("You harvested Corn!");
        Farm.setCurrency(2);
        Farm.setCurrencyChange(2);
    }

}
