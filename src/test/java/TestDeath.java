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


public class TestDeath {
    
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
        
        //Too old
        chicken = new Chicken("Chicken", 100, 14, 0, 2);
        
        //Not old enough
        cow = new Cow("Cow", 100, 5, 0, 2);
        
    }
    
    //Too old
    @Test
    public void deathTest1() {
        Farm.resetAnimals();
        
        Farm.addAnimal(chicken);
        Farm.death();
        
        int expected = 0;
        int actual = Farm.getAnimalsSize();
        assertEquals("Animal Death", expected, actual);
        
    }
    
    //Not old enough
    @Test
    public void deathTest2() {
        Farm.resetAnimals();
        
        Farm.addAnimal(cow);
        Farm.death();
        
        int expected = 1;
        int actual = Farm.getAnimalsSize();
        assertEquals("No Animal Death", expected, actual);
        
    }
    
    

}
