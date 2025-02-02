package predators;

import affinities.DecoratorHealthCorn;
import affinities.DecoratorHealthRice;
import affinities.DecoratorHealthWheat;

import crops.Corn;
import crops.Crops;
import crops.Rice;
import crops.Wheat;
import factory.Farm;

import java.util.ArrayList;
import java.util.Random;

import main.Farmers;

public class Mole extends Predators {
    
    static Random rand = new Random();
    
    private static ArrayList<Crops> crops = Farm.getCrops();
    
    private static boolean damagedCrop = false; 

    public Mole(String name, int damage) {
        super(name, damage);
    }
    
    /**
     * Damage Crops.
     */
    public static void damage() {
        
        for (int i = 0; i < crops.size(); i++) {
            int chance = rand.nextInt(10); //Generate random number for chance
            
            Crops selectedCrop = crops.get(i);
            
            if ((selectedCrop instanceof Corn 
                    || selectedCrop instanceof DecoratorHealthCorn) 
                    && chance == 2) {
                selectedCrop.damageHealth(Predators.getDamage());
                System.out.println("A Mole damaged a plot of corn");
                Farmers.setNumDamagedCrops(1);

            } else if ((selectedCrop instanceof Rice 
                    || selectedCrop instanceof DecoratorHealthRice) 
                    && chance == 4) {
                selectedCrop.damageHealth(Predators.getDamage());
                System.out.println("A Mole damaged a plot of rice");
                Farmers.setNumDamagedCrops(1);
            } else if ((selectedCrop instanceof Wheat 
                    || selectedCrop instanceof DecoratorHealthWheat) 
                    && chance == 6) {
                selectedCrop.damageHealth(Predators.getDamage());
                System.out.println("A Mole damaged a plot of wheat");
                Farmers.setNumDamagedCrops(1);
            } 
        }
    }
    
    /**
     * Eat Crops.
     */
    public static void eatCrop() {
        
        for (int i = 0; i < crops.size(); i++) {
            int chance = rand.nextInt(10); //Generate random number for chance
            
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
