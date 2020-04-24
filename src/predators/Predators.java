package predators;

import java.util.Random;

//import farm.Farm;

//import java.util.ArrayList;

public class Predators {

    //private int damageAmount;
    // private ArrayList<Farm> farm;
    
    public String name;
    public int damage;
    
    static Random rand = new Random();
    
    public Predators(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    /**
     * Damage dealt to animals.
     */
    public void damage(Predators predator) {
        
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
    
    /**
     * Sets the predator's damage.
     * @param damageInput Damage
     */
    public void setDamage(int damageInput) {
        damage = damageInput;
    }
    
    /**
     * Returns predator's damage.
     * @return damage Damage
     */
    public int getDamage() {
        return damage;
    }
    
    


}
