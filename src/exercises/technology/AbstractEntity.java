package exercises.technology;

public abstract class AbstractEntity {
    private static int id;

    public AbstractEntity() {
        this.id = this.id + 1;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
