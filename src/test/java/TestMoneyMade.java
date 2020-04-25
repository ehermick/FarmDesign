package test.java;

import static org.junit.Assert.assertEquals;

import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import farm.AnimalFarm;
import farm.Farm;

import org.junit.Before;
import org.junit.Test;

public class TestMoneyMade {

    private Chicken chicken;
    
    @Test
    public void moneyMadeTest() {
        
        chicken = new Chicken("Chicken", 100, 3, 0, 2);
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Add 5 chickens to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(chicken);
            Farm.harvestProduce();
        }

        int expected =  25;
        int actual = Farm.moneyMade();
        assertEquals("Money Made", expected, actual);
        
    }
}
