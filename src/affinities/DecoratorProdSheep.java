package affinities;

import animals.Animal;
import farm.Farm;

//DECORATOR PATTERN
public class DecoratorProdSheep extends Animal {
    
    /**
     * Extra producing sheep.
     * @param nameInput Name
     * @param healthInput Health
     * @param ageInput Age
     * @param birthCycleInput Birth cycle
     * @param harvestCycleInput Harvest cycle
     * @param productionInput Production
     */
    public DecoratorProdSheep(String nameInput, int healthInput, int ageInput, 
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
        return 100;
    }

    @Override
    public String name() {
        return "Sheep";
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
        System.out.println("You SUPER harvested Wool! (+$40)");
        Farm.setCurrency(40);
        Farm.setCurrencyChange(40);
    }

}
