package petsproject;

public class Pet {

    public String kindOfPet;
    public String nameOfPet;


    public Pet(String kindOfPet, String nameOfPet){
        this.kindOfPet = kindOfPet;
        this.nameOfPet = nameOfPet;
    }

    public String getKindOfPet(){
        return kindOfPet;
    }

    public String getNameOfPet(){
        return nameOfPet;
    }

    public String speak(){
        return "";
    }
}
