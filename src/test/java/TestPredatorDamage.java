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
import factory.Farm;

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
    
    @Test
    public void eatChicken() {
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
        boolean actual = chicken.getHealth() == 100;
        assertEquals("Predator Injures Chicken", expected, actual);
        
    }
    
    @Test
    public void eatCow() {
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
        boolean actual = cow.getHealth() == 100;
        assertEquals("Predator Injures Cow", expected, actual);
        
    }
    
    @Test
    public void eatSheep() {
        
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
        boolean actual = sheep.getHealth() == 100;
        assertEquals("Predator Injures Sheep", expected, actual);
        
    }
    
    @Test
    public void eatAnimals() {
        
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
        boolean actual = sheep.getHealth() == 100;
        assertEquals("Predator Injures Animal", expected, actual);
        
    }
    
    @Test
    public void eatCorn() {
        
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
        boolean actual = corn.getHealth() == 100;
        assertEquals("Predator Damages Corn", expected, actual);
        
    }
    
    @Test
    public void eatRice() {
        
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
        boolean actual = rice.getHealth() == 100;
        assertEquals("Predator Damages Rice", expected, actual);
        
    }
    
    @Test
    public void eatWheat() {
        
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
        boolean actual = wheat.getHealth() == 100;
        assertEquals("Predator Damages Wheat", expected, actual);
        
    }
    
    @Test
    public void eatCrops() {
        
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
        boolean actual = wheat.getHealth() == 100;
        assertEquals("Predator Damages Crops", expected, actual);
        
    }

}