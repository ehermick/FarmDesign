package affinities;

import crops.Crops;

//DECORATOR PATTERN
public class DecoratorHealthWheat extends Crops {
    
    /**
     * Extra healthy wheat.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorHealthWheat(String nameInput, int healthInput, int ageInput, 
            int harvestCycleInput, int productionInput) {
        name = nameInput;
        Crops.setHealth(healthInput);
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
        return 150;
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