package animals;

import farm.Farm;

public class Cow extends Animal {

    public Cow(String name, int health, int age, int birthCycle) {
        super(name, health, age, birthCycle);

    }
    
    //Each milking makes the farm $2
    public static void harvestMilk() {
        Farm.currency = Farm.currency + 2;
    }

}
