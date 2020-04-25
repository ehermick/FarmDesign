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
        
        Predators.healDamage();
        
        boolean expected = true;
        boolean actual = Chicken.getHealth() == 100;
        assertEquals("Predator Injures Chicken", expected, actual);
    }
    
    @Test
    public void injuredCow() {
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
        
        Predators.healDamage();
        
        boolean expected = true;
        boolean actual = Cow.getHealth() == 100;
        assertEquals("Predator Injures Cow", expected, actual);
    }
    
    @Test
    public void injuredSheep() {
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
        
        Predators.healDamage();
        
        boolean expected = true;
        boolean actual = Sheep.getHealth() == 100;
        assertEquals("Predator Injures Sheep", expected, actual);
    }
    
    @Test
    public void damagedCorn() {
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
        
        Predators.healDamage();
        
        boolean expected = true;
        boolean actual = Sheep.getHealth() == 100;
        assertEquals("Predator Damages Corn", expected, actual);
    }
    
    @Test
    public void damagedRice() {
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
        
        Predators.healDamage();
        
        boolean expected = true;
        boolean actual = Sheep.getHealth() == 100;
        assertEquals("Predator Damages Rice", expected, actual);
    }
    
    @Test
    public void damagedWheat() {
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
        
        Predators.healDamage();
        
        boolean expected = true;
        boolean actual = Sheep.getHealth() == 100;
        assertEquals("Predator Damages Wheat", expected, actual);
    }

}
