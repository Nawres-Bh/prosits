package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.entities.SocieteArrayList;
import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.entities.DepartementHashSet;

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

        //Prosit 9: departements
        DepartementHashSet depts = new DepartementHashSet();

        Departement d1 = new Departement(3, "IT", 10);
        Departement d2 = new Departement(1, "RH", 4);
        Departement d3 = new Departement(2, "Finance", 6);
        Departement d4 = new Departement(4, "IT", 8);
        Departement doublon = new Departement(1, "RH", 99); // same id and name as d2

        depts.ajouterDepartement(d1);
        depts.ajouterDepartement(d2);
        depts.ajouterDepartement(d3);
        depts.ajouterDepartement(d4);
        depts.ajouterDepartement(doublon); // rejected by the HashSet

        System.out.println("Departements (HashSet, ordre non garanti)");
        depts.afficherDepartements();

        System.out.println("Tri par id (Comparable)");
        depts.trierDepartementsParId();

        System.out.println("Tri par nom puis nombre d'employes (Comparator)");
        depts.trierDepartementsParNomEtNombreEmployes();

        System.out.println("Recherche");
        System.out.println(depts.rechercherDepartement("IT"));
        System.out.println(depts.rechercherDepartement("Marketing"));
        System.out.println(depts.rechercherDepartement(d2));            // true
        System.out.println(depts.rechercherDepartement(new Departement(1, "RH", 0)));

        System.out.println("--- Suppression de d2 ---");
        depts.supprimerDepartement(d2);
        System.out.println(depts.rechercherDepartement(d2));            // false
        depts.afficherDepartements();
    }
}