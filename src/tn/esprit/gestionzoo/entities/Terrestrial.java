package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    //Instruction 23
    @Override
    public String toString() {
        return super.toString() + ", Number of legs: " + nbrLegs;
    }
}
