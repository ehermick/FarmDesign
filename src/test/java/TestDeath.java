package test.java;

import static org.junit.Assert.assertEquals;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import factory.AnimalFarm;
import factory.Farm;
import factory.HybridFarm;

import org.junit.Before;
import org.junit.Test;

import state.StateContext;


public class TestDeath {
    
    private Chicken chicken;
    private Cow cow;
    
    StateContext contextDeath;
    
    
    //Not old enough
    @Test
    public void deathTest1() {
        
        //Too old
        chicken = new Chicken();
        
        //Not old enough
        cow = new Cow();
        
        
        Farm.resetAnimals();
        
        Farm.addAnimal(cow);
        Farm.death();
        
        int expected = 1;
        int actual = Farm.getAnimalsSize();
        assertEquals("No Animal Death", expected, actual);
        
    }
    
    //Too old
    @Test
    public void deathTest2() {
        //Too old
        chicken = new Chicken();
        
        //Not old enough
        cow = new Cow();
        
        
        Farm.resetAnimals();
        
        Farm.addAnimal(chicken);
        
        contextDeath = new StateContext(null); //Day

        for (int i = 0; i < 28; i++) {
            contextDeath.update(); //Day
        }
        
        Farm.death();
        
        int expected = 0;
        int actual = Farm.getAnimalsSize();
        assertEquals("Animal Death", expected, actual);
        
    }
    

    
    

}
