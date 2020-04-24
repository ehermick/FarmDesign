package affinities;


//DECORATOR PATTERN
public class BetterHealthC extends CropAffinities {

    public BetterHealthC(String name, int health, int age, int harvestCycle, int production) {
        
        //Larger starting health
        super(name, 150, age, harvestCycle, production);
    }
    
    public void setHealth() {
        setHealth(150);
    }

}
