package factory;

public class FarmFactory {
    
    /**
     * Builds farm based on type.
     * @param type Farm type
     * @return Farm Newly built farm
     */
    public static Farm buildFarm(FarmType type) {
        Farm farm = null;
        switch (type) {
            case ANIMAL:
                farm = new AnimalFarm();
                break;
            case CROP:
                farm = new CropFarm();
                break;
            case HYBRID:
                farm = new HybridFarm();
                break;
            
            default:
                break;
        }
        
        return farm;
    }

}
