package crops;

import farm.Farm;

public class Wheat extends Crops {
    
    /**
     * Each harvest makes the farm $9.
     */
    public static void harvestWheat() {
        
        System.out.println("You harvested Wheat! (+$9)");
        Farm.setCurrency(9);
        Farm.setCurrencyChange(9);
    }
    
    @Override
    public String name() {
        return "Wheat";
    }

    @Override
    public int health() {
        return 100;
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
