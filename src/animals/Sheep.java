package animals;

import farm.Farm;

public class Sheep extends Animal {

    public Sheep(String name, int health, int age, int birthCycle, int harvestCycle) {
        super(name, health, age, birthCycle, harvestCycle);

    }
    
    //Each set of wool makes the farm $5
    public static void harvestWool() {
        Farm.currency = Farm.currency + 5;
        Farm.currencyChange = Farm.currencyChange + 5;
    }
    


}
