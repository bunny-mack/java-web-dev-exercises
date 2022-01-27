package exercises.technology;

public class Computer extends AbstractEntity {
    private int storage;
    private int ram;
    private String graphicsCard;

    public Computer(int storage, int ram, String graphicsCard) {
        this.storage = storage;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }

    public void increaseRam(int ramNum) {
        this.ram = this.ram + ramNum;
    }

    public void increaseStorage(int storageNum) {
        this.storage = this.storage + storageNum;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

}
