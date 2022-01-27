package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Computer mac = new Computer(500, 16, "Topnotch");
        System.out.println("Current storage: " + mac.getStorage());
        System.out.println("Current RAM: " + mac.getRam());
        mac.increaseRam(4);
        mac.increaseStorage(500);
        System.out.println("Current storage: " + mac.getStorage());
        System.out.println("Current RAM: " + mac.getRam());

        Laptop macbook = new Laptop(500, 32, "The Best", 11);
        System.out.println(macbook.isClunky());
        System.out.println(macbook.getWeight());
        System.out.println(macbook.getStorage());

        Smartphone iPhone = new Smartphone(250, 16, "Pretty Good", 23, 175);
        System.out.println("Current Number of Apps: " + iPhone.getNumApps());
        System.out.println("Current number of photos: " + iPhone.getNumPhotos());
        iPhone.takePhoto();
        iPhone.downloadApp();
        System.out.println("Current Number of Apps: " + iPhone.getNumApps());
        System.out.println("Current number of photos: " + iPhone.getNumPhotos());
        System.out.println(iPhone.getStorage());

        System.out.println("Mac ID: " + mac.getId());
        System.out.println("Macbook ID: " + macbook.getId());
        System.out.println("iPhone ID: " + iPhone.getId());
    }
}
