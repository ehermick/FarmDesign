package test.java;

import static org.junit.Assert.assertEquals;

import factory.Farm;
import main.NewFarm;

import org.junit.Test;

public class TestNewFarm {
    
    @Test
    public void newFarmTestAnimals() {
        
        Farm.resetAnimals();
        Farm.resetCrops();
        
        NewFarm.buildFarm(); //build a new farm
        
        //Test expected size of animals
        int expected = 6;
        int actual = Farm.getAnimalsSize();
        assertEquals("Expected animals size", expected, actual);
        
    }
    
    @Test
    public void newFarmTestCrops() {
        Farm.resetAnimals();
        Farm.resetCrops();
        
        NewFarm.buildFarm();
        
        int expected = 15;
        int actual = Farm.getCropsSize();
        assertEquals("Expected crops size", expected, actual);
    }
    
    @Test
    public void newFarmTestFarmers() {
        Farm.resetAnimals();
        Farm.resetCrops();
        
        NewFarm.buildFarm();
        
        int expected = 3;
        int actual = Farm.getFarmersSize();
        assertEquals("Expected farmers size", expected, actual);
        
        Farm.resetAnimals();
        Farm.resetCrops();
    }

}
