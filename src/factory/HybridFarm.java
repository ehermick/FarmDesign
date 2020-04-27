package factory;

import animals.Animal;
//import animals.Chicken;
//import animals.Cow;
//import animals.Sheep;
import crops.Crops;

import java.util.ArrayList;
//import java.util.Random;


public class HybridFarm extends Farm {

    public HybridFarm() {
        super(FarmType.HYBRID, 0, 0);
    }

    //private int numAnimals;
    //private int numCrops;
    //private int maxNumAnimals;
    //private int maxNumCrops;
    static ArrayList<Crops> crops = new ArrayList<Crops>();
    static ArrayList<Animal> animals = new ArrayList<Animal>();
    
    //public int birthCycle;


}
