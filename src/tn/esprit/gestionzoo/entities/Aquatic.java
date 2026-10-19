package tn.esprit.gestionzoo.entities;
// Instruction 26: Question 3
public abstract class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    //Instruction 23
    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

    /*Instruction 24
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
    */
    //Instruction 26: Question 3
    public abstract void swim();

    //Instruction 31
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return getName().equals(aquatic.getName())
                    && getAge() == aquatic.getAge()
                    && habitat.equals(aquatic.habitat);
        }
        return false;
    }
}
