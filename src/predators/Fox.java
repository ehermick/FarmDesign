package predators;

import affinities.DecoratorAgeHarvestChicken;
import affinities.DecoratorAgeHarvestCow;
import affinities.DecoratorAgeHarvestSheep;
import affinities.DecoratorHealthChicken;
import affinities.DecoratorHealthCow;
import affinities.DecoratorHealthSheep;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;

import farm.Farm;

import java.util.ArrayList;
import java.util.Random;

import main.Farmers;


public class Fox extends Predators {
    static Random rand = new Random();
    
    private static ArrayList<Animal> animals = Farm.getAnimals();
    
    private static boolean damagedAnimal = false;

    public Fox(String name, int animalDamage) {
        super(name, animalDamage);
    }
    
    /**
     * Damage Animals.
     */
    public static void damage() {
        int chance = rand.nextInt(10); //Generate random number for chance
        
        for (int i = 0; i < animals.size(); i++) {
            Animal selectedAnimal = animals.get(i);
            
            if ((selectedAnimal instanceof Chicken 
                    || selectedAnimal instanceof DecoratorAgeHarvestChicken 
                    || selectedAnimal instanceof DecoratorHealthChicken) && chance == 2) {
                Animal.damageHealth(Predators.getDamage());
                System.out.println("A Fox injured a chicken");
                damagedAnimal = true;
            } else if ((selectedAnimal instanceof Cow 
                    || selectedAnimal instanceof DecoratorAgeHarvestCow 
                    || selectedAnimal instanceof DecoratorHealthCow) && chance == 4) {
                Animal.damageHealth(Predators.getDamage());
                System.out.println("A Fox injured a cow");
                damagedAnimal = true;
            } else if ((selectedAnimal instanceof Sheep 
                    || selectedAnimal instanceof DecoratorAgeHarvestSheep 
                    || selectedAnimal instanceof DecoratorHealthSheep) && chance == 6) {
                Animal.damageHealth(Predators.getDamage());
                System.out.println("A Fox injured a sheep");
                damagedAnimal = true;
            } 
            
        }
    }
    
    /**
     * Heals damage dealt.
     */
    public static void healDamage() {
        if (damagedAnimal == true) {
            Farmers.treatAnimal();
        }
    }
    
    /**
     * Eat Animals.
     */
    public static void eatAnimal() {
        
        int chance = rand.nextInt(10); //Generate random number for chance
        
        for (int i = 0; i < animals.size(); i++) {
            Animal selectedAnimal = animals.get(i);
            
            //Attack Chicken
            if (selectedAnimal instanceof Chicken && chance == 2) {
                Farm.removeAnimal(selectedAnimal);
                System.out.println("A Fox ate a chicken");
            } else if (selectedAnimal instanceof Cow && chance == 4) {
                Farm.removeAnimal(selectedAnimal);
                System.out.println("A Fox ate a cow");
            } else if (selectedAnimal instanceof Sheep && chance == 6) {
                Farm.removeAnimal(selectedAnimal);
                System.out.println("A Fox ate a sheep");
            } 
        }
            
        
    }

}
