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


public class TestReplenishment {
    
    private HybridFarm hf;
    private Corn corn;
    private Rice rice;
    private Wheat wheat;
    private Chicken chicken;
    private Cow cow;
    private Sheep sheep;
    
    private int currencyChange = 0;
    
    /**
     * Setup before tests.
     */
    @Before
    public void setUp() {
        hf = new HybridFarm(10, 0, 0);
        
        corn = new Corn("Corn", 100, 0, 3, 0);
        rice = new Rice("Rice", 100, 0, 3, 0);
        wheat = new Wheat("Wheat", 100, 0, 3, 0);
        
        chicken = new Chicken("Chicken", 100, 3, 0, 2);
        cow = new Cow("Cow", 100, 3, 0, 2);
        sheep = new Sheep("Sheep", 100, 3, 0, 2);
    }
    
    @Test
    public void replenishCropsTest1() {
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetCrops();
        
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        
        Farm.removeCrop(corn);
        Farm.removeCrop(corn);
        
        Farm.replenishCrops();
        
        int expectedSize = 9;
        int actualSize = Farm.getCropsSize();
        assertEquals("Replenish Crops Size", expectedSize, actualSize);
        
        currencyChange = hf.getCurrencyChange();
        int expectedIncome = -20;
        int actualIncome = currencyChange;
        assertEquals("Replenish Crops Income", expectedIncome, actualIncome);
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetCrops();
        
    }
    
    @Test
    public void replenishCropsTest2() {
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetCrops();
        
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        
        Farm.removeCrop(rice);
        Farm.removeCrop(rice);
        
        Farm.replenishCrops();
        
        int expectedSize = 9;
        int actualSize = Farm.getCropsSize();
        assertEquals("Replenish Crops Size", expectedSize, actualSize);
        
        currencyChange = hf.getCurrencyChange();
        int expectedIncome = -10;
        int actualIncome = currencyChange;
        assertEquals("Replenish Crops Income", expectedIncome, actualIncome);
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetCrops();
        
    }
    
    @Test
    public void replenishCropsTest3() {
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetCrops();
        
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        
        Farm.removeCrop(wheat);
        Farm.removeCrop(wheat);
        
        Farm.replenishCrops();
        
        int expectedSize = 9;
        int actualSize = Farm.getCropsSize();
        assertEquals("Replenish Crops Size", expectedSize, actualSize);
        
        currencyChange = hf.getCurrencyChange();
        int expectedIncome = -50;
        int actualIncome = currencyChange;
        assertEquals("Replenish Crops Income", expectedIncome, actualIncome);
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetCrops();
        
    }
    
    @Test
    public void replenishAnimalsTest1() {
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetAnimals();
        
        
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        
        Farm.removeAnimal(chicken);
        Farm.removeAnimal(chicken);
        
        Farm.replenishAnimals();
        
        int expectedSize = 9;
        int actualSize = Farm.getAnimalsSize();
        assertEquals("Replenish Animals Size", expectedSize, actualSize);
        
        currencyChange = hf.getCurrencyChange();
        int expectedIncome = -10;
        int actualIncome = currencyChange;
        assertEquals("Replenish Animals Income", expectedIncome, actualIncome);
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetAnimals();
    }
    
    @Test
    public void replenishAnimalsTest2() {
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetAnimals();
        
        
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        
        Farm.removeAnimal(cow);
        Farm.removeAnimal(cow);
        
        Farm.replenishAnimals();
        
        int expectedSize = 9;
        int actualSize = Farm.getAnimalsSize();
        assertEquals("Replenish Animals Size", expectedSize, actualSize);
        
        currencyChange = hf.getCurrencyChange();
        int expectedIncome = -20;
        int actualIncome = currencyChange;
        assertEquals("Replenish Animals Income", expectedIncome, actualIncome);
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetAnimals();
    }
    
    @Test
    public void replenishAnimalsTest3() {
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetAnimals();
        
        
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        
        Farm.removeAnimal(sheep);
        Farm.removeAnimal(sheep);
        
        Farm.replenishAnimals();
        
        int expectedSize = 9;
        int actualSize = Farm.getAnimalsSize();
        assertEquals("Replenish Animals Size", expectedSize, actualSize);
        
        currencyChange = hf.getCurrencyChange();
        int expectedIncome = -50;
        int actualIncome = currencyChange;
        assertEquals("Replenish Animals Income", expectedIncome, actualIncome);
        
        Farm.resetCurrencyChange(); //Reset counter for next test
        Farm.resetAnimals();
    }

}
