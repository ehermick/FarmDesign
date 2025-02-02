package animals;

import affinities.DecoratorAgeHarvestChicken;
import affinities.DecoratorAgeHarvestCow;
import affinities.DecoratorAgeHarvestSheep;
import affinities.DecoratorProdChicken;
import affinities.DecoratorProdCow;
import affinities.DecoratorProdSheep;
//import affinities.AnimalAffinities;
//import farm.AnimalFarm;
//import farm.HybridFarm;

import state.StateContext;

public abstract class Animal {

    public String name;
    public int age;
    public int health;
    public int birthCycle;
    public int harvestCycle;
    //public int production;
    
    public abstract String name();
    
    public abstract int health();
    
    public abstract int age();
    
    public abstract int birthCycle();
    
    public abstract int harvestCycle();
    
    public abstract int production();

    /**
     * Calculates the age of the animal based off the number of cycles.
     * @param animal The animal in question
     */
    public static int animalAge(Animal animal) {
        int calculatedAge = StateContext.getCount() / 2; //1 day + 1 night per cycle
        return animal.age = calculatedAge;
        
       
    }
    
    /**
     * Animals harvest their products.
     */
    public static void harvest(Animal animal) {
        
        //If animal is a chicken
        if (animal instanceof Chicken) {
            Chicken.harvestEggs();
        }
        
        //If animal is a cow
        if (animal instanceof Cow) {
            Cow.harvestMilk();
        }
        
        //If animal is a sheep
        if (animal instanceof Sheep) {
            Sheep.harvestWool();
        }
        
        
        if (animal instanceof DecoratorAgeHarvestChicken) {
            DecoratorAgeHarvestChicken.harvest();
        }
        
        if (animal instanceof DecoratorAgeHarvestCow) {
            DecoratorAgeHarvestCow.harvest();
        }
        
        if (animal instanceof DecoratorAgeHarvestSheep) {
            DecoratorAgeHarvestSheep.harvest();
        }
        
        if (animal instanceof DecoratorProdChicken) {
            DecoratorProdChicken.harvest();
        }
        
        if (animal instanceof DecoratorProdCow) {
            DecoratorProdCow.harvest();
        }
        
        if (animal instanceof DecoratorProdSheep) {
            DecoratorProdSheep.harvest();
        }

    }

    /**
     * Damage done by predators.
     * @param damage Damage done
     */
    public  void damageHealth(int damage) {
        int newHealth = health - damage;
        health = newHealth;
    }
    
    /**
     * Health getter. 
     * @return health Animal's health
     */
    public  int getHealth() {
        return health;
    }

    /**
     * Healther setter.
     * @param healthInput Animal's health
     */
    public void setHealth(int healthInput) {
        health = healthInput;
    }
    
    /**
     * Age getter.
     * @return age Animal's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Age setter.
     * @param age Animal's age
     */
    public void setAge(int age) {
        this.age = age;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

}
