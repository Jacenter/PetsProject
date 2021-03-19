package petsproject;


import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    String kindOfPet, nameOfPet;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //scanner that collects system input

        System.out.println("How many pet(s) do you have?");
        int numberOfPets = input.nextInt();

        ArrayList<Pet> petsArray = new ArrayList<Pet>();
        for (int i = 1; i <= numberOfPets; i++) {

            System.out.println("What kind of pet is pet #" + i + ": "); //what kind of pet is the pet at int i
            String kindOfPet = input.next();
            System.out.println("What is that pet's name?");
            String nameOfPet = input.next();

            if ("Dog".equalsIgnoreCase(kindOfPet)) {
                petsArray.add(new Dog(kindOfPet, nameOfPet));
            } else if ("Cat".equalsIgnoreCase(kindOfPet)) {
                petsArray.add(new Cat(kindOfPet, nameOfPet));
            } else if ("Pig".equalsIgnoreCase(kindOfPet)) {
                petsArray.add(new Pig(kindOfPet, nameOfPet));
            }
            //do nothing
        }

        for (Pet petObj : petsArray) {
            System.out.println(petObj.getNameOfPet() + " the " + petObj.getKindOfPet() + " says " + petObj.speak());
        }
    }
}

