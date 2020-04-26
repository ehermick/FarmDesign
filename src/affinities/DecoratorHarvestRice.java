package affinities;

import crops.Crops;
import farm.Farm;

public class DecoratorHarvestRice extends Crops {
    
    public DecoratorHarvestRice(String nameInput, int healthInput, int ageInput, int harvestCycleInput, int productionInput) {
        name = nameInput;
        health = healthInput;
        age = ageInput;
        harvestCycle = harvestCycleInput;
        production = productionInput;
    }

    @Override
    public String name() {
        return "Rice";
    }

    @Override
    public int health() {
        return 100;
    }

    @Override
    public int harvestCycle() {
        return 3;
    }

    @Override
    public int production() {
        return 1;
    }
    
    /**
     * Harvest Rice.
     */
    public static void harvest() {
        System.out.println("You harvested Rice! (+$3)");
        Farm.setCurrency(3);
        Farm.setCurrencyChange(3);
    }
    

}