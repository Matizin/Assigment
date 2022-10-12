public class Eel extends Fish{

    public Eel(int height, int weight, String type, String blood, String physical2, String habitat) {
        super(height, weight, type, blood, physical2, habitat);
        this.physical2 = Fish.this.phisycal2;
         this.type = "Release electric charge"; 
    }


}