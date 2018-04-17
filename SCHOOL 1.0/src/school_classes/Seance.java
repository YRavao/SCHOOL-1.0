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
import java.util.Date;

public class Seance {
    private int idSeance;
    private Groupe groupe;
    private Date dateD;
    private Date dateF;
    private Salle Salle;
    private Matiere matiere;
    private Enseignant enseignant;
    private Etudiant etudiant;

    public Seance() {
    }

    public Seance(int idSeance, Groupe groupe, Date dateDebut, Date dateFin, Salle salle, Matiere matiere, Enseignant enseignant, Etudiant etudiant) {
        this.idSeance = idSeance;
        this.groupe = groupe;
        this.dateD = dateDebut;
        this.dateF = dateFin;
        this.Salle = salle;
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.etudiant = etudiant;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant prof) {
        this.enseignant = prof;
    }

    
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    
    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    
    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Date getDateDebut() {
        return dateD;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateD = dateDebut;
    }

    public Date getDateFin() {
        return dateF;
    }

    public void setDateFin(Date dateFin) {
        this.dateF = dateFin;
    }

    public Salle getSalle() {
        return Salle;
    }

    public void setSalle(Salle salle) {
        this.Salle = salle;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
    
}
