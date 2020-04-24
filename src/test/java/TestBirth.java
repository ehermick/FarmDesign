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

/**
 * Tests the birth() method in Farm.java
 *
 */
public class TestBirth {
    
    private AnimalFarm af;
    
    private Chicken chicken1;
    private Cow cow1;
    
    private Chicken chicken2;
    private Cow cow2;
    private Sheep sheep2;
    
    private Cow cow3;
    private Sheep sheep3;
    
    private Chicken chicken3;
    
    private Chicken chicken4;
    private Cow cow4;
    private Sheep sheep4;
    
    private int currencyChange = 0;
    
    /**
     * Setup before tests.
     */
    @Before
    public void setup() {
        af = new AnimalFarm(10, 0, 0);
        
        //Old enough, but too low birthcycle
        cow1 = new Cow("Cow", 100, 3, 0, 2);
        
        //Too young, high enough birthcycle
        sheep2 = new Sheep("Sheep", 100, 0, 5, 2);
        
        //Too young, and too low birthcycle
        chicken3 = new Chicken("Chicken", 100, 0, 0, 2);
        
        //Old enough, high enough birthcycle
        chicken4 = new Chicken("Chicken", 100, 3, 5, 2);
        cow4 = new Cow("Cow", 100, 3, 5, 2);
        sheep4 = new Sheep("Sheep", 100, 3, 5, 2);
        
    }
    
    
    //Old enough, but too low birthcycle
    @Test
    public void birthTest1() {
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(cow1);
        
        Farm.birth();
        int expectedSize = 1;
        int actualSize = Farm.getAnimalsSize();
        
        assertEquals("Low Birthcycle", expectedSize, actualSize);
        
    }
    
    //Too young, but high enough birthcycle
    @Test
    public void birthTest2() {
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(sheep2);
        
        Farm.birth();
        int expectedSize = 1;
        int actualSize = Farm.getAnimalsSize();
        
        assertEquals("Low Age", expectedSize, actualSize);
        
    }
    
    //Too young, and too low birthcycle
    @Test
    public void birthTest3() {
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(chicken3);
        
        Farm.birth();
        int expectedSize = 1;
        int actualSize = Farm.getAnimalsSize();
        
        assertEquals("Low Birthcycle and Age", expectedSize, actualSize);
        
    }
    
    //Old enough, and high enough birthcycle - Chicken
    @Test
    public void birthTestChicken() {
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(chicken4);
        
        //Playing with chance - should happen atleast once
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        
        int expectedSize = 2; 
        int actualSize = Farm.getAnimalsSize();
        
        assertEquals("Chicken Birth", expectedSize, actualSize); 
    }
    
    //Old enough, and high enough birthcycle - Cow
    @Test
    public void birthTestCow() {
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(cow4);
        
        //Playing with chance - should happen atleast once
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        
        int expectedSize = 2; 
        int actualSize = Farm.getAnimalsSize();
        
        assertEquals("Cow Birth", expectedSize, actualSize); 
    }
    
    //Old enough, and high enough birthcycle - Sheep
    @Test
    public void birthTestSheep() {
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(sheep4);
        
        //Playing with chance - should happen atleast once
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        
        int expectedSize = 2; 
        int actualSize = Farm.getAnimalsSize();
        
        assertEquals("Sheep Birth", expectedSize, actualSize); 
    }
    

}
