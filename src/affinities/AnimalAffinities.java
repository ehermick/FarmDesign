package affinities;

import animals.Animal;

//DECORATOR PATTERN
public class AnimalAffinities extends Animal {
    public AnimalAffinities(String name, int health, int age, int birthCycle, int harvestCycle) {
        super(name, health, age, birthCycle, harvestCycle);
    }

}
