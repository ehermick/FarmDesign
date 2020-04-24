package affinities;

public class MoreCrops extends CropAffinities {

    /**
     * Decorator pattern - More produced by crop.
     * @param name Crop's name
     * @param health Crop's health
     * @param age Crop's age
     * @param harvestCycle Crop's harvest cycle
     * @param production Crop's production
     */
    public MoreCrops(String name, int health, int age, int harvestCycle, int production) {
        
        //Better production
        super(name, health, age, harvestCycle, 2);
    }

}
