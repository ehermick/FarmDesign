package affinities;

import animals.Animal;
import factory.Farm;

//DECORATOR PATTERN
public class DecoratorProdChicken extends Animal {
    
    /**
     * Extra producing chicken.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param birthCycleInput Birth cycle
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorProdChicken(String nameInput, int healthInput, int ageInput, 
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
        return 2;
    }
    
    /**
     * Harvest from Chicken.
     */
    public static void harvest() {
        System.out.println("You SUPER harvested Eggs! (+$10)");
        Farm.setCurrency(10);
        Farm.setCurrencyChange(10);
    }

}
