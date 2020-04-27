package predators;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import factory.Farm;

import java.util.ArrayList;
import java.util.Random;

import main.Farmers;

public class Wolf extends Predators {
    
    static Random rand = new Random();
    
    private static ArrayList<Animal> animals = Farm.getAnimals();
    
    private static boolean damagedAnimal = false;

    public Wolf(String name, int damage) {
        super(name, damage);
    }
    
    /**
     * Damage Animals.
     */
    public static void damage() {
        
        for (int i = 0; i < animals.size(); i++) {
            int chance = rand.nextInt(10); //Generate random number for chance
            
            Animal selectedAnimal = animals.get(i);
            
            if (selectedAnimal instanceof Chicken && chance == 2) {
                selectedAnimal.damageHealth(Predators.getDamage());
                System.out.println("A Wolf injured a chicken");
                Farmers.setNumInjuredAnimals(1);
                damagedAnimal = true;
            } else if (selectedAnimal instanceof Cow && chance == 4) {
                selectedAnimal.damageHealth(Predators.getDamage());
                System.out.println("A Wolf injured a cow");
                Farmers.setNumInjuredAnimals(1);
                damagedAnimal = true;
            } else if (selectedAnimal instanceof Sheep && chance == 6) {
                selectedAnimal.damageHealth(Predators.getDamage());
                System.out.println("A Wolf injured a sheep");
                Farmers.setNumInjuredAnimals(1);
                damagedAnimal = true;
            } 
        }
    }

    
    /**
     * Eat Animals.
     */
    public static void eatAnimal() {
        
        for (int i = 0; i < animals.size(); i++) {
            int chance = rand.nextInt(10); //Generate random number for chance
            
            Animal selectedAnimal = animals.get(i);
            
            //Attack Chicken
            if (selectedAnimal instanceof Chicken && chance == 2) {
                Farm.removeAnimal(selectedAnimal);
                System.out.println("A Wolf ate a chicken");
            }
            
            //Attack Cow
            if (selectedAnimal instanceof Cow && chance == 4) {
                Farm.removeAnimal(selectedAnimal);
                System.out.println("A Wolf ate a cow");
            }
            
            //Attack Sheep
            if (selectedAnimal instanceof Sheep && chance == 6) {
                Farm.removeAnimal(selectedAnimal);
                System.out.println("A Wolf ate a sheep");
            }

        }
            
        
    }

}
