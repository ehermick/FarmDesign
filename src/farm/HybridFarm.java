package farm;

import animals.Animal;
import crops.Crops;

import java.util.ArrayList;


public class HybridFarm extends Farm {

    private int numAnimals;
    private int numCrops;
    private int maxNumAnimals;
    private int maxNumCrops;
    ArrayList<Crops> crops = new ArrayList<Crops>();
    ArrayList<Animal> animals = new ArrayList<Animal>();

    
    /**
     * Adds animals
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    
    /**
     * Adds crops
     */
    public void addCrops(Crops crop) {
        crops.add(crop);
    }

    /**
     * Sells animal products.
     */
    public void sellAnimalProducts() {

    }

    /**
     * Sells crops.
     */
    public void sellCrops() {

    }

}
