package tn.esprit.gestionemployes.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe emp) {
        for (Employe e : employes) {
            if (e.getId() == emp.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe emp) {
        employes.removeIf(e -> e.getId() == emp.getId());
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade)
                .thenComparing(Employe::getNom));
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}