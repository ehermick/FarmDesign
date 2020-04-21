package farm;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import crops.Crops;

import java.util.ArrayList;
import java.util.Random;

import main.Farmers;
import predators.Predators;



public class Farm {

    private int size;
    private int numFarmers;
    public static int currency = 0;
    private int maxNumFarmers;
    ArrayList<Farmers> farmers = new ArrayList<Farmers>();
    ArrayList<Predators> predators = new ArrayList<Predators>();
    public static ArrayList<Crops> crops = new ArrayList<Crops>();
    public static ArrayList<Animal> animals = new ArrayList<Animal>();

    static Random rand = new Random();
    public static int currencyChange; //Tracks the amount of money made each day

    /**
     * Sets the size of the farm.
     * @param size The size of the farm
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Add farmers to farm.
     * @param farmer The farmer being added
     */
    public void addFarmers(Farmers farmer) {
        farmers.add(farmer);
    }

    /**
     * Dead animals. Death either when 14 or when attacked
     */
    public static void death() {
        
        for (int i = 0; i < animals.size(); i++) {
            Animal selectedAnimal = animals.get(i);
            String animalName = selectedAnimal.name;
            
            //If the animal is 14 days or older they die
            if (Animal.animalAge(selectedAnimal) >= 14) {
                animals.remove(i); //Remove animal from list
                System.out.println("You lost one " + animalName);
            }
        }

    }
    
    /**
     * Birth of an animal.
     */
    public static void birth() {
        
        for (int i = 0; i < animals.size(); i++) {
            Animal selectedAnimal = animals.get(i);
            String animalName = selectedAnimal.name;
            
            //If the animal is older than 2 days
            if (Animal.animalAge(selectedAnimal) >= 2) {
                
                int chance = rand.nextInt(10); //Generate random number for chance
                
                //If the birth cycle is atleast 4 and the chance occurs (high chance)
                if (selectedAnimal.birthCycle >= 4 && (chance % 2 == 0)) {
                    selectedAnimal.birthCycle = 0; //Reset to 0
                    
                    //If it's a chicken
                    if (selectedAnimal instanceof Chicken) {
                        Chicken chicken = new Chicken("Chicken", 100, 0, 0, 0);
                        animals.add(chicken);
                    }
                    
                    //If it's a Cow
                    if (selectedAnimal instanceof Cow) {
                        Cow cow = new Cow("Cow", 100, 0, 0, 0);
                        animals.add(cow);
                    }
                    
                    //If it's a Sheep
                    if (selectedAnimal instanceof Sheep) {
                        Sheep sheep = new Sheep("Sheep", 100, 0, 0, 0);
                        animals.add(sheep);
                    }
                    
                    System.out.println("You gained one " + animalName);
                    
                } else {
                
                    selectedAnimal.birthCycle++; //Increment birthCycle
                }
            }
        }
    }
    
    /**
     * Harvests from animals (if older than 3).
     */
    public static void harvestProduce() {
        
        for (int i = 0; i < animals.size(); i++) {
            Animal selectedAnimal = animals.get(i);
            String animalName = selectedAnimal.name;
            
            //If animal is atleast 3 days old AND harvest cycle is atleast 2 days
            if (Animal.animalAge(selectedAnimal) >= 3 && (selectedAnimal.harvestCycle >= 2)) {
                selectedAnimal.harvestCycle = 0; //reset harvest cycle
                
                int chance = rand.nextInt(10); //Random number for chance
                
                if (chance == 2 || chance == 4 || chance == 8) {
                    Animal.harvest(selectedAnimal); //Harvest from animal
                } else {
                    selectedAnimal.harvestCycle++; //increment animal's harvest cycle
                }
                
            } else {
                selectedAnimal.harvestCycle++; //increment animal's harvest cycle
            }
        }
        
    }
    
    /**
     * Harvests from crops.
     */
    public static void harvestCrops() {
        
        for (int i = 0; i < crops.size(); i++) {
            Crops selectedCrop = crops.get(i);
            String cropName = selectedCrop.name;
            
            //Crops harvested only once every 3 cycles (no chance needed)
            if (selectedCrop.harvestCycle >= 3) {
                selectedCrop.harvestCycle = 0; //reset harvest cycle
                
                Crops.harvest(selectedCrop); //harvest crop
                
            } else {
                selectedCrop.harvestCycle++; //increment crop's harvest cycle
            }
            
            
        }
    }
    
    /**
     * Tracks the money made for the day. 
     */
    public static void moneyMade() {
        
        System.out.println("Total day's earnings : " + currencyChange);
        currencyChange = 0; //Reset to 0 for next day

    }


}
