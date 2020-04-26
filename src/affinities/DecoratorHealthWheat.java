package affinities;

import crops.Crops;

//DECORATOR PATTERN
public class DecoratorHealthWheat extends Crops {
    
    public DecoratorHealthWheat(String nameInput, int healthInput, int ageInput, int harvestCycleInput, int productionInput) {
        name = nameInput;
        health = healthInput;
        age = ageInput;
        harvestCycle = harvestCycleInput;
        production = productionInput;
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