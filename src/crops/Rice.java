package crops;

import factory.Farm;

public class Rice extends Crops {

    /**
     * Each harvest makes the farm $3.
     */
    public static void harvestRice() {
        System.out.println("You harvested Rice! (+$3)");
        Farm.setCurrency(3);
        Farm.setCurrencyChange(3);
    }
    
    @Override
    public String name() {
        return "Rice";
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
