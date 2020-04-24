package predators;

import java.util.Random;

//import farm.Farm;

//import java.util.ArrayList;

public class Predators {

    //private int damageAmount;
    // private ArrayList<Farm> farm;
    
    public String name;
    public static int animalDamage;
    
    static Random rand = new Random();
    
    public Predators(String name, int damage) {
        this.name = name;
        this.setDamage(damage);
    }
    
    public static void setDamage(int damage) {
        Predators.animalDamage = damage;
    }

    /**
     * Damage dealt to animals.
     */
    public static void damage() {
        
        Fox.damage();
        Wolf.damage();
        Mole.damage();
        Rabbit.damage();
    }
    
    /**
     * Eat animals.
     */
    public static void eat() {
        
        Fox.eatAnimal();
        Wolf.eatAnimal();
        Mole.eatCrop();
        Rabbit.eatCrop();
    }
    
    /**
     * Sets the predator's name.
     * @param nameInput Name
     */
    public void setName(String nameInput) {
        name = nameInput;
    }
    
    /**
     * Returns predator's name.
     * @return name Name
     */
    public String getName() {
        return name;
    }
    

    
    


}
