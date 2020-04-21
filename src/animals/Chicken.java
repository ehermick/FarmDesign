package animals;

import farm.Farm;

public class Chicken extends Animal {

    public Chicken(String name, int health, int age, int birthCycle) {
        super(name, health, age, birthCycle);
    }
    
    //Each egg makes the farm $1
    public static void harvestEggs() {
        Farm.currency = Farm.currency + 1;
    }

}
