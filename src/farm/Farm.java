package farm;

import animals.Animal;
import animals.Chicken;
import animals.Cow;
import animals.Sheep;
import crops.Corn;
import crops.Crops;
import crops.Rice;
import crops.Wheat;

import java.util.ArrayList;
import java.util.Random;

import main.Farmers;
import predators.Predators;


public class Farm {

    private static int size;
    //private int numFarmers;
    private  static int currency;
    //private int maxNumFarmers;
    private static ArrayList<Farmers> farmers = new ArrayList<Farmers>();
    private static ArrayList<Crops> crops = new ArrayList<Crops>();
    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    static Random rand = new Random();
    private  static int currencyChange;
    
    private static int moneyMade;
    
    /**
     * Constructor.
     * @param size Size of farm
     * @param currency Currency on farm
     * @param currencyChange Change in currency each day
     */
    public Farm(int size, int currency, int currencyChange) {
        setSize(size);
        setCurrency(currency);
        setCurrencyChange(currencyChange);
    }
    
    /**
     * Sets the size of the farm.
     * @param sizeInput The size of the farm
     */
    public static void setSize(int sizeInput) {
        size = sizeInput;
    }
    
    /**
     * Farm's size getter.
     * @return size Farm's size
     */
    public int getSize() {
        return size;
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
        currencyChange = 0;
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
            if (selectedAnimal.age >= 3 && (selectedAnimal.harvestCycle >= 2)) {
                selectedAnimal.harvestCycle = 0; //reset harvest cycle
                
                Animal.harvest(selectedAnimal); //Harvest from animal
                
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
    public static int moneyMade() {
        
        System.out.println("Total day's earnings : " + currencyChange 
                + "       Total in bank : " + currency);
        moneyMade = currencyChange;
        
        currencyChange = 0; //Reset to 0 for next day
        
        return moneyMade;

    }


    /**
     * Replenishes crops when they get too low.
     */
    public static void replenishCrops() {
        
        int cornNum = 0;
        int riceNum = 0;
        int wheatNum = 0;
        
        for (int i = 0; i < crops.size(); i++) {
            Crops selectedCrop = crops.get(i);
            
            if (selectedCrop instanceof Corn) {
                cornNum++;
                
            } else if (selectedCrop instanceof Rice) {
                riceNum++;
                
            } else {
                wheatNum++;
            }
            
        }
        
        if (cornNum == 0) {
            Corn corn = new Corn("Corn", 100, 0, 0, 0);
            
            for (int i = 0; i < 5; i++) {
                addCrop(corn); //Add 5 more plots
            }
            
            setCurrency(-20);
            setCurrencyChange(-20);
            System.out.println("You purchased 5 more plots of Corn");
            
        } 
        if (riceNum == 0) {
            Rice rice = new Rice("Rice", 100, 0, 0, 0);
            
            for (int i = 0; i < 5; i++) {
                addCrop(rice); //Add 5 more plots
            }
            
            setCurrency(-10);
            setCurrencyChange(-10);
            System.out.println("You purchased 5 more plots of Rice");
            
        } 
        if (wheatNum == 0) {
            Wheat wheat = new Wheat("Wheat", 100, 0, 0, 0);
            
            for (int i = 0; i < 5; i++) {
                addCrop(wheat); //Add 5 more plots
            }
            
            
            setCurrency(-50);
            setCurrencyChange(-50);
            System.out.println("You purchased 5 more plots of Wheat");
        }
        
    }
    
    /**
     * Replenishes animals when they get too low.
     */
    public static void replenishAnimals() {
        
        int chickenNum = 0;
        int cowNum = 0;
        int sheepNum = 0;
        
        for (int i = 0; i < animals.size(); i++) {
            Animal selectedAnimal = animals.get(i);
            
            if (selectedAnimal instanceof Chicken) {
                chickenNum++;
                
            } else if (selectedAnimal instanceof Cow) {
                cowNum++;
                
            } else {
                sheepNum++;
            }
            
        }
        
        if (chickenNum == 0) {
            Chicken chicken = new Chicken("Chicken", 100, 0, 0, 0);
            
            for (int i = 0; i < 5; i++) {
                addAnimal(chicken); //Add 5 more chickens
            }
            
            setCurrency(-10);
            setCurrencyChange(-10);
            System.out.println("You purchased 5 more Chickens!");
            
        } 
        if (cowNum == 0) {
            Cow cow = new Cow("Cow", 100, 0, 0, 0);
            
            for (int i = 0; i < 5; i++) {
                addAnimal(cow); //Add 5 more cows
            }
            
            setCurrency(-20);
            setCurrencyChange(-20);
            System.out.println("You purchased 5 more Cows!");
            
        } 
        if (sheepNum == 0) {
            Sheep sheep = new Sheep("Sheep", 100, 0, 0, 0);
            
            for (int i = 0; i < 5; i++) {
                addAnimal(sheep); //Add 5 more sheep
            }
            
            
            setCurrency(-50);
            setCurrencyChange(-50);
            System.out.println("You purchased 5 more Sheep!");
        }
        
    }
    
    public static int getAnimalsSize() {
        return animals.size();
    }
    
    public static int getCropsSize() {
        return crops.size();
    }
    
    public static void resetAnimals() {
        animals.clear();
    }
    
    public static void resetCrops() {
        crops.clear();
    }

    public static ArrayList<Animal> getAnimals() {
        return animals;
    }
    
    public static ArrayList<Crops> getCrops() {
        return crops;
    }


}
