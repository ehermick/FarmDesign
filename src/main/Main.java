package main;

import farm.Farm;
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
        
        //Simulation end when farm goes bankrupt or reaches $100 in the bank
        for (int i = 0; i < 30; i++) {
            //Check for births 
            Farm.birth();
            
            //Check for deaths
            Farm.death();
            
            //Harvest
            Farm.harvestProduce();
            Farm.harvestCrops();
            
            //Money made for the day
            Farm.moneyMade();
            
            context.update(); //Switch to night
            
            //Check for death/injury from predators
            //Check for damage to crops from predators
            
            context.update(); //Switch to day
            
        }       
    }
}
