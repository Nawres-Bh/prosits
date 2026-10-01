public class ZooManagement {

    public static void main(String[] args) {

        /*
        Animal lion = new Animal();
        Zoo myZoo = new Zoo();

        lion.family = "Lion";
        lion.name = "Simba";
        lion.age = 5;
        lion.isMammal = true;

        myZoo.name = "Zoo de Tunis";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 10;
        */


        /*
        Animal lion = new Animal("Lion", "Simba", 5, true);
        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis", 10);
        */


        Zoo myZoo = new Zoo("Friguia", "Bouficha", 10);

        Animal eagle = new Animal("Bird", "Birdy", 5, false);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal snake = new Animal("Serpentes", "Kobra", 3, false);

        myZoo.displayZoo();


        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        System.out.println(eagle);
        System.out.println(elephant);
        System.out.println(snake);

    }
}
