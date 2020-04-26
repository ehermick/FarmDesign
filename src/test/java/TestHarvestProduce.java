package test.java;

import static org.junit.Assert.assertEquals;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import farm.AnimalFarm;
import farm.Farm;
import farm.HybridFarm;
import state.StateContext;

import org.junit.Before;
import org.junit.Test;

import affinities.DecoratorAgeHarvestChicken;
import affinities.DecoratorAgeHarvestCow;
import affinities.DecoratorAgeHarvestSheep;

public class TestHarvestProduce {
    
    private AnimalFarm af;

    private int currencyChange = 0;

   
    
    /**
     * Tests the harvest of animal produce.
     */
    @Test
    public void harvestEggsTest() {
      
        af = new AnimalFarm(10, 0, 0);
        
        DecoratorAgeHarvestChicken chicken = new DecoratorAgeHarvestChicken("Chicken", 100, 3, 0, 5, 1);

        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Add 5 chickens to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(chicken);
            Farm.harvestProduce();
        }
        
        currencyChange = af.getCurrencyChange();
        
        int expectedEgg = 25; //Should make $25
        int actualEgg = currencyChange;
        assertEquals("Egg Harvest", expectedEgg, actualEgg);
    
       
        
        //Resets the currencyChange counter
        Farm.resetCurrencyChange();
        int expected = 0;
        int actual = af.getCurrencyChange();
        assertEquals("Reset", expected, actual);
    }
    
    @Test
    public void harvestMilkTest() {
        af = new AnimalFarm(10, 0, 0);

        DecoratorAgeHarvestCow cow = new DecoratorAgeHarvestCow("Cow", 100, 3, 0, 2, 1);
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Add 5 cows to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(cow);
            Farm.harvestProduce();
        }
        
        currencyChange = af.getCurrencyChange();
    
        int expectedMilk = 50; //Should be $50
        int actualMilk = currencyChange;
        assertEquals("Milk Harvest", expectedMilk, actualMilk);
    }
    
    @Test
    public void harvestWoolTest() {
        af = new AnimalFarm(10, 0, 0);
       
        DecoratorAgeHarvestSheep sheep = new DecoratorAgeHarvestSheep("Sheep", 100, 3, 0, 2, 1);
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Add 5 sheep to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(sheep);
            Farm.harvestProduce();
        }
        
        
        currencyChange = af.getCurrencyChange();
        
        int expectedWool = 100; //Should be $100
        int actualWool = currencyChange;
        assertEquals("Wool Harvest", expectedWool, actualWool);
    }
    

}
