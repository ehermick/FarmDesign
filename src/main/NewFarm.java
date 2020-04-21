package main;

import animals.*;
import crops.*;
import main.*;

import farm.HybridFarm;

public class NewFarm {
    
    public static void buildFarm() {
        Chicken chicken = new Chicken("Chicken", 100, 0, 0);
        Cow cow = new Cow("Chicken", 100, 0, 0);
        Sheep sheep = new Sheep("Sheep", 100, 0, 0);
        
        Corn corn = new Corn();
        Rice rice = new Rice();
        Wheat wheat = new Wheat();
        
        Farmers farmer = new Farmers();
        
        //Start with 1 hybrid farm
        HybridFarm hbFarm = new HybridFarm();
        hbFarm.setSize(10); //Start with 10 acres
        System.out.println("Congratulations on purchasing your first farm!");
        System.out.println("Let's start you off with a few things: ");
        
        
        //Add animals - start off with 2 of each
        for (int i = 0; i < 2; i++) {
              hbFarm.addAnimal(chicken);
              hbFarm.addAnimal(cow);
              hbFarm.addAnimal(sheep);
        }
        System.out.println("\t+2 Chickens");
        System.out.println("\t+2 Cows");
        System.out.println("\t+2 Sheep");
        
        //Add crops
        for (int i = 0; i < 5; i++) {
            hbFarm.addCrops(corn);
            hbFarm.addCrops(rice);
            hbFarm.addCrops(wheat);
        }
        System.out.println("\t+5 Plots of Corn");
        System.out.println("\t+5 Plots of Rice");
        System.out.println("\t+5 Plots of Wheat");
        
        //Add farmers
        for (int i = 0; i < 3; i++) {
            hbFarm.addFarmers(farmer);
        }
        System.out.println("\t+3 Farmers");
        System.out.println();
        System.out.println("It's currently the start of a new day!");
        System.out.println("Let's start earning some money");
    }

    

}
