package affinities;

import crops.Crops;
import farm.Farm;

public class DecoratorProdWheat extends Crops {
    
    /**
     * Extra producing wheat.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorProdWheat(String nameInput, int healthInput, int ageInput, 
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
        return 0;
    }

    @Override
    public int production() {
        return 2;
    }
    
    /**
     * Harvest Wheat.
     */
    public static void harvest() {
        System.out.println("You SUPER harvested Wheat! (+$18)");
        Farm.setCurrency(18);
        Farm.setCurrencyChange(18);
    }

}
