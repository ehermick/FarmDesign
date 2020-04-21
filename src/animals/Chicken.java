package animals;

import farm.Farm;

public class Chicken extends Animal {

    public Chicken(String name, int health, int age, int birthCycle, int harvestCycle) {
        super(name, health, age, birthCycle, harvestCycle);
    }
    

    //Each egg makes the farm $1
    public static void harvestEggs() {
        Farm.currency = Farm.currency + 1;
        Farm.currencyChange = Farm.currencyChange + 1;
        
    }

}
