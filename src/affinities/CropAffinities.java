package affinities;

import crops.Crops;

//DECORATOR PATTERN
public class CropAffinities extends Crops {

    public CropAffinities(String name, int health, int age, int harvestCycle, int production) {
        super(name, health, age, harvestCycle, production);
    }

    //private Crops crops;

}
