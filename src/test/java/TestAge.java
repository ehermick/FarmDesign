package test.java;

import static org.junit.Assert.assertEquals;

import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import crops.Corn;
import crops.Rice;
import crops.Wheat;

import farm.Farm;
import farm.HybridFarm;

import org.junit.Before;
import org.junit.Test;

import affinities.DecoratorHarvestCorn;
import affinities.DecoratorHarvestWheat;

public class TestAge {
    
    private HybridFarm hf;

    
    private Corn corn2;
    private Rice rice2;
    
    private Chicken chicken1;
    private Cow cow1;
    
    private Chicken chicken2;
    private Sheep sheep2;
    
    private Cow cow3;
    private Sheep sheep3;
    
    private int currencyChange = 0;
    
    
    @Test
    public void regularCropsTest() {
        
        hf = new HybridFarm(10, 0, 0);
        
        //Old enough crops
        DecoratorHarvestCorn corn1 = new DecoratorHarvestCorn("Corn", 100, 0, 3, 1);
        DecoratorHarvestWheat wheat1 = new DecoratorHarvestWheat("Wheat", 100, 0, 3, 1);
        

        
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
        Farm.addCrop(corn1);
        Farm.addCrop(wheat1);
        
        Farm.harvestCrops();
        
        currencyChange = hf.getCurrencyChange();
        int expected = 15;
        int actual = currencyChange;
        assertEquals("Regular Crops", expected, actual);
        
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
    }
    
    @Test
    public void ageCropsTest() {
        
        hf = new HybridFarm(10, 0, 0);
        
        //Too young crops
        corn2 = new Corn();
        rice2 = new Rice();
        
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
        Farm.addCrop(corn2);
        Farm.addCrop(rice2);
        
        Farm.harvestCrops();
        
        currencyChange = hf.getCurrencyChange();
        int expected = 0;
        int actual = currencyChange;
        assertEquals("Young Crops", expected, actual);
        
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
    }
    
    @Test
    public void ageAnimalsTest() {
        
        hf = new HybridFarm(10, 0, 0);
        
        //Animals with too young ages
        chicken1 = new Chicken();
        cow1 = new Cow();

        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(chicken1);
        Farm.addAnimal(cow1);
        
        Farm.harvestProduce();
        
        currencyChange = hf.getCurrencyChange();
        int expected = 0;
        int actual = currencyChange;
        assertEquals("Low Age Animals", expected, actual);
        
    }
    
    @Test
    public void harvestCycleAnimalsTest() {
        
        hf = new HybridFarm(10, 0, 0);

        
        //Animals with too young harvest cycles
        chicken2 = new Chicken();
        sheep2 = new Sheep();

        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(chicken2);
        Farm.addAnimal(sheep2);
        
        Farm.harvestProduce();
        
        currencyChange = hf.getCurrencyChange();
        int expected = 0;
        int actual = currencyChange;
        assertEquals("Low Harvest Cycle Animals", expected, actual);
        
    }
    
    @Test
    public void lowBothAnimalsTest() {
        
        hf = new HybridFarm(10, 0, 0);
        
        //Animals with too young ages & harvest cycles
        cow3 = new Cow();
        sheep3 = new Sheep();
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(cow3);
        Farm.addAnimal(sheep3);
        
        Farm.harvestProduce();
        
        currencyChange = hf.getCurrencyChange();
        int expected = 0;
        int actual = currencyChange;
        assertEquals("Low Harvest Cycle and Age Animals", expected, actual);  
        
    }
    

}
