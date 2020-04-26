package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import affinities.DecoratorProdChicken;
import affinities.DecoratorProdCorn;
import affinities.DecoratorProdCow;
import affinities.DecoratorProdRice;
import affinities.DecoratorProdSheep;
import affinities.DecoratorProdWheat;
import farm.AnimalFarm;
import farm.CropFarm;
import farm.Farm;
import state.StateContext;

public class TestExtraProd {
    
    private int currencyChange = 0;
    
    @Test
    public void testCornProd() {
        CropFarm cf = new CropFarm(10, 0, 0);
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
        DecoratorProdCorn corn = new DecoratorProdCorn("Corn", 100, 0, 3, 2);
        
        Farm.addCrop(corn);
        Farm.harvestCrops();
        
        currencyChange = cf.getCurrencyChange();
        
        int expected = 12;
        int actual = currencyChange;
        assertEquals("Corn Extra Prod", expected, actual);
        
        Farm.resetCurrencyChange();
        currencyChange = 0;
        
    }
    
    @Test
    public void testRiceProd() {
        CropFarm cf = new CropFarm(10, 0, 0);
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
        DecoratorProdRice rice = new DecoratorProdRice("Rice", 100, 0, 3, 2);
        
        Farm.addCrop(rice);
        Farm.harvestCrops();
        
        currencyChange = cf.getCurrencyChange();
        
        int expected = 6;
        int actual = currencyChange;
        assertEquals("Rice Extra Prod", expected, actual);  
        
        Farm.resetCurrencyChange();
    }
    
    @Test
    public void testWheatProd() {
        CropFarm cf = new CropFarm(10, 0, 0);
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
        DecoratorProdWheat wheat = new DecoratorProdWheat("Wheat", 100, 0, 3, 2);
        
        Farm.addCrop(wheat);
        Farm.harvestCrops();
        
        currencyChange = cf.getCurrencyChange();
        
        int expected = 18;
        int actual = currencyChange;
        assertEquals("Wheat Extra Prod", expected, actual);  
        
        Farm.resetCurrencyChange();
    }
    
    @Test
    public void testChickenProd() {
        
        AnimalFarm af = new AnimalFarm(10, 0, 0);
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        DecoratorProdChicken chicken = new DecoratorProdChicken("Chicken", 100, 3, 0, 5, 2);
        
        Farm.addAnimal(chicken);
        Farm.harvestProduce();
        
        currencyChange = af.getCurrencyChange();
        
        int expected = 10;
        int actual = currencyChange;
        assertEquals("Chicken Extra Prod", expected, actual);
        
        Farm.resetCurrencyChange();
    }
    
    @Test
    public void testCowProd() {
        
        AnimalFarm af = new AnimalFarm(10, 0, 0);
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        DecoratorProdCow cow = new DecoratorProdCow("Cow", 100, 3, 0, 5, 2);
        
        Farm.addAnimal(cow);
        Farm.harvestProduce();
        
        currencyChange = af.getCurrencyChange();
        
        int expected = 20;
        int actual = currencyChange;
        assertEquals("Cow Extra Prod", expected, actual);
        
        Farm.resetCurrencyChange();
    }
    
    @Test
    public void testSheepProd() {
        
        AnimalFarm af = new AnimalFarm(10, 0, 0);
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        DecoratorProdSheep sheep = new DecoratorProdSheep("Sheep", 100, 3, 0, 5, 2);
        
        Farm.addAnimal(sheep);
        Farm.harvestProduce();
        
        currencyChange = af.getCurrencyChange();
        
        int expected = 40;
        int actual = currencyChange;
        assertEquals("Sheep Extra Prod", expected, actual);
        
        Farm.resetCurrencyChange();
    }
    


}
