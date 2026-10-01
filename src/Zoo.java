public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo(){
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo name: " + name + ", City: " + city + ", Number of cages: " + nbrCages;
    }
}
