package predators;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;

import farm.Farm;

import java.util.ArrayList;
import java.util.Random;


public class Fox extends Predators {
    static Random rand = new Random();
    
    private static ArrayList<Animal> animals = Farm.getAnimals();

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
            
            if (selectedAnimal instanceof Chicken && chance == 2) {
                Animal.damageHealth(Predators.animalDamage);
                System.out.println("A Fox injured a chicken");
            } else if (selectedAnimal instanceof Cow && chance == 4) {
                Animal.damageHealth(Predators.animalDamage);
                System.out.println("A Fox injured a cow");
            } else if (selectedAnimal instanceof Sheep && chance == 6) {
                Animal.damageHealth(Predators.animalDamage);
                System.out.println("A Fox injured a sheep");
            } 
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
