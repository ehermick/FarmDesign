package test;

import static org.junit.Assert.assertEquals;

import crops.Wheat;

import farm.Farm;
import farm.HybridFarm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestHarvestWheat {

    @Before
    public void setUp() {
        Farm.resetCurrencyChange();
    }
    
    
    
    /**
     * Tests the harvest of wheat.
     */
    @Test
    public void harvestWheat() {
        

        
        //New farm
        HybridFarm cf3 = new HybridFarm(10, 0, 0);
        Wheat wheat = new Wheat("Wheat", 100, 0, 0);
        
        //Add 5 plots of corn
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(wheat);  //Plant corn on farm
        }
        wheat.harvestCycle = 3; //3 days old
        
        for (int i = 0; i < cf3.getCropsSize(); i++) {
            Wheat.harvestWheat(); //Harvest those crops
        }
        
        int expectedIncome = 15; //Should make $15
        int actualIncome = cf3.getCurrencyChange();
        assertEquals("Wheat Harvest", expectedIncome, actualIncome);
    }
    
    @After
    public void reset() {
        Farm.resetCurrencyChange();
    } 



    
}
