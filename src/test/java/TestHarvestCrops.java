package test.java;

import static org.junit.Assert.assertEquals;

import crops.Corn;
import crops.Rice;
import crops.Wheat;
import farm.CropFarm;
import farm.Farm;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;




public class TestHarvestCrops {
    
    private CropFarm cf;
    private Corn corn;
    private Rice rice;
    private Wheat wheat;
    private int currencyChange = 0;
    
    
    @Before
    public void setUp() {
        cf = new CropFarm(10, 0, 0);

        corn = new Corn("Corn", 100, 0, 3);
        rice = new Rice("Rice", 100, 0, 3);
        wheat = new Wheat("Wheat", 100, 0, 3);
        
    }
    
    
    /**
     * Tests the harvest of crops.
     */
    @Test
    public void harvestCrops() {

        
        //Add 5 plots of corn
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(corn);  //Plant corn on farm
            Corn.harvestCorn();
        }
        
        
        currencyChange = cf.getCurrencyChange();

        int expectedCorn = 10; //Should make $10
        int actualCorn = currencyChange;
        assertEquals("Corn Harvest", expectedCorn, actualCorn);
        
        //Add 5 plots of rice
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(rice);  //Plant rice on farm
            Rice.harvestRice();
        }

        
        currencyChange = cf.getCurrencyChange();
        
        int expectedRice = 15; //Should make $5 + Corn's $10
        int actualRice = currencyChange;
        assertEquals("Rice Harvest", expectedRice, actualRice);
        
        //Add 5 plots of wheat
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(wheat);  //Plant corn on farm
            Wheat.harvestWheat();
        }
        

        currencyChange = cf.getCurrencyChange();
        
        int expectedWheat = 30; //Should make $15 + existing $15
        int actualWheat = currencyChange;
        assertEquals("Wheat Harvest", expectedWheat, actualWheat);
    }
    


}
