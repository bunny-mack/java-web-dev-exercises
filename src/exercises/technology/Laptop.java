package exercises.technology;

public class Laptop extends Computer {
    private double weight;

    public Laptop(int storage, int ram, String graphicsCard, double weight){
        super(storage, ram, graphicsCard);
        this.weight = weight;
    }

    public boolean isClunky(){
        if (weight > 12) {
            return true;
        } else {
            return false;
        }
    }

    public double getWeight(){
        return weight;
    }

}
