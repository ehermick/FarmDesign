package main;

import animals.Animal;
import animals.Chicken;
import crops.Crops;
import farm.Farm;

import java.util.ArrayList;

//import affinities.FarmerAffinities;
//import farm.Farm;

public class Farmers {
    public String name;
    public int animalSkill;
    public int cropSkill;
    public int moneySkill;
    
    private static ArrayList<Crops> crops = Farm.getCrops();
    private static ArrayList<Animal> animals = Farm.getAnimals();
    
    /**
     * Constructor.
     * @param name Farmer's name
     * @param animalSkill Farmer's skill with animals
     * @param cropSkill Farmer's skill with crops
     * @param moneySkill Farmer's skill with money
     */
    public Farmers(String name, int animalSkill, int cropSkill, int moneySkill) {
        this.name = name;
        this.animalSkill = animalSkill;
        this.cropSkill = cropSkill;
        this.moneySkill = moneySkill;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAnimalSkill(int skill) {
        this.animalSkill = skill;
    }
    
    public int getAnimalSkill() {
        return animalSkill;
    }
    
    public void setCropSkill(int skill) {
        this.cropSkill = skill;
    }
    
    public int getCropSkill() {
        return cropSkill;
    }
    
    public void setMoneySkill(int skill) {
        this.moneySkill = skill;
    }

    public int getMoneySkill() {
        return moneySkill;
    }

    /**
     * Treat animals that are injured - $10.
     */
    public static void treatAnimal() {

        Farm.setCurrency(-10);
        Farm.setCurrencyChange(-10);
        System.out.println("You treated an injured animal (-$10)");
                
        //Reset animal's health
        Animal.setHealth(100); 
    }

    /**
     * Treat crops that are damaged - $5.
     */
    public static void treatCrop() {
    
        Farm.setCurrency(-5);
        Farm.setCurrencyChange(-5);
            
        System.out.println("You treated a damaged crop (-$5)");
            
        //Reset crop's health
        Crops.setHealth(100);

    }



}
