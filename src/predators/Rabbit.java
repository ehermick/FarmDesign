package predators;

import crops.Corn;
import crops.Crops;
import crops.Rice;
import crops.Wheat;
import farm.Farm;

import java.util.ArrayList;
import java.util.Random;

public class Rabbit extends Predators {
    
    
    static Random rand = new Random();
    
    private static ArrayList<Crops> crops = Farm.getCrops();

    public Rabbit(String name, int damage) {
        super(name, damage);
    }
    
    /**
     * Damage Crops.
     */
    public static void damage() {

    }
    
    /**
     * Eat Crops.
     */
    public static void eatCrop() {
        
        int chance = rand.nextInt(10); //Generate random number for chance
        
        for (int i = 0; i < crops.size(); i++) {
            Crops selectedCrop = crops.get(i);
            
            //Eat Corn
            if (selectedCrop instanceof Corn && chance == 2) {
                Farm.removeCrop(selectedCrop);
                System.out.println("A Rabbit ate a plot of corn");
            }
            
            //Eat Rice
            if (selectedCrop instanceof Rice && chance == 4) {
                Farm.removeCrop(selectedCrop);
                System.out.println("A Rabbit ate a plot of rice");
            }
            
            //Eat Wheat
            if (selectedCrop instanceof Wheat && chance == 6) {
                Farm.removeCrop(selectedCrop);
                System.out.println("A Rabbit ate a plot of wheat");
            }
        }
            
        
    }

}
