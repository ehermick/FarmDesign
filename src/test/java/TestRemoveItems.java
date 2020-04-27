package test.java;

import static org.junit.Assert.assertEquals;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import crops.Corn;
import crops.Crops;
import crops.Rice;
import crops.Wheat;
import factory.Farm;
import factory.HybridFarm;

import org.junit.Before;
import org.junit.Test;



public class TestRemoveItems {
    private HybridFarm hf;
    private Corn corn;
    private Rice rice;
    private Wheat wheat;
    
    private Chicken chicken;
    private Cow cow;
    private Sheep sheep;
    
    private int currencyChange = 0;

    
    @Test
    public void removeCropsTest() {
        hf = new HybridFarm();
        
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();
        
        
        Farm.resetCurrencyChange();
        
        //Add crops to farm
        Farm.addCrop(corn);
        Farm.addCrop(rice);
        Farm.addCrop(wheat);
        
        //Remove wheat
        Farm.removeCrop(wheat);


        Crops.harvest(corn);
        Crops.harvest(rice);

        
        currencyChange = hf.getCurrencyChange();
        int expected = 9;
        int actual = currencyChange;
        assertEquals("Remove Crops", expected, actual);
        
        
        //Reset currencyChange
        Farm.resetCurrencyChange();
        
        
    }
    
    @Test
    public void removeAnimalsTest() {
        
        hf = new HybridFarm();
        
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();
        
        Farm.resetCurrencyChange();
        
        Farm.addAnimal(chicken);
        Farm.addAnimal(cow);
        Farm.addAnimal(sheep);
        
        Farm.removeAnimal(cow);
        
        Animal.harvest(chicken);
        Animal.harvest(sheep);
        
        currencyChange = hf.getCurrencyChange();
        int expected = 25;
        int actual = currencyChange;
        assertEquals("Remove Animals", expected, actual);
        
        //Reset currencyChange
        Farm.resetCurrencyChange();
        
    }

}
