package affinities;

public class MoreProduce extends AnimalAffinities {

    /**
     * Decorator Pattern - More production by animal. 
     * @param name Animal's name
     * @param health Animal's health
     * @param age Animal's age
     * @param birthCycle Animal's birthcycle
     * @param harvestCycle Animal's harvest cycle
     */
    public MoreProduce(String name, int health, int age, int birthCycle, int harvestCycle) {
        
        //Better production
        super(name, health, age, birthCycle, harvestCycle);
    }
    

}
