package test.java;

import static org.junit.Assert.assertEquals;

import affinities.DecoratorAgeHarvestChicken;

import animals.Chicken;
import farm.Farm;

import org.junit.Test;

public class TestMoneyMade {

    
    @Test
    public void moneyMadeTest() {
        
        Chicken chicken = new Chicken();
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Add 5 chickens to farm
        for (int i = 0; i < 5; i++) {
            Farm.addAnimal(chicken);
            Farm.harvestProduce();
        }

        int expected =  0; //Not old enough
        int actual = Farm.moneyMade();
        assertEquals("Money Made", expected, actual);
        
    }
    
    @Test
    public void moneyMadeTestSuper() {
        
        DecoratorAgeHarvestChicken chicken = 
                new DecoratorAgeHarvestChicken("Chicken", 100, 6, 0, 8, 1);
        
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
