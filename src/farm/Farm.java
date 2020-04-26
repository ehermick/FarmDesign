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

import affinities.DecoratorHealthChicken;
import affinities.DecoratorHealthCorn;
import affinities.DecoratorHealthCow;
import affinities.DecoratorHealthRice;
import affinities.DecoratorHealthSheep;
import affinities.DecoratorHealthWheat;
import affinities.DecoratorProdChicken;
import affinities.DecoratorProdCorn;
import affinities.DecoratorProdCow;
import affinities.DecoratorProdRice;
import affinities.DecoratorProdSheep;
import affinities.DecoratorProdWheat;
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
    private static ArrayList<Predators> predators = new ArrayList<Predators>();

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
    public static int getCurrency() {
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
        
        if (animal instanceof Chicken) {
            animal.setName("Chicken");
        }
        
        if (animal instanceof Cow) {
            animal.setName("Cow");
        }
        
        if (animal instanceof Sheep) {
            animal.setName("Sheep");
        }
    }
    
    /**
     * Removed animal from list.
     * @param animal Animal to be removed
     */
    public static void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
    
    /**
     * Adds predators to list.
     * @param predator Predator to be added
     */
    public static void addPredator(Predators predator) {
        predators.add(predator);
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
            String animalName = selectedAnimal.getName();
            
            //If the animal is 14 days or older they die
            if (Animal.animalAge(selectedAnimal) >= 14) {
                removeAnimal(selectedAnimal); //Remove animal from list
                System.out.println("You lost one " + animalName + " to old age");
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
                int superChance = rand.nextInt(10); //Random number for chance of SUPER animal
                
                //If the birth cycle is atleast 4 and the chance occurs (high chance of even number)
                if (selectedAnimal.birthCycle >= 4 && (chance % 2 == 0)) {
                    selectedAnimal.birthCycle = 0; //Reset to 0
                    
                    //If it's a chicken
                    if (selectedAnimal instanceof Chicken) {
                        
                        if (superChance == 2) {
                            DecoratorHealthChicken superHealthChicken = new DecoratorHealthChicken("Chicken", 150, 0, 0, 0, 1);
                            addAnimal(superHealthChicken);
                            System.out.println("You gained one SUPER healthy Chicken!");
                        } else if (superChance == 6) {
                            DecoratorProdChicken superProdChicken = new DecoratorProdChicken("Chicken", 100, 0, 0, 0, 2);
                            addAnimal(superProdChicken);
                            System.out.println("You gained one SUPER producing Chicken!");
                        } else {
                            Chicken chicken = new Chicken();
                            addAnimal(chicken);
                            System.out.println("You gained one " + animalName);
                        }
                    }
                    
                    //If it's a Cow
                    if (selectedAnimal instanceof Cow) {
                        
                        if (superChance == 2) {
                            DecoratorHealthCow superHealthCow = new DecoratorHealthCow("Cow", 150, 0, 0, 0, 1);
                            addAnimal(superHealthCow);
                            System.out.println("You gained one SUPER healthy Cow!");
                        } else if (superChance == 6) {
                            DecoratorProdCow superProdCow = new DecoratorProdCow("Cow", 100, 0, 0, 0, 2);
                            addAnimal(superProdCow);
                            System.out.println("You gained one SUPER producing Cow!");
                        } else {
                            Cow cow = new Cow();
                            addAnimal(cow);
                            System.out.println("You gained one " + animalName);
                        }
                    }
                    
                    //If it's a Sheep
                    if (selectedAnimal instanceof Sheep) {
                        if (superChance == 2) {
                            DecoratorHealthSheep superHealthSheep = new DecoratorHealthSheep("Sheep", 150, 0, 0, 0, 1);
                            addAnimal(superHealthSheep);
                            System.out.println("You gained one SUPER healthy Sheep!");
                        } else if (superChance == 6) {
                            DecoratorProdSheep superProdSheep = new DecoratorProdSheep("Sheep", 100, 0, 0, 0, 2);
                            addAnimal(superProdSheep);
                            System.out.println("You gained one SUPER producing Sheep!");
                        } else {
                            Sheep sheep = new Sheep();
                            addAnimal(sheep);
                            System.out.println("You gained one " + animalName);
                        }
                    }
                    
                    
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
        
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total day's earnings : " + currencyChange 
                + "       Total in bank : " + currency);
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        
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
            int superChance = rand.nextInt(10); //Random number for chance of SUPER crop
            if (superChance == 3 || superChance == 5) { //SUPER crop
                //Super corn
                DecoratorHealthCorn superHealthCorn = new DecoratorHealthCorn("Corn", 150, 0, 0, 1);
                addCrop(superHealthCorn);
                
                //Regular corn
                Corn corn = new Corn();
                
                for (int i = 0; i < 4; i++) {
                    addCrop(corn); //Add 4 more plots (total 5 plots added)
                }
                
                setCurrency(-20);
                setCurrencyChange(-20);
                System.out.println("You purchased 5 more plots of Corn - One of them is SUPER healthy! (-$20)"); 
            } else if (superChance == 7 || superChance == 9) { //SUPER crop
                
                DecoratorProdCorn superProdCorn = new DecoratorProdCorn("Corn", 100, 0, 0, 2);
                addCrop(superProdCorn);
                
                //Regular Corn
                Corn corn = new Corn();
                
                for (int i = 0; i < 4; i++) {
                    addCrop(corn);
                }
                
                setCurrency(-20);
                setCurrencyChange(-20);
                System.out.println("You purchased 5 more plots of Corn - One of them is SUPER producing! (-$20)");
                
            } else { //Normal crop
                Corn corn = new Corn();
                
                for (int i = 0; i < 5; i++) {
                    addCrop(corn); //Add 5 more plots
                }
                
                setCurrency(-20);
                setCurrencyChange(-20);
                System.out.println("You purchased 5 more plots of Corn (-$20)");
            }
            
            
        } 
        if (riceNum == 0) {
            int superChance = rand.nextInt(10); //Random number for chance of SUPER crop
            if (superChance == 3 || superChance == 5) { //SUPER crop
                //Super rice
                DecoratorHealthRice superHealthRice = new DecoratorHealthRice("Rice", 150, 0, 0, 1);
                addCrop(superHealthRice);
                
                //Regular rice
                Rice rice = new Rice();
                
                for (int i = 0; i < 4; i++) {
                    addCrop(rice); //Add 4 more plots (total 5 plots added)
                }
                
                setCurrency(-10);
                setCurrencyChange(-10);
                System.out.println("You purchased 5 more plots of Rice - One of them is SUPER healthy! (-$10)"); 
            } else if (superChance == 7 || superChance == 9) { //SUPER crop
                
                DecoratorProdRice superProdRice = new DecoratorProdRice("Rice", 100, 0, 0, 2);
                addCrop(superProdRice);
                
                //Regular Rice
                Rice rice = new Rice();
                
                for (int i = 0; i < 4; i++) {
                    addCrop(rice);
                }
                
                setCurrency(-10);
                setCurrencyChange(-10);
                System.out.println("You purchased 5 more plots of Rice - One of them is SUPER producing! (-$10)");
                
            } else { //Normal Crop
                Rice rice = new Rice();
                
                for (int i = 0; i < 5; i++) {
                    addCrop(rice); //Add 5 more plots
                }
                
                setCurrency(-10);
                setCurrencyChange(-10);
                System.out.println("You purchased 5 more plots of Rice (-$10)");
            }

            
        } 
        if (wheatNum == 0) {
            int superChance = rand.nextInt(10); //Random number for chance of SUPER crop
            if (superChance == 3 || superChance == 5) { //SUPER CROP
                //Super wheat
                DecoratorHealthWheat superHealthWheat = new DecoratorHealthWheat("Wheat", 150, 0, 0, 1);
                addCrop(superHealthWheat);
                
                //Regular wheat
                Wheat wheat = new Wheat();
                
                for (int i = 0; i < 4; i++) {
                    addCrop(wheat); //Add 4 more plots (total 5 plots added)
                }
                
                setCurrency(-50);
                setCurrencyChange(-50);
                System.out.println("You purchased 5 more plots of Wheat - One of them is SUPER healthy! (-$50)"); 
            } else if (superChance == 7 || superChance == 9) { //SUPER crop
                
                DecoratorProdWheat superProdWheat = new DecoratorProdWheat("Wheat", 100, 0, 0, 2);
                addCrop(superProdWheat);
                
                //Regular wheat
                Wheat wheat = new Wheat();
                
                for (int i = 0; i < 4; i++) {
                    addCrop(wheat);
                }
                
                setCurrency(-50);
                setCurrencyChange(-50);
                System.out.println("You purchased 5 more plots of Wheat - One of them is SUPER producing! (-$50)");
                
            } else { //Normal crop
                Wheat wheat = new Wheat();
                
                for (int i = 0; i < 5; i++) {
                    addCrop(wheat); //Add 5 more plots
                }
                
                setCurrency(-50);
                setCurrencyChange(-50);
                System.out.println("You purchased 5 more plots of Wheat (-$50)");
            }
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
            
            int superChance = rand.nextInt(10); //Random number for chance of SUPER animal
            if (superChance == 3 || superChance == 5) { //SUPER Animal
                //Super chicken
                DecoratorHealthChicken superHealthChicken = new DecoratorHealthChicken("Chicken", 150, 0, 0, 0, 1);
                addAnimal(superHealthChicken);
                
                //Regular chicken
                Chicken chicken = new Chicken();
                
                for (int i = 0; i < 4; i++) {
                    addAnimal(chicken); //Add 4 more animals (total of 5)
                }
                
                setCurrency(-10);
                setCurrencyChange(-10);
                System.out.println("You purchased 5 more chickens - One of them is SUPER healthy! (-$10)"); 
            } else if (superChance == 7 || superChance == 9) { //SUPER animal
                
                DecoratorProdChicken superProdChicken = new DecoratorProdChicken("Chicken", 100, 0, 0, 0, 2);
                addAnimal(superProdChicken);
                
                //Regular chicken
                Chicken chicken = new Chicken();
                
                for (int i = 0; i < 4; i++) {
                    addAnimal(chicken);
                }
                
                setCurrency(-10);
                setCurrencyChange(-10);
                System.out.println("You purchased 5 more chickens - One of them is SUPER producing! (-$10)");
                
            } else { //Normal animal
                Chicken chicken = new Chicken();
                
                for (int i = 0; i < 5; i++) {
                    addAnimal(chicken); //Add 5 more chickens
                }
                
                setCurrency(-10);
                setCurrencyChange(-10);
                System.out.println("You purchased 5 more chickens! (-$10)");
            }
            
        } 
        if (cowNum == 0) {
            int superChance = rand.nextInt(10); //Random number for chance of SUPER animal
            if (superChance == 3 || superChance == 5) { //SUPER Animal
                //Super cow
                DecoratorHealthCow superHealthCow = new DecoratorHealthCow("Cow", 150, 0, 0, 0, 1);
                addAnimal(superHealthCow);
                
                //Regular cow
                Cow cow = new Cow();
                
                for (int i = 0; i < 4; i++) {
                    addAnimal(cow); //Add 4 more animals (total of 5)
                }
                
                setCurrency(-20);
                setCurrencyChange(-20);
                System.out.println("You purchased 5 more cows - One of them is SUPER healthy! (-$20)"); 
            } else if (superChance == 7 || superChance == 9) { //SUPER animal
                
                DecoratorProdCow superProdCow = new DecoratorProdCow("Cow", 100, 0, 0, 0, 2);
                addAnimal(superProdCow);
                
                //Regular cow
                Cow cow = new Cow();
                
                for (int i = 0; i < 4; i++) {
                    addAnimal(cow);
                }
                
                setCurrency(-20);
                setCurrencyChange(-20);
                System.out.println("You purchased 5 more cows - One of them is SUPER producing! (-$20)");
                
            } else { //Normal animal
                Cow cow = new Cow();
                
                for (int i = 0; i < 5; i++) {
                    addAnimal(cow); //Add 5 more cows
                }
                
                setCurrency(-20);
                setCurrencyChange(-20);
                System.out.println("You purchased 5 more cows! (-$20)");
            }
            
        } 
        if (sheepNum == 0) {
            int superChance = rand.nextInt(10); //Random number for chance of SUPER animal
            if (superChance == 3 || superChance == 5) { //SUPER Animal
                //Super sheep
                DecoratorHealthSheep superHealthSheep = new DecoratorHealthSheep("Sheep", 150, 0, 0, 0, 1);
                addAnimal(superHealthSheep);
                
                //Regular sheep
                Sheep sheep = new Sheep();
                
                for (int i = 0; i < 4; i++) {
                    addAnimal(sheep); //Add 4 more animals (total of 5)
                }
                
                setCurrency(-50);
                setCurrencyChange(-50);
                System.out.println("You purchased 5 more sheep - One of them is SUPER healthy! (-$50)"); 
            } else if (superChance == 7 || superChance == 9) { //SUPER animal
                
                DecoratorProdSheep superProdSheep = new DecoratorProdSheep("Sheep", 100, 0, 0, 0, 2);
                addAnimal(superProdSheep);
                
                //Regular sheep
                Sheep sheep = new Sheep();
                
                for (int i = 0; i < 4; i++) {
                    addAnimal(sheep);
                }
                
                setCurrency(-50);
                setCurrencyChange(-50);
                System.out.println("You purchased 5 more sheep - One of them is SUPER producing! (-$50)");
                
            } else { //Normal animal
                Sheep sheep = new Sheep();
                
                for (int i = 0; i < 5; i++) {
                    addAnimal(sheep); //Add 5 more sheep
                }
                
                setCurrency(-50);
                setCurrencyChange(-50);
                System.out.println("You purchased 5 more sheep! (-$50)");
            }
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
