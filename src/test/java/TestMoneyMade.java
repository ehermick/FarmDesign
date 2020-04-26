package test.java;

import static org.junit.Assert.assertEquals;

import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import farm.AnimalFarm;
import farm.Farm;

import org.junit.Before;
import org.junit.Test;


import affinities.DecoratorAgeHarvestChicken;

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
        
        DecoratorAgeHarvestChicken chicken = new DecoratorAgeHarvestChicken("Chicken", 100, 6, 0, 8, 1);
        
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
