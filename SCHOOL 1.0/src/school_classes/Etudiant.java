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
public class Etudiant extends Individu{
    private int idGroupe;
    private String Competence;
    private String assiduite;
    private String classe;
    private Groupe groupe;

    public Etudiant() {
    }
//Constructeur
    public Etudiant(String skill, String assiduite, String classe, int idindividu, String nom, String prenom, int telephone, String mail) {
        super(idindividu, nom, prenom, telephone, mail);
        this.Competence = skill;
        this.assiduite = assiduite;
        this.classe = classe;
    }

// Getter et setter 
    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Groupe getGroupe() {
        return groupe;
    }

     public int getIdGroupe() {
        return idGroupe;
    }
    
    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getCompetence() {
        return Competence;
    }
    
    public void setCompetence(String skill) {
        this.Competence = skill;
    }

    public String getAssiduite() {
        return assiduite;
    }
    
    public void setAssiduite(String assiduite) {
        this.assiduite = assiduite;
    }

    public String getClasse() {
        return classe;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    
}
