package affinities;

import animals.Animal;

//DECORATOR PATTERN
public class DecoratorHealthChicken extends Animal {

    public DecoratorHealthChicken(String nameInput, int healthInput, int ageInput, int birthCycleInput, int harvestCycleInput, int productionInput) {
        name = nameInput;
        health = healthInput;
        age = ageInput;
        birthCycle = birthCycleInput;
        harvestCycle = harvestCycleInput;
        production = productionInput;
        
    }
    
    @Override
    public int health() {
        return 150;
    }

    @Override
    public String name() {
        return "Chicken";
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