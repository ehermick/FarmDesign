package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import animals.Cow;
import farm.Farm;
import farm.HybridFarm;

public class TestHarvestMilk {
    @Test
    public void harvestMilk() {
        HybridFarm hf2 = new HybridFarm(10, 0, 0);
        Cow cow = new Cow("Cow", 100, 3, 0, 2);
        
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(cow);
        }
        
        for (int i = 0; i < hf2.getAnimalsSize(); i++) {
            Cow.harvestMilk();//Harvest milk
        }
        
        int expected = 10;
        int actual = hf2.getCurrencyChange();
        assertEquals("Milk Harvest", expected, actual);
    }

}
