package affinities;

import crops.Crops;
import farm.Farm;

public class DecoratorHarvestWheat extends Crops {
    
    /**
     * Harvests wheat from old enough crops.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorHarvestWheat(String nameInput, int healthInput, int ageInput, 
            int harvestCycleInput, int productionInput) {
        name = nameInput;
        health = healthInput;
        age = ageInput;
        harvestCycle = harvestCycleInput;
        //production = productionInput;
    }

    @Override
    public String name() {
        return "Wheat";
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
     * Harvest Wheat.
     */
    public static void harvest() {
        System.out.println("You harvested Wheat! (+$9)");
        Farm.setCurrency(9);
        Farm.setCurrencyChange(9);
    }
    

}