package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import animals.Chicken;
import farm.Farm;
import farm.HybridFarm;

public class TestHarvestEggs {
    
    @Test
    public void harvestEggs() {
        HybridFarm hf = new HybridFarm(10, 0, 0);
        
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
    

}
