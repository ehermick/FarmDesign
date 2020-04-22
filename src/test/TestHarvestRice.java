package test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import crops.Rice;
import farm.CropFarm;
import farm.Farm;

public class TestHarvestRice {
    
    
    
    /**
     * Tests the harvest of Rice
     */
    @Test
    public void harvestRice() {
        
        
        //New farm
        CropFarm cf2 = new CropFarm(10, 0, 0);
        Rice rice = new Rice("Rice", 100, 0, 0);
        
        //Add 5 plots of rice
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(rice);  //Plant rice on farm
        }
        
        rice.harvestCycle = 3; //3 days old
        
        for (int i = 0; i < cf2.getCropsSize(); i++) {
            Rice.harvestRice(); //Harvest those crops
        }
        
    
        
        int expectedIncome = 5; //Should make $5
        int actualIncome = cf2.getCurrencyChange();
        assertEquals("Rice Harvest", expectedIncome, actualIncome);
    }

}
