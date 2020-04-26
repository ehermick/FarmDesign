package animals;

import farm.Farm;

public class Cow extends Animal {
    
    /**
     * Each milking makes the farm $10.
     */
    public static void harvestMilk() {
        
        System.out.println("You harvested Milk! (+$10)");
        Farm.setCurrency(10);
        Farm.setCurrencyChange(10);
    }

    @Override
    public int health() {
        return 100;
    }

    @Override
    public String name() {
        return "Cow";
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
