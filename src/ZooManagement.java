public class ZooManagement {

    public static void main(String[] args) {

        /*Prosit2
        Animal lion = new Animal();
        Zoo myZoo = new Zoo();

        lion.family = "Lion";
        lion.name = "Simba";
        lion.age = 5;
        lion.isMammal = true;

        myZoo.name = "Zoo de Tunis";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 10;

        Animal lion = new Animal("Lion", "Simba", 5, true);
        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 10);
        */


        //Zoo myZoo = new Zoo("Friguia", "Bouficha", 10);
        Zoo myZoo = new Zoo("Friguia", "Bouficha");


        Animal eagle = new Animal("Bird", "Birdy", 5, false);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal snake = new Animal("Serpentes", "Kobra", 3, false);

        //Instruction 10
        System.out.println(myZoo.addAnimal(eagle));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.addAnimal(snake));

        /*Instruction 10: Max capacité
        for (int i=1 ; i<= 25 ; i++){
            boolean added = myZoo.addAnimal(new Animal("Test", "Animal"+i , 1, true));
            System.out.println("Animal"+i+" added "+ added);
        }
         */

        //Instruction 11: Affichage des animals
        myZoo.displayAnimals();

        //Instruction 11: Recherche
        System.out.println(myZoo.searchAnimal(eagle));
        System.out.println(myZoo.searchAnimal(elephant));
        System.out.println(myZoo.searchAnimal(snake));

        //Instruction 11: animal identique
        Animal eagle2 = new Animal("Bird", "Birdy", 5, false);
        System.out.println(myZoo.searchAnimal(eagle2));


        //Instruction 13: supprimer un animal
        System.out.println(myZoo.removeAnimal(elephant));
        myZoo.displayAnimals();

        //Instruction 15; isZooFull , comparerZoo
        Zoo zoo2 = new Zoo("Belvedere", "Tunis");
        zoo2.addAnimal(new Animal("Felidae", "Simba", 5, true));
        zoo2.addAnimal(new Animal("Canidae", "Rex", 3, true));
        zoo2.addAnimal(new Animal("Equidae", "Spirit", 4, true));

        Zoo zoo3 = new Zoo("Hammamet Zoo", "Hammamet");

        System.out.println(myZoo.isZooFull());
        System.out.println(zoo2.isZooFull());

        System.out.println(Zoo.comparerZoo(myZoo, zoo2).name);
        System.out.println(Zoo.comparerZoo(zoo3, zoo2).name);

        /*Prosit2
        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(eagle);
        System.out.println(elephant);
        System.out.println(snake);
         */

    }
}
