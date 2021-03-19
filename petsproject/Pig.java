package petsproject;

public class Pig extends Pet {
    public Pig(String kindOfPet, String nameOfPet) {
        super(kindOfPet, nameOfPet);
    }

    public String speak(){
        return "Oink, Oink";
    }
}
