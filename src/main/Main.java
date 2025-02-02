package main;

import factory.Farm;
import predators.Predators;
//import farm.HybridFarm;
import state.StateContext;




public class Main {

    /**
     * Main method.
     * @param args String passed
     */
    public static void main(String[] args) {

        NewFarm.buildFarm(); //Build a new farm

        //Start off at day time
        StateContext context = new StateContext(null);
        context.update();
        
        //Simulation ends when farm goes bankrupt or reaches $1100 in the bank   
        for (int i = 0; i < 1000; i++) {
            
            //Heal crops and animals injured from last night
            Farmers.treatAnimal();
            Farmers.treatCrop();
            
            //Check for births 
            Farm.birth();
            
            //Check for deaths
            Farm.death();
            
            //Harvest
            Farm.harvestProduce();
            Farm.harvestCrops();
            
            //Replenish crops and animals
            Farm.replenishCrops(); 
            Farm.replenishAnimals();
            
            //Money made for the day
            Farm.moneyMade();
            

            
            //Check at end of day
            if (Farm.getCurrency() >= 1100) {
                System.out.println();
                System.out.println("----------------------------------------------");
                System.out.println("You've completed the simulation!");
                System.out.println("You now have enough money to add another farm!");
                System.out.println("----------------------------------------------");
                break;
            } else if (Farm.getCurrency() <= 0) {
                System.out.println();
                System.out.println("----------------------------------------------");
                System.out.println("Your farm went bankrupt :(");
                System.out.println("Better luck next time!");
                System.out.println("----------------------------------------------");
                break;
            }
            
            context.update(); //Switch to night
            
            //Check for death/injury from predators
            Predators.eat();
            Predators.damage();
            
            context.update(); //Switch to day
            
        }       
    }
}
