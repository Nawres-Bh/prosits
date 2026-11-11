package tn.esprit.gestionzoo.entities;

public class Zoo {
    /*
    private final int NBR_CAGES = 25;
    private Animal[] animals = new Animal[NBR_CAGES];
    */
    private final int NBR_CAGES;
    private Animal[] animals;
    //Instruction 25: Question 1
    private final int NBR_AQUATIC_CAGES = 10;
    private Aquatic[] aquaticAnimals = new Aquatic[NBR_AQUATIC_CAGES];
    private int aquaticCount = 0;
    //-----
    private int animalCount = 0;
    private String name;
    private String city;


    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        //Instruction 33: Question 3
        this.NBR_CAGES = 3;
        this.animals = new Animal[NBR_CAGES];
    }

    public int getAnimalCount() {
        return animalCount;
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

    /*
    //Instruction 32
    public void addAnimal(Animal animal){
        if (searchAnimal(animal) == -1){
            animals[animalCount] = animal;
            animalCount++;
        }
    }
    */

    /*
    //Instruction 33: Question 2
    public void addAnimal(Animal animal) throws ZooFullException {
        if (isZooFull()) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter un nouvel animal.");
        }
        if (searchAnimal(animal) == -1){
            animals[animalCount] = animal;
            animalCount++;
        }
    }
    */

    //Instruction 34: Question 2
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (isZooFull()) {
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter un nouvel animal.");
        }
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d'animal invalide : l'âge ne peut pas être négatif.");
        }
        if (searchAnimal(animal) == -1){
            animals[animalCount] = animal;
            animalCount++;
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

    //Instruction 25: Question 2
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < NBR_AQUATIC_CAGES) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
        } else {
            System.out.println("No more space for aquatic animals.");
        }
    }

    //Instruction 26 : Question 1
    public void makeAquaticAnimalsSwim() {
        for (int i=0; i<aquaticCount; i++){
            aquaticAnimals[i].swim();
        }
    }

    //Instruction 27
    public float maxPenguinSwimmingDepth() {
        float max=0;
        for (int i=0;i<aquaticCount; i++){
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (penguin.swimmingDepth > max) {
                    max= penguin.swimmingDepth;
                }
            }
        }
        return max;
    }

    //Instruction 28
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0;
        int penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguins++;
            }
        }
        System.out.println("Number of dolphins: " + dolphins);
        System.out.println("Number of penguins: " + penguins);
    }
}
