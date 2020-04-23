package test.java;

import static org.junit.Assert.assertEquals;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import farm.AnimalFarm;
import farm.Farm;
import farm.HybridFarm;

import org.junit.Before;
import org.junit.Test;

public class TestHarvestProduce {
    
    private AnimalFarm af;
    private Chicken chicken;
    private Cow cow;
    private Sheep sheep;
    private int currencyChange = 0;
    
    /**
     * Setup before tests.
     */
    @Before
    public void setup() {
        af = new AnimalFarm(10, 0, 0);
        
        chicken = new Chicken("Chicken", 100, 3, 0, 2);
        cow = new Cow("Cow", 100, 3, 0, 2);
        sheep = new Sheep("Sheep", 100, 3, 0, 2);
        
    }
    
    /**
     * Tests the harvest of animal produce.
     */
    @Test
    public void harvestProduce() {

        
        //Add 5 chickens to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(chicken);
            Animal.harvest(chicken);
        }
        
        currencyChange = af.getCurrencyChange();
        
        int expectedEgg = 5; //Should make $5
        int actualEgg = currencyChange;
        assertEquals("Egg Harvest", expectedEgg, actualEgg);
    
        //Add 5 cows to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(cow);
            Animal.harvest(cow);
        }
        
        currencyChange = af.getCurrencyChange();
    
        int expectedMilk = 15; //Should be $10 + existing $5
        int actualMilk = currencyChange;
        assertEquals("Milk Harvest", expectedMilk, actualMilk);
        
        //Add 5 sheep to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(sheep);
            Animal.harvest(sheep);
        }
        
        currencyChange = af.getCurrencyChange();
        
        int expectedWool = 40; //Should be $25 + existing $15
        int actualWool = currencyChange;
        assertEquals("Wool Harvest", expectedWool, actualWool);
        
        //Resets the currencyChange counter
        Farm.resetCurrencyChange();
        int expected = 0;
        int actual = af.getCurrencyChange();
        assertEquals("Reset", expected, actual);
    }
    

}
