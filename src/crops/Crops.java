package crops;

import affinities.CropAffinities;
import farm.CropFarm;
import farm.HybridFarm;
import state.StateContext;

public class Crops {

    public int health;
    private int productWorth;
    private int dayLastHarvested;
    private CropFarm cropFarm;
    private HybridFarm hybridFarm;
    private CropAffinities cropAffinities;
    public String name;
    public int age;
    public int harvestCycle = 0;
    
    /**
     * Crop Constructor.
     * @param name Crop name
     * @param health Crop health
     * @param age Crop age
     * @param harvestCycle Crop harvestCycle
     */
    public Crops(String name, int health, int age, int harvestCycle) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.harvestCycle = harvestCycle;
    }
    
    public static int cropAge(Crops crop) {
        int calculatedAge = StateContext.count / 2; //1 day + 1 night per cycle
        return crop.age = calculatedAge;
    }

    /**
     * Harvest the crops.
     */
    public static void harvest(Crops crop) {
        
        //If crop is corn
        if (crop instanceof Corn) {
            Corn.harvestCorn();
        }
        
        //If crop is Rice
        if (crop instanceof Rice) {
            Rice.harvestRice();
        }
        
        //If crop is Wheat
        if (crop instanceof Wheat) {
            Wheat.harvestWheat();
        }

    }

}
