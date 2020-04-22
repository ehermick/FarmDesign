package farm;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import crops.Crops;

import java.util.ArrayList;
import java.util.Random;

import main.Farmers;
//import predators.Predators;


public class Farm {

    private int size;
    //private int numFarmers;
    private  static int currency;
    //private int maxNumFarmers;
    private static ArrayList<Farmers> farmers = new ArrayList<Farmers>();
    //ArrayList<Predators> predators = new ArrayList<Predators>();
    private static ArrayList<Crops> crops = new ArrayList<Crops>();
    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    static Random rand = new Random();
    private  static int currencyChange;
    
    /**
     * Constructor.
     * @param size Size of farm
     * @param currency Currency on farm
     * @param currencyChange Change in currency each day
     */
    public Farm(int size, int currency, int currencyChange) {
        this.size = size;
        setCurrency(currency);
        setCurrencyChange(currencyChange);
    }
    
    /**
     * Farm's currency getter.
     * @return currency Farm's bank
     */
    public int getCurrency() {
        return currency;
    }
    
    /**
     * Farm's currency setter.
     * @param currencyInput Farm's bank
     */
    public static void setCurrency(int currencyInput) {
        currency = currency + currencyInput;
    }
    
    /**
     * Resets the income of the day to 0.
     */
    public static void resetCurrencyChange() {
        currency = 0;
    }
    
    /**
     * Daily income getter.
     * @return currencyChange Income for the day
     */
    public int getCurrencyChange() {
        return currencyChange;
    }
    
    /**
     * Daily income setter.
     * @param currencyChangeInput Income for the day
     */
    public static void setCurrencyChange(int currencyChangeInput) {
        currencyChange = currencyChange + currencyChangeInput;
    }
    
    /**
     * Adds crops to list.
     * @param crop Crop to be added
     */
    public static void addCrop(Crops crop) {
        crops.add(crop);
    }
    
    /**
     * Removes crop from list.
     * @param crop Crop to be removed
     */
    public static void removeCrop(Crops crop) {
        crops.remove(crop);
    }
    
    
    /**
     * Adds animals to list.
     * @param animal Animal to be added
     */
    public static void addAnimal(Animal animal) {
        animals.add(animal);
    }
    
    /**
     * Removed animal from list.
     * @param animal Animal to be removed
     */
    public static void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
    
    /**
     * Adds farmers to list.
     * @param farmer Farmer to be added
     */
    public static void addFarmer(Farmers farmer) {
        farmers.add(farmer);
    }
    
    /**
     * Removes farmer from list.
     * @param farmer Farmer to be removed
     */
    public static void removeFarmer(Farmers farmer) {
        farmers.remove(farmer);
    }

    /**
     * Sets the size of the farm.
     * @param size The size of the farm
     */
    public void setSize(int size) {
        this.size = size;
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
                removeAnimal(selectedAnimal); //Remove animal from list
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
                        addAnimal(chicken);
                    }
                    
                    //If it's a Cow
                    if (selectedAnimal instanceof Cow) {
                        Cow cow = new Cow("Cow", 100, 0, 0, 0);
                        addAnimal(cow);
                    }
                    
                    //If it's a Sheep
                    if (selectedAnimal instanceof Sheep) {
                        Sheep sheep = new Sheep("Sheep", 100, 0, 0, 0);
                        addAnimal(sheep);
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
            //String animalName = selectedAnimal.name;
            
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
            //String cropName = selectedCrop.name;
            
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
    
    /**
     * Getter for farm size.
     * @return size Size of the farm
     */
    public int getSize() {
        return size;
    }
    
    /**
     * Getter for crops size (list of crops).
     * @return int size of crops
     */
    public int getCropsSize() {
        return crops.size();
    }
    
    /**
     * Getter for animals size (list of animals).
     * @return int size of animals
     */
    public int getAnimalsSize() {
        return animals.size();
    }
    


}
