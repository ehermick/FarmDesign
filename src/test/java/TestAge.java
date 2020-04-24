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

public class TestAge {
    
    private HybridFarm hf;
    
    private Corn corn1;
    private Wheat wheat1;
    
    private Corn corn2;
    private Rice rice2;
    
    private Chicken chicken1;
    private Cow cow1;
    
    private Chicken chicken2;
    private Sheep sheep2;
    
    private Cow cow3;
    private Sheep sheep3;
    
    private int currencyChange = 0;
    
    /**
     * Setup before tests.
     */
    @Before
    public void setUp() {
        hf = new HybridFarm(10, 0, 0);
        
        //Old enough crops
        corn1 = new Corn("Corn", 100, 0, 3, 0);
        wheat1 = new Wheat("Wheat", 100, 0, 3, 0);
        //Too young crops
        corn2 = new Corn("Corn", 100, 0, 0, 0);
        rice2 = new Rice("Rice", 100, 0, 0, 0);
        
        //Animals with too young ages
        chicken1 = new Chicken("Chicken", 100, 0, 0, 2);
        cow1 = new Cow("Cow", 100, 0, 0, 2);
        
        //Animals with too young harvest cycles
        chicken2 = new Chicken("Chicken", 100, 3, 0, 0);
        sheep2 = new Sheep("Sheep", 100, 3, 0, 0);
        
        //Animals with too young ages & harvest cycles
        cow3 = new Cow("Cow", 100, 0, 0, 0);
        sheep3 = new Sheep("Sheep", 100, 0, 0, 0);
    }
    
    @Test
    public void regularCropsTest() {
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
