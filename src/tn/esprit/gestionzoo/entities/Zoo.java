package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final int NBR_CAGES = 25;
    private Animal[] animals = new Animal[NBR_CAGES];
    private int animalCount = 0;
    private String name;
    private String city;


    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo(){
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "Zoo name: " + name + ", City: " + city + ", Number of cages: " + NBR_CAGES;
    }

    //Instruction 17: Utiliser la methode isZooFull()
    public boolean addAnimal(Animal animal){
        if (isZooFull()){
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
            if ( animals[i].getName().equals(animal.getName())){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        for(int i = 0; i< animalCount; i++){
            if (animals[i].getName().equals(animal.getName())){
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
