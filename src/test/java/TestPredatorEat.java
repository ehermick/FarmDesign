package test.java;

import static org.junit.Assert.assertEquals;

import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import crops.Corn;
import crops.Rice;
import crops.Wheat;
import factory.Farm;

import org.junit.Before;
import org.junit.Test;

import predators.Predators;

public class TestPredatorEat {

    private Corn corn;
    private Rice rice;
    private Wheat wheat;
    private Chicken chicken;
    private Cow cow;
    private Sheep sheep;
    
    @Test
    public void eatChicken() {
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        
        //Playing with chance - should happen atleast once
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        
        boolean expected = true;
        boolean actual = Farm.getAnimalsSize() < 4;
        assertEquals("Predator Eats Chicken", expected, actual);
        
    }
    
    @Test
    public void eatCow() {
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        
        //Playing with chance - should happen atleast once
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        
        boolean expected = true;
        boolean actual = Farm.getAnimalsSize() < 4;
        assertEquals("Predator Eats Cow", expected, actual);
        
    }
    
    @Test
    public void eatSheep() {
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        
        //Playing with chance - should happen atleast once
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        
        boolean expected = true;
        boolean actual = Farm.getAnimalsSize() < 4;
        assertEquals("Predator Eats Sheep", expected, actual);
        
    }
    
    @Test
    public void eatAnimals() {
        
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        Farm.addAnimal(sheep);
        Farm.addAnimal(chicken);
        Farm.addAnimal(cow);
        
        //Playing with chance - should happen atleast once
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        
        boolean expected = true;
        boolean actual = Farm.getAnimalsSize() < 3;
        assertEquals("Predator Eats Animal", expected, actual);
        
    }
    
    @Test
    public void eatCorn() {
        
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        
        //Playing with chance - should happen atleast once
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        
        boolean expected = true;
        boolean actual = Farm.getCropsSize() < 4;
        assertEquals("Predator Eats Corn", expected, actual);
        
    }
    
    @Test
    public void eatRice() {
        
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        
        //Playing with chance - should happen atleast once
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        
        boolean expected = true;
        boolean actual = Farm.getCropsSize() < 4;
        assertEquals("Predator Eats Rice", expected, actual);
        
    }
    
    @Test
    public void eatWheat() {
        
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        
        //Playing with chance - should happen atleast once
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        
        boolean expected = true;
        boolean actual = Farm.getCropsSize() < 4;
        assertEquals("Predator Eats Wheat", expected, actual);
        
    }
    
    @Test
    public void eatCrops() {
        
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        Farm.addCrop(wheat);
        Farm.addCrop(corn);
        Farm.addCrop(rice);
        
        //Playing with chance - should happen atleast once
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        Predators.eat();
        
        boolean expected = true;
        boolean actual = Farm.getCropsSize() < 3;
        assertEquals("Predator Eats Crops", expected, actual);
        
    }

}
