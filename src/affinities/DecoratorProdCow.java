package affinities;

import animals.Animal;
import factory.Farm;

//DECORATOR PATTERN
public class DecoratorProdCow extends Animal {
    
    /**
     * Extra producing cow.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param birthCycleInput Birth cycle
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorProdCow(String nameInput, int healthInput, int ageInput, 
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
        return 2;
    }
    
    /**
     * Harvest from Cow.
     */
    public static void harvest() {
        System.out.println("You SUPER harvested Milk! (+$20)");
        Farm.setCurrency(20);
        Farm.setCurrencyChange(20);
    }

}