package animals;

import farm.Farm;

public class Sheep extends Animal {

    
    /**
     * Each shearing makes the farm $20.
     */
    public static void harvestWool() {

        System.out.println("You harvested Wool! (+20)");
        Farm.setCurrency(20);
        Farm.setCurrencyChange(20);
    }

    @Override
    public int health() {
        return 100;
    }

    @Override
    public String name() {
        return "Sheep";
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public int birthCycle() {
        return 0;
    }

    @Override
    public int harvestCycle() {
        return 0;
    }
    
    @Override
    public int production() {
        return 1;
    }
    


}
