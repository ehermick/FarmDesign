package test.java;

import static org.junit.Assert.assertEquals;

import crops.Corn;
import crops.Rice;
import crops.Wheat;
import factory.CropFarm;
import factory.Farm;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;




public class TestHarvestCrops {
    
    private CropFarm cf;
    private Corn corn;
    private Rice rice;
    private Wheat wheat;
    private int currencyChange = 0;
    
    @Test
    public void harvestCornTest() {
        
        cf = new CropFarm();

        corn = new Corn();

        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
        //Add 5 plots of corn
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(corn);  //Plant corn on farm
            Corn.harvestCorn();
        }
        
        
        currencyChange = cf.getCurrencyChange();

        int expectedCorn = 30; //Should make $30
        int actualCorn = currencyChange;
        assertEquals("Corn Harvest", expectedCorn, actualCorn);
    }
    
    @Test
    public void harvestRiceTest() {
        cf = new CropFarm();
        rice = new Rice();
        
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
        //Add 5 plots of rice
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(rice);  //Plant rice on farm
            Rice.harvestRice();
        }

        
        currencyChange = cf.getCurrencyChange();
        
        int expectedRice = 15; //Should make $15
        int actualRice = currencyChange;
        assertEquals("Rice Harvest", expectedRice, actualRice);
    }
    
    @Test
    public void harvestWheatTest() {
        cf = new CropFarm();
        wheat = new Wheat();
        
        Farm.resetCurrencyChange();
        Farm.resetCrops();
        
        //Add 5 plots of wheat
        for (int i = 0; i < 5; i++) {
            Farm.addCrop(wheat);  //Plant corn on farm
            Wheat.harvestWheat();
        }
        

        currencyChange = cf.getCurrencyChange();
        
        int expectedWheat = 45; //Should make $45
        int actualWheat = currencyChange;
        assertEquals("Wheat Harvest", expectedWheat, actualWheat);
        
        
        //Resets the currencyChange counter
        Farm.resetCurrencyChange();
        int expected = 0;
        int actual = cf.getCurrencyChange();
        assertEquals("Reset", expected, actual);
    }
    


}
