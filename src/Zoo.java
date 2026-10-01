public class Zoo {
    final int NBR_CAGES = 25;
    Animal[] animals = new Animal[NBR_CAGES];
    int animalCount = 0;
    String name;
    String city;

    /*
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
     */

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }


    public void displayZoo(){
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        //System.out.println("Number of cages: " + nbrCages);
        System.out.println("Number of cages: " + NBR_CAGES);
    }

    @Override
    public String toString() {
        //return "Zoo name: " + name + ", City: " + city + ", Number of cages: " + nbrCages;
        return "Zoo name: " + name + ", City: " + city + ", Number of cages: " + NBR_CAGES;
    }


    /*Instruction 10: Verifier seulement la capacite
    public boolean addAnimal(Animal animal){
        if (animalCount >= animals.length){
            return false;
        } else {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
    }
    */

    //Instruction 12: Verifier la capacite et refuser les doublons
    public boolean addAnimal(Animal animal){
        if (animalCount >= animals.length){
            return false;
        } else if (searchAnimal(animal) != -1){
            return false;
        } else {
            animals[animalCount] = animal ;
            animalCount++;
            return true;
        }
    }

    public void displayAnimals(){
        for (int i=0; i< animalCount; i++){
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for (int i=0 ; i< animalCount ; i++){
            if ( animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        for(int i = 0; i< animalCount; i++){
            if (animals[i].name.equals(animal.name)){
                animals[i] = animals[animalCount -1];
                animals[animalCount-1]=null;
                animalCount--;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull(){
        if (animalCount >= NBR_CAGES ){
            return true;
        }else {
            return false;
        }
    }

    public static Zoo comparerZoo( Zoo z1, Zoo z2){
        if (z1.animalCount >= z2.animalCount){
            return z1;
        } else {
            return z2;
        }
    }
}
