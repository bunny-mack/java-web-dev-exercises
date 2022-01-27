package exercises.technology;

public abstract class AbstractEntity {

    private static int count = 0;
    private int id;

    public AbstractEntity() {
        this.id = ++count;
    }

    public int getId(){
        return this.id;
    }
}
