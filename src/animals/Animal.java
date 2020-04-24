package animals;

//import affinities.AnimalAffinities;
//import farm.AnimalFarm;
//import farm.HybridFarm;
import state.StateContext;

public class Animal {

    public String name;
    public int age;
    private static int health;
    public int birthCycle;
    public int harvestCycle;
    //public static int production;
    //private int productWorth;
    //private AnimalFarm animalFarm;
    //private AnimalAffinities animalAffinities;
    //private HybridFarm hybridFarm;
    
    /**
     * Animal Constructor.
     * @param name Animal name
     * @param health Animal health
     * @param age Animal age
     * @param birthCycle Animal birthcycle
     * @param harvestCycle Animal harvestCycle
     */
    public Animal(String name, int health, int age, int birthCycle, int harvestCycle) {
        this.name = name;
        this.setHealth(health);
        this.age = age;
        this.birthCycle = birthCycle;
        this.harvestCycle = harvestCycle;
    }

    /**
     * Calculates the age of the animal based off the number of cycles.
     * @param animal The animal in question
     */
    public static int animalAge(Animal animal) {
        int calculatedAge = StateContext.getCount() / 2; //1 day + 1 night per cycle
        return animal.age = calculatedAge;
        
       
    }
    
    /**
     * Animals harvest their products.
     */
    public static void harvest(Animal animal) {
        
        //If animal is a chicken
        if (animal instanceof Chicken) {
            Chicken.harvestEggs();
        }
        
        //If animal is a cow
        if (animal instanceof Cow) {
            Cow.harvestMilk();
        }
        
        //If animal is a sheep
        if (animal instanceof Sheep) {
            Sheep.harvestWool();
        }

    }
   



    /**
     * Injured or sick animals (from attacks or disease).
     */
    public void injury() {

    }

    
    public static void damageHealth(int damage) {
        int newHealth = health - damage;
        setHealth(newHealth);
    }
    
    /**
     * Health getter. 
     * @return health Animal's health
     */
    public static int getHealth() {
        return health;
    }

    /**
     * Healther setter.
     * @param health Animal's health
     */
    public static void setHealth(int health) {
        Animal.health = health;
    }
    
    /**
     * Age getter.
     * @return age Animal's age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Age setter.
     * @param age Animal's age
     */
    public void setAge(int age) {
        this.age = age;
    }
    


}
