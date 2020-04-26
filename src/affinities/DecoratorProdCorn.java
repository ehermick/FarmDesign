package affinities;

import crops.Crops;
import farm.Farm;

public class DecoratorProdCorn extends Crops {
    
    /**
     * Extra producing corn.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorProdCorn(String nameInput, int healthInput, int ageInput, 
            int harvestCycleInput, int productionInput) {
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
        return 0;
    }

    @Override
    public int production() {
        return 2;
    }
    
    /**
     * Harvest Corn.
     */
    public static void harvest() {
        System.out.println("You SUPER harvested Corn! (+$12)");
        Farm.setCurrency(12);
        Farm.setCurrencyChange(12);
    }

}
