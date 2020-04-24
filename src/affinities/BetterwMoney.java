package affinities;

//DECORATOR PATTERN
public class BetterwMoney extends FarmerAffinities {

    public BetterwMoney(String name, int animalSkill, int cropSkill, int moneySkill) {
        super(name, animalSkill, cropSkill, 2);
    }

}
