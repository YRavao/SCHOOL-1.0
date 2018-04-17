/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_classes;

/**
 *
 * @author Yolive
 */
public class Classe {
    private String Annee;
    private String Filiere;
    private String NomClasse;
    private Etudiant Etudiant;
    private Matiere matiere;

   
    public Classe() {
    }

    public Classe(String annee, String filiere, Etudiant etudiant, Matiere matiere) {
        this.Annee = annee;
        this.Filiere = filiere;
        this.NomClasse = filiere + "-" + Annee;
        this.Etudiant = etudiant;
        this.matiere = matiere;
    }

    
    public String getAnnee() {
        return Annee;
    }

    public void setAnnee(String annee) {
        this.Annee = annee;
    }

    
    public String getFiliere() {
        return Filiere;
    }

    public void setFiliere(String filiere) {
        this.Filiere = filiere;
    }

    
    public String getNomClasse() {
        return NomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.NomClasse = nomClasse;
    }

    
    public Etudiant getEtudiant() {
        return Etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.Etudiant = etudiant;
    }

    
    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
    
 }