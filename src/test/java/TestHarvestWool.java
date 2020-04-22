package test.java;

import static org.junit.Assert.assertEquals;

import animals.Sheep;

import farm.Farm;
import farm.HybridFarm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestHarvestWool {
    
    private HybridFarm hf;
    
    @Before
    public void setUp() {
        Farm.resetCurrencyChange();
        hf = new HybridFarm(10, 0, 0);
    }
    
    @Test
    public void harvestMilk() {

        Sheep sheep = new Sheep("Sheep", 100, 3, 0, 2);
        
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(sheep);
        }
        
        for (int i = 0; i < hf.getAnimalsSize(); i++) {
            Sheep.harvestWool();//Harvest milk
        }
        
        int expected = 25;
        int actual = hf.getCurrencyChange();
        assertEquals("Wool Harvest", expected, actual);
    }
    
    @After
    public void reset() {
        Farm.resetCurrencyChange();
    }
    
    

}
