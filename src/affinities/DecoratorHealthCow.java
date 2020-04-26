package affinities;

import animals.Animal;

//DECORATOR PATTERN
public class DecoratorHealthCow extends Animal {

    /**
     * Extra healthy cow.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param birthCycleInput Birth cycle
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorHealthCow(String nameInput, int healthInput, int ageInput, 
            int birthCycleInput, int harvestCycleInput, int productionInput) {
        name = nameInput;
        Animal.setHealth(healthInput);
        age = ageInput;
        birthCycle = birthCycleInput;
        harvestCycle = harvestCycleInput;
        //production = productionInput;
        
    }
    
    @Override
    public int health() {
        return 150;
    }

    @Override
    public String name() {
        return "Cow";
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