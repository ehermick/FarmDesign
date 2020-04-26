package affinities;

import animals.Animal;
import farm.Farm;

//DECORATOR PATTERN
public class DecoratorAgeHarvestCow extends Animal {

    /**
     * Harvests from old enough animal.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param birthCycleInput Birth cycle
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorAgeHarvestCow(String nameInput, int healthInput, int ageInput, 
            int birthCycleInput, int harvestCycleInput, int productionInput) {
        name = nameInput;
        health = healthInput;
        age = ageInput;
        birthCycle = birthCycleInput;
        harvestCycle = harvestCycleInput;
        //production = productionInput;
        
    }
    
    @Override
    public int health() {
        return 100;
    }

    @Override
    public String name() {
        return "Cow";
    }

    @Override
    public int age() {
        return 3;
    }

    @Override
    public int birthCycle() {
        return 0;
    }

    @Override
    public int harvestCycle() {
        return 2;
    }
    
    /**
     * Harvest from cow.
     */
    public static void harvest() {
        System.out.println("You harvested Milk! (+$10)");
        Farm.setCurrency(10);
        Farm.setCurrencyChange(10);
        
    }

    @Override
    public int production() {
        return 1;
    }

}