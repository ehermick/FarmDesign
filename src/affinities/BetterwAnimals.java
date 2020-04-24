package affinities;

//DECORATOR PATTERN
public class BetterwAnimals extends FarmerAffinities {

    public BetterwAnimals(String name, int animalSkill, int cropSkill, int moneySkill) {
        super(name, 2, cropSkill, moneySkill);
    }

}
