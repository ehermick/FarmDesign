package test.java;

import static org.junit.Assert.assertEquals;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import crops.Corn;
import crops.Crops;
import crops.Rice;
import crops.Wheat;
import farm.Farm;

import org.junit.Before;
import org.junit.Test;

import predators.Fox;
import predators.Mole;
import predators.Predators;
import predators.Rabbit;
import predators.Wolf;

public class TestPredatorDamage {

    private Corn corn;
    private Rice rice;
    private Wheat wheat;
    private Chicken chicken;
    private Cow cow;
    private Sheep sheep;
    
    private Fox fox;
    private Wolf wolf;
    private Rabbit rabbit;
    private Mole mole;
    
    /**
     * Setup before tests.
     */
    @Before
    public void setUp() {
        
        corn = new Corn("Corn", 100, 0, 3, 0);
        rice = new Rice("Rice", 100, 0, 3, 0);
        wheat = new Wheat("Wheat", 100, 0, 3, 0);
        
        chicken = new Chicken("Chicken", 100, 0, 0, 0);
        cow = new Cow("Cow", 100, 0, 0, 0);
        sheep = new Sheep("Sheep", 100, 0, 0, 0);  
        
        fox = new Fox("Fox", 10);
        wolf = new Wolf("Wolf", 10);
        rabbit = new Rabbit("Rabbit", 10);
        mole = new Mole("Mole", 10);
        
        
    }
    
    @Test
    public void eatChicken() {
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        Farm.addAnimal(chicken);
        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        
        boolean expected = true;
        boolean actual = Chicken.getHealth() < 100;
        assertEquals("Predator Injures Chicken", expected, actual);
        
    }
    
    @Test
    public void eatCow() {
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        Farm.addAnimal(cow);
        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        
        boolean expected = true;
        boolean actual = Cow.getHealth() < 100;
        assertEquals("Predator Injures Cow", expected, actual);
        
    }
    
    @Test
    public void eatSheep() {
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        Farm.addAnimal(sheep);
        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        
        boolean expected = true;
        boolean actual = Sheep.getHealth() < 100;
        assertEquals("Predator Injures Sheep", expected, actual);
        
    }
    
    @Test
    public void eatAnimals() {
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addAnimal(sheep);
        Farm.addAnimal(chicken);
        Farm.addAnimal(cow);
        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        
        boolean expected = true;
        boolean actual = Animal.getHealth() < 100;
        assertEquals("Predator Injures Animal", expected, actual);
        
    }
    
    @Test
    public void eatCorn() {
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        Farm.addCrop(corn);
        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        
        boolean expected = true;
        boolean actual = Corn.getHealth() < 100;
        assertEquals("Predator Damages Corn", expected, actual);
        
    }
    
    @Test
    public void eatRice() {
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        Farm.addCrop(rice);
        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        
        boolean expected = true;
        boolean actual = Rice.getHealth() < 100;
        assertEquals("Predator Damages Rice", expected, actual);
        
    }
    
    @Test
    public void eatWheat() {
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        Farm.addCrop(wheat);
        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        
        boolean expected = true;
        boolean actual = Wheat.getHealth() < 100;
        assertEquals("Predator Damages Wheat", expected, actual);
        
    }
    
    @Test
    public void eatCrops() {
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addCrop(wheat);
        Farm.addCrop(corn);
        Farm.addCrop(rice);
        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        
        boolean expected = true;
        boolean actual = Crops.getHealth() < 100;
        assertEquals("Predator Damages Crops", expected, actual);
        
    }

}