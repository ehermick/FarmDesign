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

public class TestHeal {
    
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
    
    
    @Test
    public void injuredChicken() {
        
        chicken = new Chicken();
        
        fox = new Fox("Fox", 10);
        wolf = new Wolf("Wolf", 10);
        rabbit = new Rabbit("Rabbit", 10);
        mole = new Mole("Mole", 10);
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addAnimal(chicken);

        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();

        boolean expected = true;
        boolean actual = (chicken.getHealth() <= 100);
        assertEquals("Predator Injures Chicken", expected, actual);
    }
    
    @Test
    public void injuredCow() {
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        fox = new Fox("Fox", 10);
        wolf = new Wolf("Wolf", 10);
        rabbit = new Rabbit("Rabbit", 10);
        mole = new Mole("Mole", 10);
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addAnimal(cow);

        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        

        
        boolean expected = true;
        boolean actual = (cow.getHealth() <= 100);
        assertEquals("Predator Injures Cow", expected, actual);
    }
    
    @Test
    public void injuredSheep() {

        sheep = new Sheep();  
        
        fox = new Fox("Fox", 10);
        wolf = new Wolf("Wolf", 10);
        rabbit = new Rabbit("Rabbit", 10);
        mole = new Mole("Mole", 10);
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addAnimal(sheep);

        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();

        
        boolean expected = true;
        boolean actual = (sheep.getHealth() <= 100);
        assertEquals("Predator Injures Sheep", expected, actual);
    }
    
    @Test
    public void damagedCorn() {
        corn = new Corn();
        rice = new Rice();
        wheat = new Wheat();
        
        chicken = new Chicken();
        cow = new Cow();
        sheep = new Sheep();  
        
        fox = new Fox("Fox", 10);
        wolf = new Wolf("Wolf", 10);
        rabbit = new Rabbit("Rabbit", 10);
        mole = new Mole("Mole", 10);
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addCrop(corn);

        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();

        
        boolean expected = true;
        boolean actual = (corn.getHealth() <= 100);
        assertEquals("Predator Damages Corn", expected, actual);
    }
    
    @Test
    public void damagedRice() {
        rice = new Rice();
        
        fox = new Fox("Fox", 10);
        wolf = new Wolf("Wolf", 10);
        rabbit = new Rabbit("Rabbit", 10);
        mole = new Mole("Mole", 10);
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addCrop(rice);

        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();

        
        boolean expected = true;
        boolean actual = (rice.getHealth() <= 100);
        assertEquals("Predator Damages Rice", expected, actual);
    }
    
    @Test
    public void damagedWheat() {
        wheat = new Wheat();

        
        fox = new Fox("Fox", 10);
        wolf = new Wolf("Wolf", 10);
        rabbit = new Rabbit("Rabbit", 10);
        mole = new Mole("Mole", 10);
        
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        Farm.addPredator(rabbit);
        Farm.addPredator(mole);
        
        Farm.addCrop(wheat);

        
        //Playing with chance - should happen atleast once
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();
        Predators.damage();

        
        boolean expected = true;
        boolean actual = (wheat.getHealth() <= 100);
        assertEquals("Predator Damages Wheat", expected, actual);
    }

}
