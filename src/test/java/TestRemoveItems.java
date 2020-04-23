package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import crops.Corn;
import crops.Crops;
import crops.Rice;
import crops.Wheat;
import farm.Farm;
import farm.HybridFarm;

public class TestRemoveItems {
    private HybridFarm hf;
    private Corn corn;
    private Rice rice;
    private Wheat wheat;
    
    private Chicken chicken;
    private Cow cow;
    private Sheep sheep;
    
    private int currencyChange = 0;
    
    @Before
    public void setup() {
        hf = new HybridFarm(10, 0, 0);
        
        corn = new Corn("Corn", 100, 0, 3);
        rice = new Rice("Rice", 100, 0, 3);
        wheat = new Wheat("Wheat", 100, 0, 3);
        
        chicken = new Chicken("Chicken", 100, 3, 0, 2);
        cow = new Cow("Cow", 100, 3, 0, 2);
        sheep = new Sheep("Sheep", 100, 3, 0, 2);
    }
    
    @Test
    public void removeCropsTest() {
        
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
        int expected = 3;
        int actual = currencyChange;
        assertEquals("Remove Crops", expected, actual);
        
        
        //Reset currencyChange
        Farm.resetCurrencyChange();
        
        
    }
    
    @Test
    public void removeAnimalsTest() {
        Farm.resetCurrencyChange();
        
        Farm.addAnimal(chicken);
        Farm.addAnimal(cow);
        Farm.addAnimal(sheep);
        
        Farm.removeAnimal(cow);
        
        Animal.harvest(chicken);
        Animal.harvest(sheep);
        
        currencyChange = hf.getCurrencyChange();
        int expected = 6;
        int actual = currencyChange;
        assertEquals("Remove Animals", expected, actual);
        
        //Reset currencyChange
        Farm.resetCurrencyChange();
        
    }

}
