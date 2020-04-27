package test.java;

import static org.junit.Assert.assertEquals;

import animals.Chicken;

import factory.Farm;

import org.junit.Test;

import state.StateContext;


public class TestDeath {
    
    private Chicken chicken;
    
    StateContext contextDeath;
    
    //Too old
    @Test
    public void deathTest2() {
        //Too old
        chicken = new Chicken();
         
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
