package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import animals.Cow;
import animals.Sheep;
import farm.Farm;
import farm.HybridFarm;

public class TestHarvestWool {
    @Test
    public void harvestMilk() {
        HybridFarm hf3 = new HybridFarm(10, 0, 0);
        Sheep sheep = new Sheep("Sheep", 100, 3, 0, 2);
        
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(sheep);
        }
        
        for (int i = 0; i < hf3.getAnimalsSize(); i++) {
            Sheep.harvestWool();//Harvest milk
        }
        
        int expected = 25;
        int actual = hf3.getCurrencyChange();
        assertEquals("Wool Harvest", expected, actual);
    }

}
