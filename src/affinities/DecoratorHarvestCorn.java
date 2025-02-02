package affinities;

import crops.Crops;
import factory.Farm;

public class DecoratorHarvestCorn extends Crops {
    
    /**
     * Harvests corn from old enough crop.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param harvestCycleInput Harvest Cycle
     * @param productionInput Production
     */
    public DecoratorHarvestCorn(String nameInput, int healthInput, 
            int ageInput, int harvestCycleInput, int productionInput) {
        name = nameInput;
        health = healthInput;
        age = ageInput;
        harvestCycle = harvestCycleInput;
        //production = productionInput;
    }

    @Override
    public String name() {
        return "Corn";
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
     * Harvest Corn.
     */
    public static void harvest() {
        System.out.println("You harvested Corn! (+$6)");
        Farm.setCurrency(6);
        Farm.setCurrencyChange(6);
    }
    

}