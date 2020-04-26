package affinities;

import animals.Animal;
import farm.Farm;

//DECORATOR PATTERN
public class DecoratorAgeHarvestChicken extends Animal {

    public DecoratorAgeHarvestChicken(String nameInput, int healthInput, int ageInput, int birthCycleInput, int harvestCycleInput, int productionInput) {
        name = nameInput;
        health = healthInput;
        age = ageInput;
        birthCycle = birthCycleInput;
        harvestCycle = harvestCycleInput;
        production = productionInput;
        
    }
    
    @Override
    public int health() {
        return 100;
    }

    @Override
    public String name() {
        return "Chicken";
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
     * Harvest from chicken.
     */
    public static void harvest() {
        System.out.println("You harvested Eggs! (+$5)");
        Farm.setCurrency(5);
        Farm.setCurrencyChange(5);
        
    }

    @Override
    public int production() {
        return 1;
    }

}