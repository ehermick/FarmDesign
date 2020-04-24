package crops;

//import affinities.CropAffinities;
//import farm.CropFarm;
//import farm.HybridFarm;
import state.StateContext;

public class Crops {

    public int health;
    //private int productWorth;
    //private int dayLastHarvested;
    //private CropFarm cropFarm;
    //private HybridFarm hybridFarm;
    //private CropAffinities cropAffinities;
    public String name;
    public int age;
    public int harvestCycle = 0;
    //public int production;
    
    /**
     * Crop Constructor.
     * @param name Crop name
     * @param health Crop health
     * @param age Crop age
     * @param harvestCycle Crop harvestCycle
     */
    public Crops(String name, int health, int age, int harvestCycle, int production) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.harvestCycle = harvestCycle;
        //this.production = production;
    }
    
    public static int cropAge(Crops crop) {
        int calculatedAge = StateContext.getCount() / 2; //1 day + 1 night per cycle
        return crop.age = calculatedAge;
    }

    /**
     * Harvest the crops.
     */
    public static void harvest(Crops crop) {
        
        //If crop is corn
        if (crop instanceof Corn) {
            Corn.harvestCorn();
        } else if (crop instanceof Rice) { //If crop is Rice
            Rice.harvestRice();
        } else if (crop instanceof Wheat) { //If crop is Wheat
            Wheat.harvestWheat();
        }

    }
    
    /**
     * Age getter.
     * @return age Crop's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Age setter. 
     * @param age Crop's age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Health getter.
     * @return health Crop's health
     */
    public int getHealth() {
        return health;
    }
    
    /**
     * Health setter.
     * @param health Crop's health
     */
    public void setHealth(int health) {
        this.health = health;
    }
    
    /**
     * Name getter.
     * @return name Crop's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Name setter.
     * @param name Crop's name
     */
    public void setName(String name) {
        this.name = name;
    }

}
