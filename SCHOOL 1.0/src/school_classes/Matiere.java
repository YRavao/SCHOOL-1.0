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
public class Matiere {
    private int idMatiere;
    private String nom;
    private Enseignant enseignant;
    private Examen examen;

    public Matiere() {
    }
    
    public Matiere(int idMatiere, String nom, Enseignant prof, Examen partiel) {
        this.idMatiere = idMatiere;
        this.nom = nom;
        this.enseignant = prof;
        this.examen = partiel;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant prof) {
        this.enseignant = prof;
    }

    
    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen partiel) {
        this.examen = partiel;
    }

}