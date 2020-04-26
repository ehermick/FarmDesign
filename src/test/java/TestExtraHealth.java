package test.java;

import static org.junit.Assert.assertEquals;

import affinities.DecoratorHealthChicken;
import affinities.DecoratorHealthCorn;
import affinities.DecoratorHealthCow;
import affinities.DecoratorHealthRice;
import affinities.DecoratorHealthSheep;
import affinities.DecoratorHealthWheat;
import animals.Animal;
import animals.Cow;
import crops.Crops;
import farm.Farm;

import org.junit.Test;

import predators.Fox;
import predators.Predators;
import predators.Wolf;

public class TestExtraHealth {
    
    @Test
    public void testChickenExtraHealth() {
        
        Farm.resetAnimals();
        
        DecoratorHealthChicken chicken = new DecoratorHealthChicken("Chicken", 150, 0, 0, 0, 1);
        
        Farm.addAnimal(chicken);
        
        int expectedHealth = 150;
        int actualHealth = chicken.getHealth();
        assertEquals("Chicken Health", expectedHealth, actualHealth);
    }
    
    @Test
    public void testChickenPredator() {
        Farm.resetAnimals();
        
        DecoratorHealthChicken chicken = new DecoratorHealthChicken("Chicken", 150, 0, 0, 0, 1);

        Fox fox = new Fox("Fox", 10);
        Wolf wolf = new Wolf("Wolf", 10);
        
        Farm.addAnimal(chicken);
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        
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
        boolean actual = chicken.getHealth() < 150;
        assertEquals("Predator injures Chicken", expected, actual);
    }
    
    @Test
    public void testCowExtraHealth() {
        
        Farm.resetAnimals();
        
        DecoratorHealthCow cow = new DecoratorHealthCow("Cow", 150, 0, 0, 0, 1);
        
        Farm.addAnimal(cow);
        
        int expectedHealth = 150;
        int actualHealth = cow.getHealth();
        assertEquals("Cow Health", expectedHealth, actualHealth);
    }
    
    @Test
    public void testCowPredator() {
        Farm.resetAnimals();
        
        DecoratorHealthCow cow = new DecoratorHealthCow("Cow", 150, 0, 0, 0, 1);

        Fox fox = new Fox("Fox", 10);
        Wolf wolf = new Wolf("Wolf", 10);
        
        Farm.addAnimal(cow);
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        
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
        boolean actual = cow.getHealth() < 150;
        assertEquals("Predator injures Cow", expected, actual);
    }
    
    @Test
    public void testSheepExtraHealth() {
        
        Farm.resetAnimals();
        
        DecoratorHealthSheep sheep = new DecoratorHealthSheep("Sheep", 150, 0, 0, 0, 1);
        
        Farm.addAnimal(sheep);
        
        int expectedHealth = 150;
        int actualHealth = sheep.getHealth();
        assertEquals("Sheep Health", expectedHealth, actualHealth);
    }
    
    @Test
    public void testSheepPredator() {
        Farm.resetAnimals();
        
        DecoratorHealthSheep sheep = new DecoratorHealthSheep("Sheep", 150, 0, 0, 0, 1);

        Fox fox = new Fox("Fox", 10);
        Wolf wolf = new Wolf("Wolf", 10);
        
        Farm.addAnimal(sheep);
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        
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
        boolean actual = sheep.getHealth() < 150;
        assertEquals("Predator injures Sheep", expected, actual);
    }
    
    @Test
    public void testCornPredator() {
        Farm.resetCrops();
        
        DecoratorHealthCorn corn = new DecoratorHealthCorn("Corn", 150, 0, 0, 1);

        Fox fox = new Fox("Fox", 10);
        Wolf wolf = new Wolf("Wolf", 10);
        
        Farm.addCrop(corn);
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        
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
        boolean actual = corn.getHealth() < 150;
        assertEquals("Predator Damages Corn", expected, actual);
    }
    
    @Test
    public void testRicePredator() {
        Farm.resetCrops();
        
        DecoratorHealthRice rice = new DecoratorHealthRice("Rice", 150, 0, 0, 1);

        Fox fox = new Fox("Fox", 10);
        Wolf wolf = new Wolf("Wolf", 10);
        
        Farm.addCrop(rice);
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        
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
        boolean actual = rice.getHealth() < 150;
        assertEquals("Predator Damages Rice", expected, actual);
    }
    
    @Test
    public void testWheatPredator() {
        Farm.resetCrops();
        
        DecoratorHealthWheat wheat = new DecoratorHealthWheat("Wheat", 150, 0, 0, 1);

        Fox fox = new Fox("Fox", 10);
        Wolf wolf = new Wolf("Wolf", 10);
        
        Farm.addCrop(wheat);
        Farm.addPredator(fox);
        Farm.addPredator(wolf);
        
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
        boolean actual = wheat.getHealth() < 150;
        assertEquals("Predator Damages Wheat", expected, actual);
    }

}
