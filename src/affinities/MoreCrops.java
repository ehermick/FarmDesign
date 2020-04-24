package affinities;

public class MoreCrops extends CropAffinities {

    public MoreCrops(String name, int health, int age, int harvestCycle, int production) {
        
        //Better production
        super(name, health, age, harvestCycle, 2);
    }

}
