package affinities;

import crops.Crops;

//DECORATOR PATTERN
public class DecoratorHealthRice extends Crops {
    
    public DecoratorHealthRice(String nameInput, int healthInput, int ageInput, int harvestCycleInput, int productionInput) {
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