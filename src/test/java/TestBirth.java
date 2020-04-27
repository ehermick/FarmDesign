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

/**
 * Tests the birth() method in Farm.java
 *
 */
public class TestBirth {
    
    StateContext context;

    //Old enough, but too low birthcycle
    
    @Test
    public void birthTest1() {
        
        context = new StateContext(null); //Day
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Old enough, but too low birthcycle
        Cow cow1 = new Cow();
        Farm.addAnimal(cow1);
        
        Farm.birth();
        int expectedSize = 1;
        int actualSize = Farm.getAnimalsSize();
        
        assertEquals("Low Birthcycle", expectedSize, actualSize);
        
    }
    
    //Too young, and too low birthcycle
    
    @Test
    public void birthTest3() {
        
        context = new StateContext(null); //Day
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Too young, and too low birthcycle
        Chicken chicken3 = new Chicken();
        
        Farm.addAnimal(chicken3);
        
        Farm.birth();
        int expectedSize = 1;
        int actualSize = Farm.getAnimalsSize();
        
        assertEquals("Low Birthcycle and Age", expectedSize, actualSize);
        
    }
    
    //Old enough, and high enough birthcycle - Chicken
    
    @Test
    public void birthTestChicken() {
        
        context = new StateContext(null); //Day
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        context.update(); //Night
        context.update(); //Day
        context.update(); //Night
        context.update(); //Day
        
        //Old enough, high enough birthcycle
        Chicken chicken4 = new Chicken();
        
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
        
        context = new StateContext(null); //Day
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Old enough, high enough birthcycle
        Cow cow4 = new Cow();
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
        
        context = new StateContext(null); //Day
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Old enough, high enough birthcycle
        Sheep sheep4 = new Sheep();
        
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
    
    @Test
    public void birthTestExtraChicken() {
        
        context = new StateContext(null); //Day
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        context.update(); //Night
        context.update(); //Day
        context.update(); //Night
        context.update(); //Day
        
        //Old enough, high enough birthcycle
        Chicken chicken4 = new Chicken();
        
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
    
    @Test
    public void birthTestExtraCow() {
        
        context = new StateContext(null); //Day
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Old enough, high enough birthcycle
        Cow cow4 = new Cow();
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
    
    @Test
    public void birthTestExtraSheep() {
        
        context = new StateContext(null); //Day
        
        Farm.resetCurrencyChange();
        Farm.resetAnimals();
        
        //Old enough, high enough birthcycle
        Sheep sheep4 = new Sheep();
        
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
