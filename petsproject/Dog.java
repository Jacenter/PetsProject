package petsproject;

public class Dog extends Pet {
    public Dog(String kindOfPet, String nameOfPet) {
        super(kindOfPet, nameOfPet);
    }

    public String speak() {
        return "Woof, Woof";
    }
}
