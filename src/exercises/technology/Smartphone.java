package exercises.technology;

public class Smartphone extends Computer{
    private int numApps;
    private int numPhotos;

    public Smartphone(int storage, int ram, String graphicsCard, int numApps, int numPhotos) {
        super(storage, ram, graphicsCard);
        this.numApps = numApps;
        this.numPhotos = numPhotos;
    }

    public void takePhoto(){
        this.numPhotos = this.numPhotos +1;
    }

    public void downloadApp(){
        this.numApps = this.numApps +1;
    }

    public int getNumApps() {
        return numApps;
    }

    public int getNumPhotos() {
        return numPhotos;
    }
}
