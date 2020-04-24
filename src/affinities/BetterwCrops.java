package affinities;

//DECORATOR PATTERN
public class BetterwCrops extends FarmerAffinities {

    public BetterwCrops(String name, int animalSkill, int cropSkill, int moneySkill) {
        super(name, animalSkill, 2, moneySkill);
    }

}
