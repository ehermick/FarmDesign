package affinities;

import crops.Crops;
import factory.Farm;

public class DecoratorProdRice extends Crops {
    
    /**
     * Extra producing rice.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorProdRice(String nameInput, int healthInput, int ageInput, 
            int harvestCycleInput, int productionInput) {
        name = nameInput;
        health = healthInput;
        age = ageInput;
        harvestCycle = harvestCycleInput;
        //production = productionInput;
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
        return 0;
    }

    @Override
    public int production() {
        return 2;
    }
    
    /**
     * Harvest Rice.
     */
    public static void harvest() {
        System.out.println("You SUPER harvested Rice! (+$6)");
        Farm.setCurrency(6);
        Farm.setCurrencyChange(6);
    }

}