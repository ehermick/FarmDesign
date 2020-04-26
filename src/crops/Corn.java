package crops;

import farm.Farm;

public class Corn extends Crops {
    
    
    /**
     * Each harvest makes the farm $6.
     */
    public static void harvestCorn() {
        
        System.out.println("You harvested Corn! (+$6)");
        Farm.setCurrency(6);
        Farm.setCurrencyChange(6);
    }

    @Override
    public String name() {
        return "Corn";
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
