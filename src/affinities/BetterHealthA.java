package affinities;

//DECORATOR PATTERN
public class BetterHealthA extends AnimalAffinities {

    public BetterHealthA(String name, int health, int age, int birthCycle, int harvestCycle) {
        
        //Larger starting health
        super(name, 150, age, birthCycle, harvestCycle);
    }
    
    public void setHealth() {
        setHealth(150);
    }

}
