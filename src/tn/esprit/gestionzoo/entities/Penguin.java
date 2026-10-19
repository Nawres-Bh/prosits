package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    //Instruction 23
    @Override
    public String toString() {
        return super.toString() + ", Swimming depth: " + swimmingDepth;
    }

    //Instruction 26: Question 3
    @Override
    public void swim(){
        System.out.println("This penguin is swimming");
    }
}
