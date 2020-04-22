package test.java;

import static org.junit.Assert.assertEquals;

import animals.Chicken;

import farm.Farm;
import farm.HybridFarm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class TestHarvestEggs {
    private HybridFarm hf;
    
    @Before
    public void setUp() {
        Farm.resetCurrencyChange();
        hf = new HybridFarm(10, 0, 0);
    }
    
    @Test
    public void harvestEggs() {

        Chicken chicken = new Chicken("Chicken", 100, 3, 0, 2);
        
        //Add 5 chickens to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(chicken);
        }

        for (int i = 0; i < hf.getAnimalsSize(); i++) {
            Chicken.harvestEggs(); //Harvest eggs
        }
        
        int expected = 5;
        int actual = hf.getCurrencyChange();
        assertEquals("Egg Harvest", expected, actual);
    }
    
    @After
    public void reset() {
        Farm.resetCurrencyChange();
    }
    

}
