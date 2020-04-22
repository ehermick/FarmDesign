package test.java;

import static org.junit.Assert.assertEquals;

import animals.Cow;

import farm.Farm;
import farm.HybridFarm;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;


public class TestHarvestMilk {
    
    private HybridFarm hf;
    
    @Before
    public void setUp() {
        Farm.resetCurrencyChange();
        hf = new HybridFarm(10, 0, 0);
    }
    
    @Test
    public void harvestMilk() {
        Cow cow = new Cow("Cow", 100, 3, 0, 2);
        
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(cow);
        }
        
        for (int i = 0; i < hf.getAnimalsSize(); i++) {
            Cow.harvestMilk();//Harvest milk
        }
        
        int expected = 10;
        int actual = hf.getCurrencyChange();
        assertEquals("Milk Harvest", expected, actual);
    }
    
    @After
    public void reset() {
        Farm.resetCurrencyChange();
    }

}
