package affinities;


//DECORATOR PATTERN
public class BetterHealthC extends CropAffinities {

    /**
     * Decorator pattern - Crop with better health.
     * @param name Crop's name
     * @param health Crop's health
     * @param age Crop's age
     * @param harvestCycle Crop's harvestcycle
     * @param production Crop's production amount
     */
    public BetterHealthC(String name, int health, int age, int harvestCycle, int production) {
        
        //Larger starting health
        super(name, 150, age, harvestCycle, production);
    }
    
    /**
     * Sets the crop's health.
     */
    public void setHealth() {
        setHealth(150);
    }

}
