public class Crocodile extends Reptile {

    public Crocodile(int height, int weight, String type, String blood, String phisycal) {
        super(height, weight, type, blood, phisycal);
        this.phisycal = Reptile.this.phisycal;
    }
    
    void ShowInfo();
}
