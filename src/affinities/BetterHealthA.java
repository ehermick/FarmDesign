package affinities;

//DECORATOR PATTERN
public class BetterHealthA extends AnimalAffinities {

    /**
     * Decorator pattern.
     * @param name Animal's name
     * @param health Animal's health
     * @param age Animal's age
     * @param birthCycle Animal's birth cycle
     * @param harvestCycle Animal's harvest cycle
     */
    public BetterHealthA(String name, int health, int age, int birthCycle, int harvestCycle) {
        
        //Larger starting health
        super(name, 150, age, birthCycle, harvestCycle);
    }
    
    /**
     * Sets the heath for the animal.
     */
    public void setHealth() {
        setHealth(150);
    }

}
