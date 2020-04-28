package main;

import animals.Animal;
import crops.Crops;
import factory.Farm;

import java.util.ArrayList;

//import affinities.FarmerAffinities;
//import farm.Farm;

public class Farmers {
    public String name;
    
    private static ArrayList<Crops> crops = Farm.getCrops();
    private static ArrayList<Animal> animals = Farm.getAnimals();
    
    private static int numDamagedCrops;
    private static int numInjuredAnimals;
    
    /**
     * Constructor.
     * @param name Farmer's name
     */
    public Farmers(String name) {
        this.name = name;
    }
    
    public static void setNumDamagedCrops(int num) {
        numDamagedCrops = numDamagedCrops + num;
    }
    
    public static void setNumInjuredAnimals(int num) {
        numInjuredAnimals = numInjuredAnimals + num;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }


    /**
     * Treat animals that are injured - $10.
     */
    public static void treatAnimal() {
        
        for (int i = 0; i < numInjuredAnimals; i++) {
            Farm.setCurrency(-10);
            Farm.setCurrencyChange(-10);
        }
        
        if (numInjuredAnimals > 1) {
            System.out.println("You treated " + numInjuredAnimals 
                    + " injured animals from last night " + "(-$" + (numInjuredAnimals * 10) + ")");
        } else if (numInjuredAnimals == 1) {
            System.out.println("You treated " + numInjuredAnimals 
                    + " injured animal from last night " + "(-$" + (numInjuredAnimals * 10) + ")");
        }
       
        //Reset animal's health
        for (int i = 0; i < animals.size(); i++) {
            Animal selectedAnimal = animals.get(i);
            
            //Only for animals with health less than 100 
            if (selectedAnimal.getHealth() < 100) {
                selectedAnimal.setHealth(100);
            }
        }
        
        //Reset counter
        numInjuredAnimals = 0;
        
    }

    /**
     * Treat crops that are damaged - $5.
     */
    public static void treatCrop() {
    
        for (int i = 0; i < numDamagedCrops; i++) {
            Farm.setCurrency(-5);
            Farm.setCurrencyChange(-5);
        }
            
        if (numDamagedCrops > 1) {
            System.out.println("You treated " + numDamagedCrops 
                    + " damaged crops from last night " + "(-$" + (numDamagedCrops * 5) + ")");
        } else if (numDamagedCrops == 1) {
            System.out.println("You treated " + numDamagedCrops 
                    + " damaged crop from last night " + "(-$" + (numDamagedCrops * 5) + ")");
        }
            
        //Reset crop's health
        for (int i = 0; i < crops.size(); i++) {
            Crops selectedCrop = crops.get(i);
            
            //Only for crops with health less than 100
            if (selectedCrop.getHealth() < 100) {
                selectedCrop.setHealth(100);
            }
        }
        
        //Reset counter
        numDamagedCrops = 0;

    }



}
