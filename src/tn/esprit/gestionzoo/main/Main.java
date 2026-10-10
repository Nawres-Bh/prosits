package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Friguia", "Bouficha");


        Animal eagle = new Animal("Bird", "Birdy", 5, false);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal snake = new Animal("Serpentes", "Kobra", 3, false);

        System.out.println(myZoo.addAnimal(eagle));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.addAnimal(snake));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(eagle));
        System.out.println(myZoo.searchAnimal(elephant));
        System.out.println(myZoo.searchAnimal(snake));

        Animal eagle2 = new Animal("Bird", "Birdy", 5, false);
        System.out.println(myZoo.searchAnimal(eagle2));

        System.out.println(myZoo.removeAnimal(elephant));
        myZoo.displayAnimals();

        Zoo zoo2 = new Zoo("Belvedere", "Tunis");
        zoo2.addAnimal(new Animal("Felidae", "Simba", 5, true));
        zoo2.addAnimal(new Animal("Canidae", "Rex", 3, true));
        zoo2.addAnimal(new Animal("Equidae", "Spirit", 4, true));

        Zoo zoo3 = new Zoo("Hammamet", "Hammamet");

        System.out.println(myZoo.isZooFull());
        System.out.println(zoo2.isZooFull());

        System.out.println(Zoo.comparerZoo(myZoo, zoo2).getName());
        System.out.println(Zoo.comparerZoo(zoo3, zoo2).getName());


        // Instruction 18: Test negative age
        eagle2.setAge(-5);
        System.out.println("Test negative age : " + eagle2.getAge());
        // Instruction 18: Test empty zoo name
        myZoo.setName("");
        System.out.println("Test empty zoo name: " + myZoo.getName());
    }
}
