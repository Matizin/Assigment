public class Fish extends Animal{

    private String phisycal2;
    private String habitat;

    public Fish(int height, int weight, String type, String blood, String physical2, String habitat) {
        super(height, weight, type, blood);

        this.phisycal2 = "Has gills";
        this.habitat = "Lives in water";
    }
    
}
