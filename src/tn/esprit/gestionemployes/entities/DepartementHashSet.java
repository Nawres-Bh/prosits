package tn.esprit.gestionemployes.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    // Natural order (Comparable): by id
    @Override
    public void trierDepartementsParId() {
        List<Departement> liste = new ArrayList<>(departements);
        Collections.sort(liste);
        for (Departement d : liste) {
            System.out.println(d);
        }
    }

    // Custom order (Comparator): name, then number of employees
    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> liste = new ArrayList<>(departements);
        liste.sort(Comparator
                .comparing(Departement::getNomDepartement)
                .thenComparingInt(Departement::getNombreEmployes));
        for (Departement d : liste) {
            System.out.println(d);
        }
    }
}