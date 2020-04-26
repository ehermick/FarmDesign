package crops;

import affinities.DecoratorProdCorn;
import affinities.DecoratorProdRice;
import affinities.DecoratorProdWheat;
//import affinities.CropAffinities;
//import farm.CropFarm;
//import farm.HybridFarm;
import state.StateContext;
import affinities.DecoratorHarvestCorn;
import affinities.DecoratorHarvestRice;
import affinities.DecoratorHarvestWheat;

public abstract class Crops {

    public static int health;
    //private int productWorth;
    //private int dayLastHarvested;
    //private CropFarm cropFarm;
    //private HybridFarm hybridFarm;
    //private CropAffinities cropAffinities;
    public String name;
    public int age;
    public int harvestCycle = 0;
    public int production;
    

    public abstract String name();
    public abstract int health();
    public abstract int harvestCycle();
    public abstract int production();
    
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
        
        if (crop instanceof DecoratorProdCorn) {
            DecoratorProdCorn.harvest();
        }
        
        if (crop instanceof DecoratorProdRice) {
            DecoratorProdRice.harvest();
        }
        
        if (crop instanceof DecoratorProdWheat) {
            DecoratorProdWheat.harvest();
        }
        
        if (crop instanceof DecoratorHarvestCorn) {
            DecoratorHarvestCorn.harvest();
        }
        
        if (crop instanceof DecoratorHarvestRice) {
            DecoratorHarvestRice.harvest();
        }
        
        if (crop instanceof DecoratorHarvestWheat) {
            DecoratorHarvestWheat.harvest();
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
    
    public static void damageHealth(int damage) {
        int newHealth = health - damage;
        setHealth(newHealth);
    }
    
    /**
     * Health getter.
     * @return health Crop's health
     */
    public static int getHealth() {
        return health;
    }
    
    /**
     * Health setter.
     * @param health Crop's health
     */
    public static void setHealth(int health) {
        Crops.health = health;
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
