package petsproject;

public class Cat extends Pet {
    public Cat(String kindOfPet, String nameOfPet) {
        super(kindOfPet, nameOfPet);
    }

    public String speak() {
        return "meow";
    }
}
