package tn.esprit.gestionemployes.entities;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.TreeMap;
//Instruction 1
public class AffectationHashMap {
    private  HashMap<Employe, Departement> affectations = new HashMap<>();
    //Instruction 2
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }
    //Instruction 3.a
    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
    }
    //Instruction 4
    public void supprimerEmploye(Employe e){
        affectations.remove(e);
    }
    //Instruction 5
    public void supprimerEmployeEtDepartement(Employe e,Departement d){
        affectations.remove(e,d);
    }
    //Instruction 6
    public void afficherEmployes(){
        for (Employe e : affectations.keySet()){
            System.out.println(e);
        }
    }
    //Instruction 7
    public void afficherDepartements (){
        for (Departement d: new HashSet<>(affectations.values())) {
            System.out.println(d);
        }
    }
    //Instruction 8
    public boolean rechercherEmploye(Employe e){
        return affectations.containsKey(e);
    }
    //Instruction 9
    public boolean rechercherDepartement(Departement d){
        return affectations.containsValue(d);
    }
    //INstruction 10
    public TreeMap<Employe,Departement> trierMap(){
        return new TreeMap<>(affectations);
    }
}
