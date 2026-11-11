package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.entities.SocieteArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ben Ali", "Sami", "IT", 2);
        Employe e2 = new Employe(1, "Trabelsi", "Nour", "RH", 1);
        Employe e3 = new Employe(2, "Gharbi", "Yassine", "IT", 1);
        Employe e4 = new Employe(5, "Mansour", "Amel", "Finance", 3);
        Employe e5 = new Employe(4, "Jlassi", "Omar", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        System.out.println("Liste initiale");
        societe.displayEmploye();

        System.out.println("Tri par id (Comparable)");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Tri par departement, grade, nom (Comparator)");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("Recherche");
        System.out.println(societe.rechercherEmploye("Gharbi"));    // true
        System.out.println(societe.rechercherEmploye("Inconnu"));   // false
        System.out.println(societe.rechercherEmploye(e1));          // true

        System.out.println("Recherche par departement IT");
        List<Employe> it = societe.rechercherParDepartement("IT");
        for (Employe e : it) {
            System.out.println(e);
        }

        System.out.println("Suppression de e1");
        societe.supprimerEmploye(e1);
        System.out.println(societe.rechercherEmploye(e1));          // false
        societe.displayEmploye();
    }
}