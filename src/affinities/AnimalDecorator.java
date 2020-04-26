package affinities;

import animals.Animal;

public abstract class AnimalDecorator extends Animal {

    @Override
    public String name() {
        return null;
    }

    @Override
    public abstract int health();

    @Override
    public abstract int age();

    @Override
    public abstract int birthCycle();

    @Override
    public abstract int harvestCycle();
    

}
