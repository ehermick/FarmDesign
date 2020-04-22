package test;

import static org.junit.Assert.*;


import org.junit.Test;

import crops.Corn;

import farm.CropFarm;
import farm.Farm;


public class TestHarvestCrops {
    
    /**
     * Tests the harvest of corn
     */
    @Test
    public void harvestCorn() {

        CropFarm cf = new CropFarm(10, 0, 0);
        
        //New farm
        Corn corn = new Corn("Corn", 100, 0, 0);
        
        //Add 5 plots of corn
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(corn);  //Plant corn on farm
        }
        
        corn.harvestCycle = 3; //3 days old
        
        for (int i = 0; i < cf.getCropsSize(); i++) {
            Corn.harvestCorn(); //Harvest those crops
        }

        int expectedIncome = 10; //Should make $10
        int actualIncome = cf.getCurrencyChange();
        assertEquals("Corn Harvest", expectedIncome, actualIncome);
    }
    
    
    
 


}
