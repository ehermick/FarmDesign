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

import state.StateContext;

/**
 * Tests the birth() method in Farm.java
 *
 */
public class TestBirth {
    
    private Cow cow1;

    private Sheep sheep2;
    
    private Chicken chicken3;
    
    private Chicken chicken4;
    private Cow cow4;
    private Sheep sheep4;
    
    StateContext context;
    
    /**
     * Setup before tests.
     */
    @Before
    public void setup() {
        
        //Old enough, but too low birthcycle
        cow1 = new Cow("Cow", 100, 3, -30, 2);
        
        //Too young, high enough birthcycle
        sheep2 = new Sheep("Sheep", 100, -40, 5, 2);
        
        //Too young, and too low birthcycle
        chicken3 = new Chicken("Chicken", 100, 0, 0, 2);
        
        //Old enough, high enough birthcycle
        chicken4 = new Chicken("Chicken", 100, 3, 5, 2);
        cow4 = new Cow("Cow", 100, 3, 5, 2);
        sheep4 = new Sheep("Sheep", 100, 3, 5, 2);
        
        context = new StateContext(null); //Day
        
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
 //   @Test
  //  public void birthTest2() {
     //   Farm.resetCurrencyChange();
     //   Farm.resetAnimals();
        
      //  Farm.addAnimal(sheep2);
      //  Farm.birth();
     //   int expectedSize = 1;
     //   int actualSize = Farm.getAnimalsSize();
        
     //   assertEquals("Low Age", expectedSize, actualSize);
        
   // }
    
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
        
        context.update(); //Night
        context.update(); //Day
        context.update(); //Night
        context.update(); //Day
        
        Farm.addAnimal(chicken4);
        
        //Playing with chance - should happen atleast once
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        
        boolean expectedSize = true; 
        boolean actualSize = Farm.getAnimalsSize() >= 2;
        
        assertEquals("Chicken Birth", expectedSize, actualSize); 
    }
    
    //Old enough, and high enough birthcycle - Cow
    @Test
    public void birthTestCow() {
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(cow4);
        
        context = new StateContext(null); //Day
        context.update(); //Night
        context.update(); //Day
        context.update(); //Night
        context.update(); //Day
        
        //Playing with chance - should happen atleast once
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        
        boolean expectedSize = true; 
        boolean actualSize = Farm.getAnimalsSize() >= 2;
        
        assertEquals("Cow Birth", expectedSize, actualSize); 
    }
    
    //Old enough, and high enough birthcycle - Sheep
    @Test
    public void birthTestSheep() {
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        Farm.addAnimal(sheep4);
        
        context = new StateContext(null); //Day
        context.update(); //Night
        context.update(); //Day
        context.update(); //Night
        context.update(); //Day
        
        //Playing with chance - should happen atleast once
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        Farm.birth();
        
        boolean expectedSize = true; 
        boolean actualSize = Farm.getAnimalsSize() >= 2;
        
        assertEquals("Sheep Birth", expectedSize, actualSize); 
    }
    

}
