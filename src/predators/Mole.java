package predators;

import animals.Animal;

import animals.Chicken;
import animals.Cow;
import animals.Sheep;

import crops.Corn;
import crops.Crops;
import crops.Rice;
import crops.Wheat;

import farm.Farm;

import java.util.ArrayList;
import java.util.Random;

public class Mole extends Predators {
    
    static Random rand = new Random();
    
    private static ArrayList<Crops> crops = Farm.getCrops();

    public Mole(String name, int damage) {
        super(name, damage);
    }
    
    /**
     * Damage Crops.
     */
    public static void damage() {
        int chance = rand.nextInt(10); //Generate random number for chance
        
        for (int i = 0; i < crops.size(); i++) {
            Crops selectedCrop = crops.get(i);
            
            if (selectedCrop instanceof Corn && chance == 2) {
                Crops.damageHealth(Predators.animalDamage);
                System.out.println("A Mole damaged corn");
            } else if (selectedCrop instanceof Rice && chance == 4) {
                Crops.damageHealth(Predators.animalDamage);
                System.out.println("A Mole damaged rice");
            } else if (selectedCrop instanceof Wheat && chance == 6) {
                Crops.damageHealth(Predators.animalDamage);
                System.out.println("A Mole damaged wheat");
            } 
        }
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
                System.out.println("A Mole ate a plot of corn");
            }
            
            //Eat Rice
            if (selectedCrop instanceof Rice && chance == 4) {
                Farm.removeCrop(selectedCrop);
                System.out.println("A Mole ate a plot of rice");
            }
            
            //Eat Wheat
            if (selectedCrop instanceof Wheat && chance == 6) {
                Farm.removeCrop(selectedCrop);
                System.out.println("A Mole ate a plot of wheat");
            }
        }
            
        
    }
    

}
