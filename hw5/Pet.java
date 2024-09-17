package hw5;

public class Pet {
    private int id;
    private Animal animalType;
    private String name;

    public Pet() {
    }

    public Pet(int id, Animal animalType, String name) {
        this.id = id;
        this.animalType = animalType;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimalType() {
        return animalType;
    }

    public void setAnimalType(Animal animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", animalType=" + animalType +
                ", name='" + name + '\'' +
                '}';
    }
}
