package main;

//import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;

import crops.Corn;
//import crops.Crops;
import crops.Rice;
import crops.Wheat;
import factory.Farm;
import factory.HybridFarm;


public class NewFarm {
    
    /**
     * Builds a new farm.
     */
    public static void buildFarm() {
        Chicken chicken = new Chicken();
        Cow cow = new Cow();
        Sheep sheep = new Sheep();
        
        Corn corn = new Corn();
        Rice rice = new Rice();
        Wheat wheat = new Wheat();
        
        Farmers farmer = new Farmers("farmer", 1, 1, 1);
        
        
        //Start with 1 hybrid farm
        //HybridFarm hbFarm = new HybridFarm(10, 0, 0);//Start with 10 acres
        System.out.println("Congratulations on purchasing your first farm!");
        System.out.println("Let's start you off with a few things: ");
        
        Farm.setCurrency(100);
        System.out.println("\t+100 Dollars");
        
        //Add animals - start off with 2 of each
        for (int i = 0; i < 2; i++) {
            Farm.addAnimal(chicken);
            Farm.addAnimal(cow);
            Farm.addAnimal(sheep);
        }
        System.out.println("\t+2 Chickens");
        System.out.println("\t+2 Cows");
        System.out.println("\t+2 Sheep");
        
        //Add crops
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(corn);
            Farm.addCrop(rice);
            Farm.addCrop(wheat);
        }
        System.out.println("\t+5 Plots of Corn");
        System.out.println("\t+5 Plots of Rice");
        System.out.println("\t+5 Plots of Wheat");
        
        //Add farmers
        for (int i = 0; i < 3; i++) {
            Farm.addFarmer(farmer);
        }
        System.out.println("\t+3 Farmers");
        System.out.println();
        System.out.println("It's currently the start of a new day!");
        System.out.println("Let's start earning some money");
    }

    

}
