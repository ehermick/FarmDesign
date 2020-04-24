package main;

//import affinities.FarmerAffinities;
//import farm.Farm;

public class Farmers {
    public String name;
    public int animalSkill;
    public int cropSkill;
    public int moneySkill;
    
    /**
     * Constructor.
     * @param name Farmer's name
     * @param animalSkill Farmer's skill with animals
     * @param cropSkill Farmer's skill with crops
     * @param moneySkill Farmer's skill with money
     */
    public Farmers(String name, int animalSkill, int cropSkill, int moneySkill) {
        this.name = name;
        this.animalSkill = animalSkill;
        this.cropSkill = cropSkill;
        this.moneySkill = moneySkill;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAnimalSkill(int skill) {
        this.animalSkill = skill;
    }
    
    public int getAnimalSkill() {
        return animalSkill;
    }
    
    public void setCropSkill(int skill) {
        this.cropSkill = skill;
    }
    
    public int getCropSkill() {
        return cropSkill;
    }
    
    public void setMoneySkill(int skill) {
        this.moneySkill = skill;
    }

    public int getMoneySkill() {
        return moneySkill;
    }
    
    public void buyAnimal() {

    }
    
    public void buyCrop() {

    }

    public void treatAnimal() {

    }

    public void treatCrop() {

    }



}
