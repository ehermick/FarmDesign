package animals;

import farm.Farm;

import java.util.ArrayList;

public class Chicken extends Animal {
    
    private static ArrayList<Animal> animals = Farm.getAnimals();
    


    /**
     * Each egg makes the farm $5.
     */
    public static void harvestEggs() {

        System.out.println("You harvested Eggs! (+$5)");
        Farm.setCurrency(5);
        Farm.setCurrencyChange(5);
        
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
        return 1;
    }
    
}
